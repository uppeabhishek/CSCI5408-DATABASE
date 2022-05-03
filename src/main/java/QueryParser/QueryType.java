package QueryParser;

/**
 * @author abhishekuppe
 */

public enum QueryType {
    CREATE_DATABASE,
    USE_DATABASE,
    CREATE_TABLE,
    INSERT_TABLE,
    SELECT_TABLE,
    UPDATE_TABLE,
    DELETE_TABLE,
    DROP_TABLE,
    BEGIN_TRANSACTION,
    END_TRANSACTION,
    DROP_DATABASE
}
