package com.testwithspring.master.web.task

import com.testwithspring.master.WebDriverUrlBuilder
import org.openqa.selenium.WebDriver

/**
 * This page object represents the update task page.
 */
final class UpdateTaskPage {

    private final WebDriver browser
    private final String pageUrl
    private final Long taskId

    UpdateTaskPage(WebDriver browser, Long taskId) {
        this.browser = browser
        this.pageUrl = WebDriverUrlBuilder.buildFromPath('/task/%d/update', taskId)
        this.taskId = taskId
    }

    /**
     * Returns the URL of the update task page.
     * @return
     */
    String getPageUrl() {
        return pageUrl
    }

    /**
     * Returns true if the update task page is open and false otherwise.
     * @return
     */
    boolean isOpen() {
        return browser.getCurrentUrl() == pageUrl
    }
}
