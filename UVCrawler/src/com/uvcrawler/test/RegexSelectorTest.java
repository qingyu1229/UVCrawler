package com.uvcrawler.test;

import org.junit.Assert;
import org.junit.Test;

import com.uvcrawler.selector.RegexSelector;

/**
 * @author code4crafter@gmail.com <br>
 */
public class RegexSelectorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testRegexWithSingleLeftBracket() {
        String regex = "\\d+(";
        new RegexSelector(regex);
    }

    @Test
    public void testRegexWithLeftBracketQuoted() {
        String regex = "\\(.+";
        String source = "(hello world";
        RegexSelector regexSelector = new RegexSelector(regex);
        String select = regexSelector.select(source);
        Assert.assertEquals(source,select);
    }
}
