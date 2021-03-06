package com.baton.syncserver.infrastructure.database;

import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ç®?SQLè¿åç»æçæ°æ®è¡¨æ ¼ç±»
 *
 * <p>detailed comment
 * @author j66969 Create on 2011-4-1
 * @see
 * @since 1.0
 */
public class DTable
{
    /**
     * è¡¨æ ¼åéå?
     */
    private List<Map<String,Object>> rows = new ArrayList<Map<String,Object>>();
    
    /**
     * æ°æ®è¡¨åçç±»ååå±æ?ä¿¡æ¯
     */
    private ResultSetMetaData metaData;
    
    /**
     * æé?å½æ°
     * @param metaData åæ°æ?
     */
    public DTable(ResultSetMetaData metaData)
    {
        super();
        this.metaData = metaData;
    }

    /**
     * å¢å  è¡?
     * @param row è¡?
     */
    public void addRow(Map<String,Object> row)
    {
        rows.add(row);
    }
    
    /**
     * æ ¹æ®è¡ååæ°è·åæ°æ®ç»æ
     * @param row è¡æ°
     * @param col åæ°
     * @return ç»æå?
     */
    public String getValue(int row,int col)
    {
        return (String)rows.get(row).get(col);
    }
    
    public Map<String,Object> getRow(int row)
    {
    	return rows.get(row);
    }
    
    /**
     * è·åæ°æ®è¡¨æ ¼çæ?è¡æ°
     * @return æ°æ®è¡¨æ ¼çæ?è¡æ°
     */
    public int getRowLength()
    {
        return rows.size();
    }

    /**
     * è·ååæ°æ?
     * @return the metaData
     */
    public ResultSetMetaData getMetaData()
    {
        return metaData;
    }
    
    
}
