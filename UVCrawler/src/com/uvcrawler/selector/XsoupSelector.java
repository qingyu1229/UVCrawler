package com.uvcrawler.selector;

import org.jsoup.nodes.Element;

import com.uvcrawler.selector.xsoup.Xsoup;
import com.uvcrawler.selector.xsoup.xevaluator.XPathEvaluator;

import java.util.List;

/**
 * XPath selector based on Xsoup.<br>
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.3.0
 */
public class XsoupSelector extends BaseElementSelector {

    private XPathEvaluator xPathEvaluator;

    public XsoupSelector(String xpathStr) {
        this.xPathEvaluator = Xsoup.compile(xpathStr);
    }

    @Override
    public String select(Element element) {
        return xPathEvaluator.evaluate(element).get();
    }

    @Override
    public List<String> selectList(Element element) {
        return xPathEvaluator.evaluate(element).list();
    }
}