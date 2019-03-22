source ./SBProjeto.prop
source ./SB_CR_SBProjeto.prop
mysql -u root $NOME_BANCO < ./bancoHomologacao.sql
