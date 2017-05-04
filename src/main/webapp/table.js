function getRowNumber(obj) {
    return obj.parent("tr").prevAll("tr").length;
}

function getColNumber(obj) {
    return obj.prevAll("tr").length + 1;
}

function getCurrentPosValue(obj) {
    return obj.html();
}

function getCurrentRowAppointPosValue(obj, num) {

}