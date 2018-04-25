

/**
 * Limpa todos os Tooltips do Primefaces
 */
function esconderTooltips() {
    $(".ui-tooltip").hide();

}

function liberarBloqueios() {
    for (i in PrimeFaces.widgets) {
        if (PrimeFaces.widgets[i].show && PrimeFaces.widgets[i].blocker) {
            PrimeFaces.widgets[i].hide();
        }
    }
}

function scrollEmCampoNaoValidado() {

    try {
        var elementoErro = $("input.ui-state-error:first");
        if (elementoErro.length > 0) {

            $('html, body').animate({
                scrollTop: elementoErro.offset().top - 200
            });
        }

        return true;
    } catch (err) {

    }
    return false;
}


/**
 * Vai para o Topo
 */
function irParaTopo() {
    $("html, body").animate({scrollTop: 0}, "slow");
}
function irParTopo() {
    irParaTopo();
}

function acoesPosAjax() {
    try {
        esconderTooltips();
        if (!scrollEmCampoNaoValidado()) {
            irParTopo();
        }
    } catch (err) {

    }

}

/**
 * ->
 * O enviarInf
 */
function atualizarResolucaoDaTela() {
    getClientInfo();
    enviarInfoTela();
}
/**
 *
 *
 * Atualiza o campo infotelafrm:clientinfo com a resolução atual da tela
 */
function getClientInfo()
{
    var clientinfo = "";
    clientinfo += "aplicativo:" + navigator.appName + "||";
    clientinfo += "versaoAplicativo:" + navigator.appVersion + "||";
    clientinfo += "tamanhoX:" + window.innerWidth + "||";
    clientinfo += "tamanhoY:" + window.innerHeight;
    (document.getElementById('contactfrm:clientinfo')).value = clientinfo;
}

function baixarArquivo(fileURL, fileName) {
    // for non-IE
    if (!window.ActiveXObject) {
        var save = document.createElement('a');
        save.href = fileURL;
        save.target = '_blank';
        save.download = fileName || 'unknown';

        var event = document.createEvent('Event');
        event.initEvent('click', true, true);
        save.dispatchEvent(event);
        (window.URL || window.webkitURL).revokeObjectURL(save.href);
    }

    // for IE
    else if (!!window.ActiveXObject && document.execCommand) {
        var _window = window.open(fileURL, '_blank');
        _window.document.close();
        _window.document.execCommand('SaveAs', true, fileName || fileURL)
        _window.close();
    }
}

function modificarIntputEclicar(idBotao, idInputEnvio, valor) {
    document.getElementById(idInputEnvio).value = valor;
    document.getElementById(idBotao).click();

}

function copiarValoresCKEditor(idOrigem, idDestino) {
    var conteudo = CKEDITOR.instances[idOrigem].getData();
    document.getElementById(idDestino).value = conteudo;
}