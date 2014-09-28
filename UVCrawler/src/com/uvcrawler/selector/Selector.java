package com.uvcrawler.selector;

import java.util.List;

import com.uvcrawler.vo.Reg_company;

/**
 * Selector(extractor) for text.<br>
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.1.0
 */
public interface Selector {

    /**
     * Extract single result in text.<br>
     * If there are more than one result, only the first will be chosen.
     *
     * @param text
     * @return result
     */
    public String select(String text);

    /**
     * Extract all results in text.<br>
     *
     * @param text
     * @return results
     */
    public List<String> selectList(String text);
    
    
    public String select(Reg_company reg,String htmlStr);

}
