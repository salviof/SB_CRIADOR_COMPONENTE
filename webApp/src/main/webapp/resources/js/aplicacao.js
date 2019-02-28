function dropaCampo(event, ui) {
    var droppedCampo = ui.draggable;
    $(".campoDropado")[0].value = droppedCampo[0].getAttribute('valordropado');
    droppedCampo.fadeOut('slow');
    dropaCampoServerSide();
}
function dropaComponente(event, ui) {
    var droppedComponente = ui.draggable;
    $(".componenteDropado")[0].value = droppedComponente[0].getAttribute('valordropado');
    droppedComponente.fadeOut('slow');
    dropaComponenteServerSide();
}


