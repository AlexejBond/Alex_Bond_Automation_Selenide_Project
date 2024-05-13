document.addEventListener('DOMContentLoaded', function() {
    var toggleSwitch = document.getElementById('toggleSwitch');

    chrome.storage.sync.get('extensionStatus', function(data) {
        var status = data.extensionStatus;
        if (status === 'on') {
            toggleSwitch.checked = true;
        } else {
            toggleSwitch.checked = false;
        }
    });

    toggleSwitch.addEventListener('change', function() {
        if (toggleSwitch.checked) {
            chrome.storage.sync.set({ 'extensionStatus': 'on' });
        } else {
            chrome.storage.sync.set({ 'extensionStatus': 'off' });
        }
    });
});