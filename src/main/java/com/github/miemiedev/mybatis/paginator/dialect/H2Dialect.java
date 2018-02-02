package com.github.miemiedev.mybatis.paginator.dialect;


import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.ibatis.mapping.MappedStatement;

/**
 * A dialect compatible with the H2 database.
 *
 * @author Thomas Mueller
 * @author miemiedev
 */
public class H2Dialect extends Dialect {

    public H2Dialect(MappedStatement mappedStatement, Object parameterObject, PageBounds pageBounds) {
        super(mappedStatement, parameterObject, pageBounds);
    }

    protected String getLimitString(String sql, String offsetName, int offset, String limitName, int limit) {
        return sql + ((offset > 0) ? " limit " + limit + " offset " + offset : " limit " + limit);
    }


}