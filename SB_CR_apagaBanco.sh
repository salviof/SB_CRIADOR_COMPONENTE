source ./SBProjeto.prop
source ./SB_CR_SBProjeto.prop
awk '$2 ~ /^[0-9]/ {print "KILL "$2";"}' | \
mysql -u root
mysqladmin -u root drop $NOME_BANCO -f
