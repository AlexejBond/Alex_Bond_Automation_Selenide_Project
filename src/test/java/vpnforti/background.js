
chrome.tabs.onUpdated.addListener(function(tabId, changeInfo, tab) {
  if (changeInfo.status === 'complete' && tab.url.includes("http://127.0.0.1:8020")) {
      setTimeout(function() {
        chrome.tabs.remove(tabId);
    }, 1000);
  }
});
