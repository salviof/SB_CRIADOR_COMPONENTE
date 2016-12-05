source ./SB_CR_SBProjeto.prop
mysqladmin -u root create $NOME_BANCO
mysql -u root $NOME_BANCO < ./bancoHomologacao.sql
