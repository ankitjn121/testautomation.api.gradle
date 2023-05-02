package com.pratilipi.automation.helper;

/*import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;*/

/**
 * This class is a helpful collection of utilities built off of selenium specific classes, methods and constructs.
 */

//@Slf4j
public class SeleniumUtils {/*
    protected static final Log logger = LogFactory.getLog(SeleniumUtils.class);
    private static final String X_PARAM = "x";
    private static final String Y_PARAM = "y";
    private static final String HEIGHT_PARAM = "height";
    private static final String WIDTH_PARAM = "width";
    private static final String BOTTOM_PARAM = "bottom";
    private static final String PARTIAL_SEARCH_BASE = "%s[%s%s'%s']";
    private static final String CLASS = "class";
    private static final String ID = "id";
    private static final String BUTTON = "button";
    private static final String isVisibleInViewportJS = "var elem = arguments[0],                 " +
            "  box = elem.getBoundingClientRect(),    " +
            "  cx = box.left + box.width / 2,         " +
            "  cy = box.top + box.height / 2,         " +
            "  e = document.elementFromPoint(cx, cy); " +
            "for (; e; e = e.parentElement) {         " +
            "  if (e === elem)                        " +
            "    return true;                         " +
            "}                                        " +
            "return false;                            ";
    private final WebDriver baseDriver;
    private final String scrollBy = "window.scrollBy(%s,%s)";
    private final String scrollToBottom = "window.scrollTo(0, document.body.scrollHeight)";
    private final String scrollIntoView = "arguments[0].scrollIntoView(true);";
    private final String boundingRectangleJS = "return arguments[0].getBoundingClientRect().";
    private final String attributeBase = "[%s='%s']";


    public SeleniumUtils(WebDriver driver) {
        baseDriver = driver;
    }

    *//**
     * Click Element on offset.  0,0 is at CENTER of Object.
     *
     * @param pageElement   -  page element you wish to click on
     * @param percentWidth  - 0-100 %  Negative number to go left.  (eg if width is 100, setting to -100 will click on -50.
     * @param percentHeight - 0-100 %  Negative number to go left.  (eg if width is 100, setting to -100 will click on -50.
     *//*
 *//*   public void clickElementOnOffset(WebElement pageElement, int percentWidth, int percentHeight) {
        WebElement element = pageElement.getElement();
        clickElementOnOffset(element, percentWidth, percentHeight);
    }*//*

    *//**
     * Check visiblity of UI element in viewport with Javascript
     * @param pageElement element to look for
     * @return true if visible, false if not.
     *//*
*//*    public boolean visibilityOfElement(PageElement pageElement) {
        WebElement element = pageElement.getElement();
        return visibilityOfElement(element);
    }*//*

    *//**
     * Check visiblity of UI element in viewport with Javascript
     * @param element element to look for
     * @return true if visible, false if not.
     *//*
    public boolean visibilityOfElement(WebElement element) {
        WebDriver driver = ((RemoteWebElement)element).getWrappedDriver();
        return (Boolean)((JavascriptExecutor)driver).executeScript(isVisibleInViewportJS
                , element);
    }

    *//**
     * Check visiblity of UI element in viewport with Javascript
     * @param pageElement element to look for
     * @return true if visible, false if not.
     *//*
*//*    public boolean waitForElementToBeVisible(PageElement pageElement) {
        boolean result = false;
        try {
            WebElement element = pageElement.getElement();
            result = visibilityOfElement(element);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }*//*

    *//**
     * Check visiblity of UI element in viewport with Javascript
     * @param element element to look for
     * @return true if visible, false if not.
     *//*
    public boolean waitForElementToBeVisible(WebElement element) {
        boolean result = false;
        try {
            result = visibilityOfElement(element);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    *//**
     * Check visibility of a UI element and wait till it has a specific attribute value
     * @param pageElement element to look for
     * @param attributeName attribute name
     * @param attriButeValue attribute value to check for
     * @return true if visible, false if not
     *//*
*//*    public boolean waitForElementAttributeToBePresent(PageElement pageElement, String attributeName, String attriButeValue) {
        boolean result = false;
        try {
            WebElement element = pageElement.getElement();
            WebDriverWait wait = new WebDriverWait(baseDriver, 60);
            wait.until(ExpectedConditions.attributeContains(element, attributeName, attriButeValue));
            result=true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }*//*

    *//**
     * Check visibility of a UI element and wait till it has a specific text value
     * @param element element to look for
     * @param text text to be visible
     * @return true if visible, false if not
     *//*
    public boolean waitForElementTextToBePresent(WebElement element, String text) {
        boolean result = false;
        try {
            WebDriverWait wait = new WebDriverWait(baseDriver, 60);
            wait.until(ExpectedConditions.textToBePresentInElement(element, text));
            result=true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    *//**
     * Check visibility of a UI element and wait till it is no longer visible
     * @param element element to look for
     * @return true if invisible, false if not
     *//*
*//*    public boolean waitForElementToDisappear(PageElement element) {
        boolean result = false;
        try {
            WebDriverWait wait = new WebDriverWait(baseDriver, 60);
            wait.until(ExpectedConditions.invisibilityOf(element.getElement()));
            result=true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }*//*

    *//**
     * Check visibility of a UI element and wait till it is clickable
     * @param element element to look for
     * @return true if visible, false if not
     *//*
    public boolean waitForElementToBeClickable(WebElement element) {
        boolean result = false;
        try {
            WebDriverWait wait = new WebDriverWait(baseDriver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            result=true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }


 *//*   public boolean waitForElementsToBeVisible(List<PageElement> pageElements) {
        boolean result = false;
        try {
            List<WebElement> elements = new ArrayList<>();
            for (PageElement element : pageElements) {
                elements.add(element.getElement());
            }
            WebDriverWait wait = new WebDriverWait(baseDriver, 10);
            wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            result = true;
        }
        catch (Exception e){
            logger.error(e.getMessage());
        }
        return result;
    }*//*

    *//**
     * Click Element on offset.  0,0 is at CENTER of Object.
     *
     * @param element       -  page element you wish to click on
     * @param percentWidth  - 0-100 %  Negative number to go left.  (eg if width is 100, setting to -100 will click on -50.
     * @param percentHeight - 0-100 %  Negative number to go left.  (eg if width is 100, setting to -100 will click on -50.
     *//*
    public void clickElementOnOffset(WebElement element, int percentWidth, int percentHeight) {
        Point point = getPointOffset(element, percentWidth, percentHeight);
        Actions act = new Actions(baseDriver);
        act.moveToElement(element, point.getX(), point.getY()).click().perform();
    }

    private Point getPointOffset(WebElement element, int percentWidth, int percentHeight) {
        Dimension elementSize = element.getSize();
        int height = elementSize.getHeight() / 2;
        int width = elementSize.getWidth() / 2;
        Point point = new Point((width * percentWidth) / 100, (height * percentHeight) / 100);
        return point;
    }

    *//**
     * @param iframeElement String that is either iframe name or ID
     **//*
    public void switchToIframe(String iframeElement) {
        baseDriver.switchTo().frame(iframeElement);
    }

    *//**
     * @param iframeElement Webelement of iFrame
     **//*
    public void switchToIframe(WebElement iframeElement) {
        baseDriver.switchTo().frame(iframeElement);
    }

    *//**
     * @param iframeElement Webelement of iFrame
     **//*
*//*    public void switchToIframe(PageElement iframeElement) {
        WebElement webElement = iframeElement.getElement();
        switchToIframe(webElement);
    }*//*

    *//**
     * @param iframeElement number of iframe eg 0,1,1
     **//*
    public void switchToIframe(int iframeElement) {
        baseDriver.switchTo().frame(iframeElement);
    }

    public void switchToDefaultIframe() {
        baseDriver.switchTo().parentFrame();
    }

*//*    public PageElement getPageElementByLocator(LOCATORTYPE locatortype, String locatorValue) {
        Locator locator = new Locator();
        locator.setType(locatortype.toString().toLowerCase());
        locator.setValue(locatorValue);
        PageElement pageElement = new PageElement(baseDriver, "a name", new LocatorResult(locator, null, null, null));
        return pageElement;
    }*//*

    public List<WebElement> getElementsByCss(String css) {
        return baseDriver.findElements(By.cssSelector(css));
    }

    *//**
     * Finds optional of PageElement by complete link text
     *
     * @param text - text of link
     * @return Optional PageElement if exists, Optional Empty if it does not
     *//*
    public Optional<WebElement> getElementByLinkTextOptional(@NonNull String text) {
        try {
            WebElement chapter = baseDriver.findElement(By.linkText(text));
            return Optional.of(chapter);
        } catch (NoSuchElementException ex) {
            return Optional.empty();
        }
    }

    *//***
     Finds PageElement by complete link text
     * @param text - text of link
     * @return PageElement
     * @throws NoSuchElementException if it does not.
     *//*
    public WebElement getElementByLinkText(@NonNull String text) {
        Optional<WebElement> chapter = getElementByLinkTextOptional(text);
        if (chapter.isPresent()) {
            return chapter.get();
        } else {
            throw new NoSuchElementException("Cannot find element by text of " + text);
        }
    }

    public String getURL() {
        return baseDriver.getCurrentUrl();
    }

    public List<WebElement> getChildWebElementsByCss(String css) {
        WebElement parent = baseDriver.findElement(By.cssSelector(css));
        return parent.findElements(By.cssSelector("*"));
    }

    public WebElement getElementByXpath(@NonNull String path) {
        return baseDriver.findElement(By.xpath(path));
    }

    *//**
     * Find element by attribute
     *
     * @param elements          - List of elements to filter through
     * @param attributeName     - name of attribute to pull
     * @param valueDesired      - what you want to match inside the attribute
     * @param requireExactMatch - True if matching whole attribute - false if it's to contain valueDesired
     * @return optional Webelement as it is possible we wish to search to ensure nothing is found and don't wish to throw an exception.
     *//*

    public Optional<WebElement> getElementByAttribute(List<WebElement> elements, String attributeName, String valueDesired, boolean requireExactMatch) {
        log.info("Looking for attribute value: " + valueDesired);
        if (elements == null) {
            return Optional.empty();
        }
        for (final WebElement element : elements) {
            String attributeValue = element.getAttribute(attributeName);
            if (requireExactMatch) {
                if (attributeValue.equals(valueDesired)) {
                    log.info("Found exact match for: " + valueDesired);
                    return Optional.of(element);
                }
            } else {
                if (attributeValue.contains(valueDesired)) {
                    log.info(attributeValue + " contains match for: " + valueDesired);
                    return Optional.of(element);
                }
            }
        }
        return Optional.empty();
    }

    *//***
     * Find an element by first finding the list of elements with a common CSS attribute, then filter on innerText of element
     * Using innerText attribute as this will find elements that we NOT in view as WebElement.getText is designed to only return
     * text of elements in view.
     * @param cssFilter - Css filter in string form
     * @param InnerTextFilter - Text that will find the element we are looking for.
     * @return Optional of WebElement
     *//*
    public Optional<WebElement> getElementByCssAndInnerText(@NonNull String cssFilter, @NonNull String InnerTextFilter) {
        List<WebElement> elements = getElementsByCss(cssFilter);
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(elements.stream().filter(pe -> InnerTextFilter.equals(getInnerText(pe))).findAny().orElse(null));
    }

    public Optional<WebElement> getElementByAttribute(List<WebElement> elements, String attributeName, String attributeDesired) {
        return getElementByAttribute(elements, attributeName, attributeDesired, true);
    }

    *//***
     * Get element by Attribute
     * @param attributeName - name of attribute
     * @param attributeDesired - attribute's desired value
     * @return element containing attribute and value
     *//*
    public WebElement getElementByAttribute(@NonNull String attributeName, @NonNull String attributeDesired) {
        return baseDriver.findElement(By.cssSelector(String.format(attributeBase, attributeName, attributeDesired)));
    }

    public java.awt.Dimension seleniumDimensionToJavaDimension(Dimension dimension) {
        java.awt.Dimension javaDimension = new java.awt.Dimension();
        javaDimension.setSize(dimension.getWidth(), dimension.getHeight());
        return javaDimension;
    }

    *//***
     * Get inner text of the page element
     * @param pageElement
     * @return string containing inner text
     *//*
*//*    public String getInnerText(@NonNull PageElement pageElement) {
        WebElement element = pageElement.getElement();
        return getInnerText(element);
    }*//*

    *//***
     * Get inner text of the page element
     * @param webElement
     * @return string containing inner text
     *//*
    public String getInnerText(@NonNull WebElement webElement) {
        return webElement.getAttribute("innerText");
    }

    *//***
     * Get text content of an element, even if element is not displayed
     * @param webElement
     * @return string containing inner text
     *//*
    public String getTextContent(@NonNull WebElement webElement) {
        return webElement.getAttribute("textContent");
    }

    *//***
     * Get text of an element
     * @param webElement
     * @return string containing inner text
     *//*
    public String getText(@NonNull WebElement webElement) {
        return webElement.getText();
    }

    *//***
     * Get the HTML content of an element
     * @param pageElement target element to be validated
     * @return
     *//*
*//*    public String getInnerHTML(@NonNull PageElement pageElement) {
        WebElement element = pageElement.getElement();
        return getInnerHTML(element);
    }*//*

    *//***
     * Get the HTML content of an element
     * @param webElement target element to be validated
     * @return
     *//*
    public String getInnerHTML(@NonNull WebElement webElement) {
        return webElement.getAttribute("innerHTML");
    }

    *//***
     * if the innerHTML proprety of the element is not empty, then fail the test
     * @param pageElement target element to be validated
     *//*
    public void validateElementInnerHTMLIsEmpty(@NonNull WebElement pageElement) {
        if(getInnerHTML(pageElement) != null && !(getInnerHTML(pageElement).isEmpty())) {
            log.error("Invalid page content, failing element: {}", pageElement.getLocatorValue());
            Assert.fail("Invalid page content, failing element: " + pageElement.getLocatorValue());        }
    }

    *//***
     * Get text-Overflow information
     * @param pageElement
     * @return string containing inner text
     *//*

*//*    public String getTextOverflowValue(@NonNull PageElement pageElement) {
        WebElement element = pageElement.getElement();
        return getTextOverflowValue(element);
    }*//*

    *//***
     * Get text-Overflow information
     * @param webElement
     * @return string containing inner text
     *//*

    public String getTextOverflowValue(@NonNull WebElement webElement) {
        return webElement.getCssValue("text-overflow");
    }

    *//***
     * Wait for element to be visible.
     * @param webElement
     * @return Page Element - if will throw a selenium error if this fails.
     *//*
    public WebElement waitForElementVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(baseDriver, 10);
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    *//***
     * Wait for element to exist by the CSS string locator.
     * @param css - string containing CSS to look for
     * @return Page Element - if will throw a selenium error if this fails.
     *//*
    public WebElement waitForElementExistsByCSS(String css) {
        WebDriverWait wait = new WebDriverWait(baseDriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
    }

    *//***
     * Wait for element to exist by the Xpath string locator.
     * @param xpath - string containing Xpath to look for
     * @return Page Element - if will throw a selenium error if this fails.
     *//*
    public WebElement waitForElementExistsByXpath(String xpath) {
        WebDriverWait wait = new WebDriverWait(baseDriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public void changeScreenSize(int myWidth, int myHeight) {
        Dimension d = new Dimension(myWidth, myHeight);
        baseDriver.manage().window().setSize(d);
    }

    *//**
     * Move to an element and click it
     *
     * @param element element to click
     *//*
*//*    public void moveToAndClick(WebElement element) {
        new Actions(baseDriver).moveToElement(element.getElement()).click().perform();
    }*//*

*//*    public void forceClick(PageElement pageElement) {
        JavascriptExecutor executor = (JavascriptExecutor) baseDriver;
        executor.executeScript("arguments[0].click();", pageElement.getElement());
    }*//*

    public void moveToAndClick(WebElement element) {
        new Actions(baseDriver).moveToElement(element).click().perform();
    }

    *//**
     * Move to an element and hover over it
     *
     * @param element element to click
     *//*
*//*    public void moveTo(PageElement element) {
        new Actions(baseDriver).moveToElement(element.getElement()).perform();
    }*//*

    *//**
     * Move to an element and hover over it
     *
     * @param element element to click
     *//*
    public void moveTo(WebElement element) {
        new Actions(baseDriver).moveToElement(element).perform();
    }

    *//**
     * Wait using Thread.sleep
     * Avoid using whenever possible - if used put a to do in code with link to issue
     * to find a better way to handle the situation
     *
     * @param mills
     *//*
    public void customWait(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new TimeoutException(e.getMessage());
        }
    }

*//*    public String getSrcURL(@NonNull PageElement pageElement) {
        return pageElement.getElement().getAttribute("src");
    }*//*

    public boolean checkUrlContains(String lookFor) {
        String fullCurrentURL = getURL();
        return fullCurrentURL.contains(lookFor);
    }

*//*    public void setCheckbox(PageElement toggle, PageElement checkbox, boolean wantOn) {
        if (checkbox.isSelected() != wantOn) {
            toggle.click();
        }
    }*//*

    public void scrollPageByPixel(Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        js.executeScript(String.format(scrollBy, x.toString(), y.toString()));
    }

    public void scrollToBottomOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        js.executeScript(scrollToBottom);
    }

    public void scrollElementIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        js.executeScript(scrollIntoView, element);
    }

*//*    public void scrollElementIntoView(PageElement element) {
        WebElement webElement = element.getElement();
        scrollElementIntoView(webElement);
    }*//*

    public void dragAndDrop(WebElement start, int xOffset, int yOffset) {
        Actions dragDrop = new Actions(baseDriver).dragAndDropBy(start, xOffset, yOffset);
        dragDrop.perform();
    }

    public void dragAndDrop(WebElement start, WebElement end) {
        Action actions = new Actions(baseDriver).dragAndDrop(start, end).build();
        actions.perform();
    }

    public int scrollTop() {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        return ((Number) js.executeScript("return document.documentElement.scrollTop")).intValue();
    }

    public int scrollHeight() {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        return ((Number) js.executeScript("return document.documentElement.scrollHeight")).intValue();
    }

    public int clientHeight() {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        return ((Number) js.executeScript("return document.documentElement.clientHeight")).intValue();
    }

    *//**
     * Swipe vertical on mobile devices
     *
     * @param percentFromTopStart
     * @param percentFromTopEnd
     * @param pixelDepth
     *//*
*//*
    public void swipeVertical(int percentFromTopStart, int percentFromTopEnd, double pixelDepth) {
        Dimension relativeBrowserDimensions = getRelativeBrowserDimensions();
        logger.info(String.format("Relative width: [%s]  Element Relative height: [%s]", relativeBrowserDimensions.getWidth(), relativeBrowserDimensions.getHeight()));
        Point startPoint = calculatePoint(relativeBrowserDimensions, 50, percentFromTopStart, pixelDepth);
        logger.info(String.format("Start Point x: [%s]  Start Point y: [%s]", startPoint.getX(), startPoint.getY()));
        Point endPoint = calculatePoint(relativeBrowserDimensions, 50, percentFromTopEnd, pixelDepth);
        logger.info(String.format("End Point x: [%s]  End Point y: [%s]", endPoint.getX(), endPoint.getY()));
        TouchAction action = new TouchAction((PerformsTouchActions) baseDriver);
        action.press(PointOption.point(startPoint.getX(), startPoint.getY()))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))) //you can change wait durations as per your requirement
                .moveTo(PointOption.point(endPoint.getX(), endPoint.getY()))
                .release()
                .perform();
    }*//*

    *//**
     * Swipe vertical on mobile devices
     *
     * @param percentFromTop
     * @param percentFromRight
     * @param pixelDepth
     *//*

*//*    public void tapMobileUI(int percentFromTop, int percentFromRight, double pixelDepth) {
        Dimension relativeBrowserDimensions = getRelativeBrowserDimensions();
        logger.info(String.format("Relative width: [%s]  Element Relative height: [%s]", relativeBrowserDimensions.getWidth(), relativeBrowserDimensions.getHeight()));
        Point startPoint = calculatePoint(relativeBrowserDimensions, percentFromRight, percentFromTop, pixelDepth);
        logger.info(String.format("Start Point x: [%s]  Start Point y: [%s]", startPoint.getX(), startPoint.getY()));
        TouchAction action = new TouchAction((PerformsTouchActions) baseDriver);
        action.tap(PointOption.point(startPoint.getX(), startPoint.getY()))
                .perform();
    }*//*

    *//**
     * Tap on mobile iOS item in UI when WebElement.Click won't work
     *
     * @param element
     *//*

*//*    public void tapMobileUIiOS(PageElement element, int navBarHeight) {
        Point touchPoint = getCenterOfElement(element);
        TouchAction action = new TouchAction((PerformsTouchActions) baseDriver);
        action.tap(PointOption.point(touchPoint.getX(), touchPoint.getY() + navBarHeight))
                .perform();
    }*//*

*//*    private Point getCenterOfElement(PageElement element) {
        Point locationOfElement = element.getElement().getLocation();
        Dimension size = element.getElement().getSize();
        int newX = locationOfElement.getX() + (size.getWidth() / 2);
        int newY = locationOfElement.getY() + (size.getHeight() / 2);
        return new Point(newX, newY);
    }*//*

    *//**
     * Force Class name change
     *
     * @param element  element to change the class name
     * @param newClass className to change it to
     *//*
*//*    public void setClass(PageElement element, String newClass) {
        String jsString = String.format("arguments[0].setAttribute('class','%s')", newClass);
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        js.executeScript(jsString, element.getElement());
    }*//*

    *//**
     * Get Class name
     *
     * @param element element to change the class name
     *//*
    public String getClassName(PageElement element) {
        return element.getElement().getAttribute("class");
    }

    private Dimension getRelativeBrowserDimensions() {
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        int width = ((Long) js.executeScript("return window.innerWidth || document.body.clientWidth")).intValue();
        int height = ((Long) js.executeScript("return window.innerHeight || document.body.clientHeight")).intValue();
        return new Dimension(width, height);
    }

    private Point calculatePoint(Dimension dimension, int percentx, int percenty, double pixelDepth) {
        double percentXMultiplier = percentx / 100.0f;
        double percentYMultiplier = percenty / 100.0f;
        logger.info(String.format("PercentMulitplier: [%s]", percentXMultiplier));
        int x = (int) (dimension.getWidth() * pixelDepth * percentXMultiplier);
        logger.info(String.format("Dimension Width: [%s] PixelDepth: [%s] X: [%s]", dimension.getWidth(), pixelDepth, x));
        int y = (int) (dimension.getHeight() * pixelDepth * percentYMultiplier);
        logger.info(String.format("Dimension height: [%s] PixelDepth: [%s] Y: [%s]", dimension.getHeight(), pixelDepth, y));
        return new Point(x, y);
    }

    *//**
     * This performs the following
     * Find Element
     * from upper left corner, move to an offset x,y
     * press down
     * move while holding down to new location
     * lift up
     *
     * @param xStartPercentOffset
     * @param yStartPercentOffset
     * @param xMoveByPercentOffset
     * @param yMoveByPercentOffset
     * @param startElement
     *//*
    public void swipe(WebElement startElement, int xStartPercentOffset, int yStartPercentOffset, int xMoveByPercentOffset, int yMoveByPercentOffset) {
        Point startPoint = getPointOffset(startElement, xStartPercentOffset, yStartPercentOffset);
        Point endPoint = getPointOffset(startElement, xMoveByPercentOffset, yMoveByPercentOffset);
        log.info("Start points: " + startPoint.getX() + "," + startPoint.getY());
        log.info("End points: " + endPoint.getX() + "," + endPoint.getY());
        Actions swipeUI = new Actions(baseDriver).moveToElement(startElement, startPoint.getX(), startPoint.getY())
                .clickAndHold().moveByOffset(endPoint.getX(), endPoint.getY()).release();
        swipeUI.perform();
    }

    *//**
     * This performs the following
     * Find Element
     * from upper left corner, move to an offset x,y
     * press down
     * move while holding down to new location
     * lift up
     *
     * @param xStartPercentOffset
     * @param xMoveByPercentOffset
     * @param startElement
     *//*
    public void swipe(WebElement startElement, int xStartPercentOffset, int xMoveByPercentOffset) {
        Actions swipeUI = new Actions(baseDriver).moveToElement(startElement, xStartPercentOffset, 0)
                .clickAndHold().moveByOffset(xMoveByPercentOffset, 0).release();
        swipeUI.perform();
    }

    *//**
     * Swipe from one element to another.
     *
     * @param startElement
     * @param endElement
     *//*
    public void swipe(WebElement startElement, WebElement endElement) {
        Actions swipeUI = new Actions(baseDriver).moveToElement(startElement).clickAndHold().moveToElement(endElement).release();
        swipeUI.perform();
    }

    public void sendKeyToBrowser(Keys key) {
        Actions act = new Actions(baseDriver);
        act.sendKeys(key);
        act.build().perform();
    }

    public int getBrowserHeight() {
        return baseDriver.manage().window().getSize().getHeight();
    }

    public int getBrowserWidth() {
        return baseDriver.manage().window().getSize().getWidth();
    }

    public int getElementHeight(PageElement element) {
        WebElement webElement = element.getElement();
        return webElement.getSize().getHeight();
    }

    public int getElementWidth(PageElement element) {
        WebElement webElement = element.getElement();
        return webElement.getSize().getWidth();
    }

    public String getElementAttribute(PageElement element, String attribute) {
        WebElement element1 = element.getElement();
        return getElementAttribute(element1, attribute);
    }

    *//**
     * Retrieve Attribute of an element
     * @param element - web element
     * @param attribute name of attribute desired
     * @return string of attribute's value
     *//*
    public String getElementAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getElementStyle(PageElement element) {
        return getElementAttribute(element, "style");
    }

    *//**
     * Find an element based on a partial CSS match
     *
     * @param uiType          - UI tupe to find, Link, button etc
     * @param attributeType   - attribute to do a partial search on (class, div, ID)
     * @param search_operator - The operator to do the search on, Begins with, ends with or just anywhere
     * @param toFind          - What to look for
     * @return - Web Element
     *//*
    private WebElement getElementBuyPartialCSSMatch(String uiType, String attributeType, SEARCH_OPERATOR search_operator, String toFind) {
        String css = String.format(PARTIAL_SEARCH_BASE, uiType, attributeType, search_operator.getOperator(), toFind);
        return baseDriver.findElement(By.cssSelector(css));
    }

    *//**
     * Find the ID of a button based on class name ending with a particular string
     *
     * @param toFind - what the class name is to end with
     * @return ID of the UI element
     *//*
    public String getButtonIDByClassEndsWithCSSMatch(String toFind) {
        WebElement element = getElementBuyPartialCSSMatch(BUTTON, CLASS, SEARCH_OPERATOR.ENDS_WITH, toFind);
        logger.info("I have an element of ID: " + element.getAttribute(ID));
        return element.getAttribute(ID);
    }

    public Optional<WebElement> getElementByCss(String css) {
        return Optional.ofNullable(baseDriver.findElement(By.cssSelector(css)));
    }

    *//**
     * Get element by CSS
     *
     * @param css          - css string
     * @param errorMessage - error message to display when not found
     * @return
     *//*

    public WebElement getElementByCss(@NonNull String css, @NonNull String errorMessage) {
        return getElementByCss(css).orElseThrow(() -> new NoSuchElementException(errorMessage));
    }

    *//***
     * Gets proper height of the UI element according to it's current size in the visible UI
     * will not be needed when DTK updates to Selenium 4
     * @param element to find height for
     * @return height as an int
     *//*
    public int getElementHeightJS(WebElement element) {
        return Math.round((float) getDimensionJS(element, HEIGHT_PARAM));
    }

    *//***
     * Gets proper width of the UI element according to it's current size in the visible UI
     * will not be needed when DTK updates to Selenium 4
     * @param element to find width for
     * @return width as an int
     *//*
    public int getElementWidthJS(WebElement element) {
        return Math.round((float) getDimensionJS(element, WIDTH_PARAM));
    }

    *//***
     * Gets proper width of the UI element according to it's current size in the visible UI
     * will not be needed when DTK updates to Selenium 4
     * @param element to find width for
     * @return width as an int
     *//*
    public int getElementBottomJS(WebElement element) {
        return Math.round((float) getDimensionJS(element, BOTTOM_PARAM));
    }

    *//***
     * Gets upper left x coordinate according to it's current place in the visible UI
     * will not be needed when DTK updates to Selenium 4
     * @param element to find x for
     * @return x as an int
     *//*
    public int getElementXCoordJS(WebElement element) {
        return Math.round((long) getDimensionJS(element, X_PARAM));
    }

    *//***
     * Gets upper left corner Y coordinate according to it's current place in the visible UI
     * will not be needed when DTK updates to Selenium 4
     * @param element to find y for
     * @return y as an int
     *//*
    public int getElementYCoordJS(WebElement element) {
        return getDimensionJS(element, Y_PARAM);
    }

    private int getDimensionJS(WebElement element, String dimensionParam) {
        String jsString = boundingRectangleJS + dimensionParam + ";";
        JavascriptExecutor js = (JavascriptExecutor) baseDriver;
        Object obj = js.executeScript(jsString, element);
        if (obj instanceof Double) {
            return ((Double) obj).intValue();
        } else if (obj instanceof Long) {
            return ((Long) obj).intValue();
        } else
            return Integer.parseInt(obj.toString());
    }

    *//***
     * Refresh browser
     *//*
    public void browserRefresh() {
        baseDriver.navigate().refresh();
    }

    *//**
     * Get List of options
     *
     * @param element - Page element of the dropdown
     * @return List containing strings of the value
     *//*
    public List<String> getListOfOptions(PageElement element) {
        Select select = new Select(element.getElement());
        List<WebElement> elements = select.getOptions();
        return elements.stream().map(e -> e.getAttribute("value")).collect(Collectors.toList());
    }

    *//**
     * Select dropdown option by index
     *
     * @param element - Page element of the dropdown
     * @param index - Index of the option to be selected
     *//*
    public void selectDropdownOptionByIndex(PageElement element, int index) {
        Select select = new Select(element.getElement());
        select.selectByIndex(index);
    }

    *//**
     * Same as FindElement only returns null when not found instead of an exception
     *
     * @param pageElement - Current element
     * @return Returns T/F depending on if element is defined or null.
     *//*
    public boolean isElementExists(PageElement pageElement){
        WebElement element = pageElement.getElement();
        if (element == null)
        { return false; }
        return true;
    }

    *//**
     * Same as FindElement only returns null when not found instead of an exception
     *
     * @param pageElements - Current list of elements
     * @return Returns T/F depending on if element is defined or null.
     *//*
    public boolean isElementExists(List<PageElement> pageElements){
        WebElement element = pageElements.size()>0? pageElements.get(0).getElement(): null;
        if (element == null)
        { return false; }
        return true;
    }

    *//**
     * Same as FindElement only returns null when not found instead of an exception
     *
     * @param locatortype - Supported type of locator
     * @param locatorValue - Value of locator
     * @return Returns T/F depending on if element is defined or null.
     *//*
    public boolean isElementExists(LOCATORTYPE locatortype, String locatorValue){
        PageElement element = getPageElementByLocator(locatortype, locatorValue);
        if (element == null)
        { return false; }
        return true;
    }

    *//**
     * Workaround in case the WebElement is visible and enabled, but still not
     * clickable due to z-index is higher of a WebElement then the layer's which
     * contains the button.
     *
     * @param webElement
     * @return
     *//*
    public static boolean isClickable(PageElement webElement) {
        try {
            webElement.click();
            logger.info("----WebElement is clickable and clicked.");
            return true;
        } catch (Exception e) {
            logger.error("----Exception after trying to click on WebElement.");
            return false;
        }
    }

    public void click(PageElement webElement) throws InterruptedException {
        log.info("----Clicking on a webElement");
        waitElementLocated(webElement, 60);
        webElement.click();
    }

    public boolean waitElementLocated(PageElement element, int timeOutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(baseDriver, timeOutInSeconds);
            wait.until(ExpectedConditions.visibilityOf((WebElement) element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void validateElementClassContains(PageElement element, String text) {
        String className = getClassName(element);
        boolean isTextFound = className.contains(text);
        String assertMessage = "Text Not Found : " + text + ", instead " + className + " was found.";
        org.junit.Assert.assertTrue(assertMessage, isTextFound);
    }

    public void switchToFrame(final PageElement pageElement) {
        WebElement element = pageElement.getElement();
        new WebDriverWait(baseDriver, 10).until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }

    public enum LOCATORTYPE {
        XPATH,
        ID,
        NAME,
        CSS,
        ACCESSIBILITYID,
        IOSUIAUTOMATION,
        ANDROIDUIAUTOMATOR
    }

    public enum SEARCH_OPERATOR {
        STARTS_WITH("^="),
        ENDS_WITH("$="),
        CONTAINS("*=");

        private final String operator;

        SEARCH_OPERATOR(final String operator) {
            this.operator = operator;
        }

        public String getOperator() {
            return this.operator;
        }
    }
*/
}