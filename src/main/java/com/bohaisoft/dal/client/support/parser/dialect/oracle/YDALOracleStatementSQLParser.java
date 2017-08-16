package com.bohaisoft.dal.client.support.parser.dialect.oracle;

import java.util.Set;

import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.statement.SQLDeleteStatement;
import com.alibaba.druid.sql.ast.statement.SQLTruncateStatement;
import com.alibaba.druid.sql.ast.statement.SQLUpdateStatement;
import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleInsertStatement;
import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleMergeStatement;
import com.alibaba.druid.sql.dialect.oracle.parser.OracleStatementParser;
import com.alibaba.druid.sql.parser.ParserException;
import com.bohaisoft.dal.client.support.parser.SQLParserHelper;

public class YDALOracleStatementSQLParser {

	public static void parseSQL(Set<String> tableSet, String sql, SqlType type) {
		OracleStatementParser sp = new OracleStatementParser(sql);
		switch (type) {
		case INSERT:
//			tableSet.add(((OracleInsertStatement) sp.parseInsert()).getTableName().toString());
			OracleInsertStatement insertStatement = (OracleInsertStatement) sp.parseInsert();
			tableSet.add(insertStatement.getTableName().toString());
			SQLParserHelper.parseSubTablesOfInsertSelectStatement(tableSet, insertStatement);
			return;
		case UPDATE:
			SQLUpdateStatement updateStatement = (SQLUpdateStatement) sp.parseUpdateStatement();
			tableSet.add(updateStatement.getTableName().toString());
			SQLParserHelper.parseSubTablesOfUpdateStatement(tableSet, updateStatement);
			return;
		case DELETE:
			SQLDeleteStatement deleteStatement = (SQLDeleteStatement) sp.parseDeleteStatement();
			tableSet.add(deleteStatement.getTableName().toString());
			SQLParserHelper.parseSubTablesOfDeleteStatement(tableSet, deleteStatement);
			return;
		case TRUNCATE:
			tableSet.add(((SQLIdentifierExpr) (((SQLTruncateStatement) sp.parseTruncate()).getTableSources().get(0).getExpr())).getName());
			return;
		case MERGE:
			tableSet.add(((OracleMergeStatement) sp.parseMerge()).getInto().toString());
			return;
		default:
			throw new ParserException();
		}
	}

	public static enum SqlType {
		INSERT, UPDATE, DELETE, TRUNCATE, MERGE;

	}
}
