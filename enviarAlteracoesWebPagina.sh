#!/bin/bash
#Garante que o interpretador utilizado será BashScript (nescessário em alguns casos)
# Este script depende do módulo Super-Bits DevOps encontrado em: https://github.com/salviof/superBitsDevOps

ARGUMENTOS_ESPERADOS=0
diretorioChamada=$1
nomeScript=$2


# Proteção contra execução do script sem enviar parametro nescessários
if [ $# -ne $ARGUMENTOS_ESPERADOS ]
then
  alerta "Especifique o nome do cliente, e do projeto $0 ;) "
  exit $E_BADARGS
fi
# Chamando funções do core
source /home/superBits/superBitsDevOps/core/coreSBBash.sh
#

alerta "Definindo Variavies"
CAMINHO_WP_RESOURCES_LAB="/home/superBits/projetos/Super_Bits/source/SB_CRIADOR_COMPONENTE/webApp/src/main/webapp/resources/"
CAMINHO_WP_WEBAPP_LAB="/home/superBits/projetos/Super_Bits/source/SB_CRIADOR_COMPONENTE/webApp/src/main/webapp/"
CAMINHO_META_INF="/home/superBits/projetos/Super_Bits/source/SuperBits_FrameWork/SB_FRAMEWORK/SBWebPaginas/src/main/resources/META-INF/"

alerta "Sobrescrevendo pasta TagLib"

alerta "Sobrescrevendo sbTaglib"
cp $CAMINHO_WP_WEBAPP_LAB/sb.taglibLab.xml $CAMINHO_META_INF/sb.taglib.xml -rf

alerta "Sobrescrevendo SBComp"
cp $CAMINHO_WP_RESOURCES_LAB/tagLib $CAMINHO_META_INF/resources/ -rf
cp $CAMINHO_WP_RESOURCES_LAB/SBComp/* /home/superBits/recursos/SBComp/ -rf
alerta "Atualizando Repositorio SBComp"
cd /home/superBits/recursos/SBComp/
./sincroniza.sh
./sincroniza.sh