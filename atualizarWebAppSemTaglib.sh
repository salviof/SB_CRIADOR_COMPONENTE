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

CAMINHO_WP_REFERENCIA="/home/superBits/projetos/Super_Bits/source/SuperBits_FrameWork/SB_FRAMEWORK/SBWebPaginas"
CAMINHO_WP_SEM_TAGLIB="/home/superBits/projetos/Super_Bits/source/SuperBits_FrameWork/SB_FRAMEWORK/SBWebPaginasSemTagLib"

alerta "Verificando existencia de pasta referencia"
arqSairSePastaNaoExistir $CAMINHO_WP_REFERENCIA "Diretorio Referencia não encontrado"


alerta "Removendo pasta versão antiga"
rm  $CAMINHO_WP_SEM_TAGLIB -rf

arqSairSePastaExistir $CAMINHO_WP_SEM_TAGLIB "O diretorio antigo não foi excluido"
mkdir $CAMINHO_WP_SEM_TAGLIB 
arqSairSePastaNaoExistir $CAMINHO_WP_SEM_TAGLIB "A pasta de destino não pode ser criada"
cp $CAMINHO_WP_REFERENCIA/* $CAMINHO_WP_SEM_TAGLIB/ -rf
arqSairSePastaNaoExistir $CAMINHO_WP_SEM_TAGLIB/src "Os arquivos não foram copiados para pasta de Destino"



alerta "Removendo pasta versão antiga"
if arqComandoExiste xmlstarlet ;
then 
alerta "xmlstarlet não encontrado, o aplicativo será instalado"
pausar
sudo yum install xmlstarlet -y
else
alerta ".."
fi

alerta "Removendo Taglib OFICIAL"
rm   $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/resources/tagLib -rf
rm   $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/sb.taglib.xml -f

arqSairSePastaExistir $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/resources/tagLib "O diretorio taglib não foi excluido"
arqSairSeArquivoExistir $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/sb.taglib.xml "O arquivo sb.taglib não foi excluido"
alerta "Removendo SBCompOficial"
rm   $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/resources/SBComp -rf
arqSairSePastaExistir $CAMINHO_WP_SEM_TAGLIB/src/main/resources/META-INF/resources/SBComp "O arquivo SBCOMP não foi excluido"




alerta "Alterando nome do projeto POM"
xmlstarlet ed -N p=http://maven.apache.org/POM/4.0.0 -u "/p:project/p:artifactId" -v "SBWebPaginasSemTagLib" -u "/p:project/p:name" -v "WP Super-Bits Sem TagLib"   $CAMINHO_WP_REFERENCIA/pom.xml > $CAMINHO_WP_SEM_TAGLIB/pom.xml
cd $CAMINHO_WP_SEM_TAGLIB
mvn -DskipTests=true clean install
