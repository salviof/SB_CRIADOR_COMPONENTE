-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: superComprasModel
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AcaoDoSistema`
--

DROP TABLE IF EXISTS `AcaoDoSistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AcaoDoSistema` (
  `tipoAcaoDB` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `cor` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `diretorioBaseArquivos` varchar(255) DEFAULT NULL,
  `iconeAcao` varchar(255) DEFAULT NULL,
  `idDescritivoJira` varchar(255) DEFAULT NULL,
  `nomeAcao` varchar(255) DEFAULT NULL,
  `nomeSlugDominio` varchar(255) DEFAULT NULL,
  `nomeUnico` varchar(255) DEFAULT NULL,
  `precisaPermissao` bit(1) NOT NULL,
  `tipoAcao` varchar(255) DEFAULT NULL,
  `tipoAcaoGenerica` varchar(255) DEFAULT NULL,
  `acaoTemModal` bit(1) DEFAULT NULL,
  `campoJustificativa` varchar(255) DEFAULT NULL,
  `idMetodo` int(11) DEFAULT NULL,
  `precisaComunicacao` bit(1) DEFAULT NULL,
  `precisaJustificativa` bit(1) DEFAULT NULL,
  `temLogExecucao` bit(1) DEFAULT NULL,
  `textoComunicacaoPersonalizado` varchar(255) DEFAULT NULL,
  `xhtmlModalVinculado` varchar(255) DEFAULT NULL,
  `nomeDominio` varchar(255) DEFAULT NULL,
  `estadoFormulario` int(11) DEFAULT NULL,
  `xhtml` varchar(255) DEFAULT NULL,
  `nomeUnicoAcoesDisponiveis` tinyblob,
  `modulo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnff94k77k0bke2qf07y84ips5` (`modulo_id`),
  CONSTRAINT `FKnff94k77k0bke2qf07y84ips5` FOREIGN KEY (`modulo_id`) REFERENCES `ModuloAcaoSistema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AcaoDoSistema`
--

LOCK TABLES `AcaoDoSistema` WRITE;
/*!40000 ALTER TABLE `AcaoDoSistema` DISABLE KEYS */;
INSERT INTO `AcaoDoSistema` VALUES ('AcaoGestaoEntidade',-2105322184,NULL,'Gerencia produtos','/site/administrador/produto','icon-box','UI033','Gerenciar Produtos','PRODUTO','FabAcaoAdministrador.PRODUTO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/produto/produto_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-2045662374,NULL,'Gerenciamento de campanhas','/site/administrador/campanha','fa fa-bullhorn','UI018','Gerenciar campanhas','CAMPANHA','FabAcaoAdministrador.CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/campanha/campanha_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-2010723771,NULL,'Gerencia contratos','/site/administrador/contrato','fa fa-briefcase','UI084','Gerenciar Contrato','CONTRATO','FabAcaoAdministrador.CONTRATO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/contrato/contrato_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-1874789968,NULL,'Gerencia textos','/site/administrador/textos','fa fa-font',NULL,'Gerenciar textos','TEXTOS','FabAcaoAdministrador.TEXTOS_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/textos/textos_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-1407066025,NULL,'Gerencia formas de pagamento','/site/administrador/forma_de_pagamento','fa fa-money','UI050','Gerenciar Formas de Pagamento','FORMA_DE_PAGAMENTO','FabAcaoAdministrador.FORMA_DE_PAGAMENTO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/forma_de_pagamento/forma_de_pagamento_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-1406939282,NULL,'Gerencia as sugestões de campanhas','/site/comprador/sugestao_campanha','fa fa-lightbulb-o','UC025','Gerenciar Sugestao de Campanha','SUGESTAO_CAMPANHA','FabAcaoComprador.SUGESTAO_CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/sugestao_campanha/sugestao_campanha_gerenciar.xhtml',NULL,1389070057),('AcaoGestaoEntidade',-1253617710,NULL,'Descrição não documentada','/site/administrador/solicitacao_entrada_fornecedor','fa fa-sign-in','UI093','Gerenciamento de solcitações de fornecedores','SOLICITACAO_ENTRADA_FORNECEDOR','FabAcaoAdministrador.SOLICITACAO_ENTRADA_FORNECEDOR_MB_GERENCIAR_ENTRADA','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/solicitacao_entrada_fornecedor/solicitacao_entrada_fornecedor_gerenciar_entrada.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-1198482115,NULL,'Gerencia cidades','/site/administrador/cidade','fa fa-globe','UI037','Gerenciar Cidade','CIDADE','FabAcaoAdministrador.CIDADE_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/cidade/cidade_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-1155393754,NULL,'Descrição não documentada','/site/comprador/campanha','fa fa-gears','null','Gerenciar Camapanha','CAMPANHA','FabAcaoComprador.CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/campanha/campanha_gerenciar.xhtml',NULL,1389070057),('AcaoGestaoEntidade',-853488811,NULL,'','/site/administrador/administrador','fa fa-shield',NULL,'ADMINISTRADOR_MB_INICIAL','ADMINISTRADOR','FabAcaoAdministrador.ADMINISTRADOR_MB_INICIAL','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/administrador/administrador_inicial.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-765086278,NULL,'Descrição não documentada','/site/administrador/sugestao_campanha','fa fa-lightbulb-o','UC025','Gerenciar Sugestões de Campanha','SUGESTAO_CAMPANHA','FabAcaoAdministrador.SUGESTAO_CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/sugestao_campanha/sugestao_campanha_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-699761716,NULL,'Gerencia filiais de fornecedores','/site/administrador/fornecedor_filial','fa fa-home','UI013 - Listar Filiais','Gerenciar Filial Fornecedor','FORNECEDOR_FILIAL','FabAcaoAdministrador.FORNECEDOR_FILIAL_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/fornecedor_filial/fornecedor_filial_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-575666320,NULL,'Descrição não documentada','/site/administrador/pre_negociacao','fa fa-handshake-o',NULL,'Gerenciamento de Pré negociação','PRE_NEGOCIACAO','FabAcaoAdministrador.PRE_NEGOCIACAO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/pre_negociacao/pre_negociacao_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-148317508,NULL,'Descrição não documentada','/site/administrador/pedido','fa fa-cart-arrow-down',NULL,'Gerenciar Pedidos Administrador','PEDIDO','FabAcaoAdministrador.PEDIDO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/pedido/pedido_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-23616265,NULL,'Regras de Suspensão','/site/administrador/regras_suspensao','fa fa-table','UI006','Regras de Suspensão','REGRAS_SUSPENSAO','FabAcaoAdministrador.REGRAS_SUSPENSAO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/regras_suspensao/regras_suspensao_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-22974685,NULL,'Gerenciar Usuários','/site/administrador/usuario','fa fa-user','UI030','Usuários','USUARIO','FabAcaoAdministrador.USUARIO_MB_GERENCIAR','\0','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/usuario/usuario_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',-11260200,NULL,'Gerencia sms','/site/administrador/sms','fa fa-mobile','UI064','Gerenciar SMS','SMS','FabAcaoAdministrador.SMS_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/sms/sms_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',9557072,NULL,'Gerencia assunto fale conosco','/site/administrador/assunto_fale_conosco','fa fa-wechat','UI073','Gerenciar Assunto Fale Conosco','ASSUNTO_FALE_CONOSCO','FabAcaoAdministrador.ASSUNTO_FALE_CONOSCO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/assunto_fale_conosco/assunto_fale_conosco_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',217289421,NULL,'Regras de Inativação','/site/administrador/regras_inativacao','fa fa-table','UI006','Regras de Inativação','REGRAS_INATIVACAO','FabAcaoAdministrador.REGRAS_INATIVACAO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/regras_inativacao/regras_inativacao_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',241086620,NULL,'Gerencia fornecedores','/site/administrador/fornecedor','fa fa-truck','UI009.1','Gerenciar Forncedores','FORNECEDOR','FabAcaoAdministrador.FORNECEDOR_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/fornecedor/fornecedor_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',433677760,NULL,'Gerencia filiais de compradores','/site/administrador/comprador_filial','fa fa-home','UI013 - Listar Filiais','Gerenciar Filial Comprador','COMPRADOR_FILIAL','FabAcaoAdministrador.COMPRADOR_FILIAL_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/comprador_filial/comprador_filial_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',499134325,NULL,'Gerencia emails','/site/administrador/email','fa fa-envelope-o','UI055','Gerenciar Emails','EMAIL','FabAcaoAdministrador.EMAIL_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/email/email_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',679269602,NULL,'Gerencia as filiais de um comprador','/site/comprador/filial','fa fa-institution','UC014','Gerenciar Filial','FILIAL','FabAcaoComprador.FILIAL_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/filial/filial_gerenciar.xhtml',NULL,1389070057),('AcaoGestaoEntidade',864076341,NULL,'Gerencia banners','/site/administrador/banner','fa fa-image','UI082.1','Gerenciar Banner','BANNER','FabAcaoAdministrador.BANNER_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/banner/banner_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',958853429,NULL,'Alterar Configuração do Gateway','/site/administrador/alterar_configuracao_gateway','fa fa-table','UI006','Alterar Configuração do Gateway','ALTERAR_CONFIGURACAO_GATEWAY','FabAcaoAdministrador.ALTERAR_CONFIGURACAO_GATEWAY_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/alterar_configuracao_gateway/alterar_configuracao_gateway_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1115723404,NULL,'Gerencia uma filial de fornecedor','/site/fornecedor/filial','fa fa-institution','UC014','Gerenciar Filial','FILIAL','FabAcaoFornecedor.FILIAL_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/fornecedor/filial/filial_gerenciar.xhtml',NULL,1795722597),('AcaoFormEntidadeSec',1184127186,NULL,'Editar Usuário','/site/administrador/usuario','fa fa-edit','UI032.1','Editar Usuário','USUARIO','FabAcaoAdministrador.USUARIO_FRM_EDITAR','','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_EDITAR',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,'/site/administrador/usuario/usuario_editar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1225984425,NULL,'Gerencia regiões','/site/administrador/regioes','fa fa-map-marker','UI042','Gerenciar Regiao','REGIOES','FabAcaoAdministrador.REGIOES_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/regioes/regioes_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1287244168,NULL,'Gerencia os pedidos de comprador','/site/comprador/pedido','fa fa-pencil-square-o','UC020','Gerenciar Pedido','PEDIDO','FabAcaoComprador.PEDIDO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/pedido/pedido_gerenciar.xhtml',NULL,1389070057),('AcaoGestaoEntidade',1483528380,NULL,'Gerencia modelos de contrato','/site/administrador/modelo_contrato','fa fa-briefcase','UI088','Gerenciar Modelo de Contrato','MODELO_CONTRATO','FabAcaoAdministrador.MODELO_CONTRATO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/modelo_contrato/modelo_contrato_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1516544858,NULL,'Gerencia fale conosco','/site/administrador/fale_conosco','fa fa-wechat','UI070','Gerenciar Fale Conosco','FALE_CONOSCO','FabAcaoAdministrador.FALE_CONOSCO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/fale_conosco/fale_conosco_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1527083024,NULL,'Taxa Cancelamento Pedido','/site/administrador/taxa_cancelamento_pedido','fa fa-table','UI006','Taxa Cancelamento Pedido','TAXA_CANCELAMENTO_PEDIDO','FabAcaoAdministrador.TAXA_CANCELAMENTO_PEDIDO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/taxa_cancelamento_pedido/taxa_cancelamento_pedido_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1532141602,NULL,'Descrição não documentada','/site/administrador/solicitacao_entrada_comprador','fa fa-sign-in','UI093','Gerenciamento de solcitações de compradores','SOLICITACAO_ENTRADA_COMPRADOR','FabAcaoAdministrador.SOLICITACAO_ENTRADA_COMPRADOR_MB_GERENCIAR_ENTRADA','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/solicitacao_entrada_comprador/solicitacao_entrada_comprador_gerenciar_entrada.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1543103996,NULL,'Regras de Conversão da Campanha','/site/administrador/regras_conversao_campanha','fa fa-table','UI006','Regras de Conversão da Campanha','REGRAS_CONVERSAO_CAMPANHA','FabAcaoAdministrador.REGRAS_CONVERSAO_CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/regras_conversao_campanha/regras_conversao_campanha_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1562662344,NULL,'Gerencia newsletter','/site/administrador/newsletter','fa fa-newspaper-o','UI059','Gerenciar Newsletters','NEWSLETTER','FabAcaoAdministrador.NEWSLETTER_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/newsletter/newsletter_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1664882256,NULL,'Gerencia campanhas de um fornecedor','/site/fornecedor/campanha','fa fa-bar-chart-o','UC022','Gerenciar Campanhas','CAMPANHA','FabAcaoFornecedor.CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/fornecedor/campanha/campanha_gerenciar.xhtml',NULL,1795722597),('AcaoGestaoEntidade',1696480174,NULL,'Taxas Cancelamento Campanha','/site/administrador/taxa_cancelamento_campanha','fa fa-table','UI006','Taxas Cancelamento Campanha','TAXA_CANCELAMENTO_CAMPANHA','FabAcaoAdministrador.TAXA_CANCELAMENTO_CAMPANHA_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/taxa_cancelamento_campanha/taxa_cancelamento_campanha_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1723697970,NULL,'Gerenciar Pedido Fornecedor','/site/fornecedor/pedido','fa fa-pencil-square-o','UC023','Gerenciar Pedido Fornecedor','PEDIDO','FabAcaoFornecedor.PEDIDO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/fornecedor/pedido/pedido_gerenciar.xhtml',NULL,1795722597),('AcaoGestaoEntidade',1761307196,NULL,'Descrição não documentada','/site/comprador/pre_negociacao','fa fa-briefcase','UC026','Gerenciar Pre Negociacao','PRE_NEGOCIACAO','FabAcaoComprador.PRE_NEGOCIACAO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/pre_negociacao/pre_negociacao_gerenciar.xhtml',NULL,1389070057),('AcaoGestaoEntidade',1927303464,NULL,'Gerencia compradores','/site/administrador/comprador','fa fa-shopping-cart','UC001','Gerenciar Comprador','COMPRADOR','FabAcaoAdministrador.COMPRADOR_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/administrador/comprador/comprador_gerenciar.xhtml',NULL,-925014728),('AcaoGestaoEntidade',1976869712,NULL,'Gerenciar Fale Conosco','/site/fornecedor/fale_conosco','fa fa-mail',NULL,'Gerenciar Fale Conosco','FALE_CONOSCO','FabAcaoFornecedor.FALE_CONOSCO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/fornecedor/fale_conosco/fale_conosco_gerenciar.xhtml',NULL,1795722597),('AcaoGestaoEntidade',1988249894,NULL,'Gerenciar Fale Conosco','/site/comprador/fale_conosco','fa fa-envelope-o',NULL,'Gerenciar Fale Conosco','FALE_CONOSCO','FabAcaoComprador.FALE_CONOSCO_MB_GERENCIAR','','ACAO_ENTIDADE_GERENCIAR','GERENCIAR_DOMINIO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,'/site/comprador/fale_conosco/fale_conosco_gerenciar.xhtml',NULL,1389070057);
/*!40000 ALTER TABLE `AcaoDoSistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AssuntoFaleConosco`
--

DROP TABLE IF EXISTS `AssuntoFaleConosco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AssuntoFaleConosco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assunto` varchar(200) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataInclusao` date DEFAULT NULL,
  `destinatario` varchar(100) NOT NULL,
  `remetente` varchar(200) DEFAULT NULL,
  `tempoResposta` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AssuntoFaleConosco`
--

LOCK TABLES `AssuntoFaleConosco` WRITE;
/*!40000 ALTER TABLE `AssuntoFaleConosco` DISABLE KEYS */;
/*!40000 ALTER TABLE `AssuntoFaleConosco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AvaliacaoSugestaoCampanha`
--

DROP TABLE IF EXISTS `AvaliacaoSugestaoCampanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AvaliacaoSugestaoCampanha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `avaliacaoPositva` bit(1) NOT NULL,
  `daHoraAvaliacao` date DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `sugestaoCampanha_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8fjneyitu53vo4ufwmxb3lkxp` (`comprador_id`),
  KEY `FKooxj7s5kx1fji4wbk7dkujhb0` (`sugestaoCampanha_id`),
  KEY `FKc5wvujg1a48lvqr82ype4bsja` (`usuarioAlteracao_id`),
  KEY `FK1i6noo6caityybb8xj8xoe0h0` (`usuarioInsercao_id`),
  CONSTRAINT `FK1i6noo6caityybb8xj8xoe0h0` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK8fjneyitu53vo4ufwmxb3lkxp` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKc5wvujg1a48lvqr82ype4bsja` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKooxj7s5kx1fji4wbk7dkujhb0` FOREIGN KEY (`sugestaoCampanha_id`) REFERENCES `SugestaoDeCampanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AvaliacaoSugestaoCampanha`
--

LOCK TABLES `AvaliacaoSugestaoCampanha` WRITE;
/*!40000 ALTER TABLE `AvaliacaoSugestaoCampanha` DISABLE KEYS */;
/*!40000 ALTER TABLE `AvaliacaoSugestaoCampanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Bairro`
--

DROP TABLE IF EXISTS `Bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bairro` (
  `id` int(11) NOT NULL,
  `coordenadas` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cidade_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc6grs1jdy5u4dhdfsyd61jgk5` (`cidade_id`),
  CONSTRAINT `FKc6grs1jdy5u4dhdfsyd61jgk5` FOREIGN KEY (`cidade_id`) REFERENCES `Cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bairro`
--

LOCK TABLES `Bairro` WRITE;
/*!40000 ALTER TABLE `Bairro` DISABLE KEYS */;
INSERT INTO `Bairro` VALUES (1108321817,NULL,'bairroSimulacão',-1674173133);
/*!40000 ALTER TABLE `Bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BandeiraCartao`
--

DROP TABLE IF EXISTS `BandeiraCartao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BandeiraCartao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enumVinculado` int(11) DEFAULT NULL,
  `icone` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BandeiraCartao`
--

LOCK TABLES `BandeiraCartao` WRITE;
/*!40000 ALTER TABLE `BandeiraCartao` DISABLE KEYS */;
INSERT INTO `BandeiraCartao` VALUES (1,0,NULL,'Visa'),(2,1,NULL,'MasterCard'),(3,2,NULL,'America Express');
/*!40000 ALTER TABLE `BandeiraCartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Banner`
--

DROP TABLE IF EXISTS `Banner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `banner` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataFinal` date DEFAULT NULL,
  `dataInicial` date DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tela` varchar(255) DEFAULT NULL,
  `tempoExibicao` int(11) NOT NULL,
  `tipoExibicao` int(11) NOT NULL,
  `campanha_id` int(11) DEFAULT NULL,
  `usuarioAteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKshtjay1qyry8arkp12f6vhuaj` (`campanha_id`),
  KEY `FK9p16tqa9oshkpxikh214p8has` (`usuarioAteracao_id`),
  KEY `FKq0yj15voij339ftgjg7r9vqkr` (`usuarioInsercao_id`),
  CONSTRAINT `FK9p16tqa9oshkpxikh214p8has` FOREIGN KEY (`usuarioAteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKq0yj15voij339ftgjg7r9vqkr` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKshtjay1qyry8arkp12f6vhuaj` FOREIGN KEY (`campanha_id`) REFERENCES `Campanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Banner`
--

LOCK TABLES `Banner` WRITE;
/*!40000 ALTER TABLE `Banner` DISABLE KEYS */;
/*!40000 ALTER TABLE `Banner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Campanha`
--

DROP TABLE IF EXISTS `Campanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Campanha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `chamada` varchar(255) DEFAULT NULL,
  `criadoAdministrador` bit(1) NOT NULL,
  `criadoPeloFornecedor` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataDeEncerramento` datetime(6) DEFAULT NULL,
  `dataDeEntrega` datetime(6) DEFAULT NULL,
  `dataDeInicio` datetime(6) DEFAULT NULL,
  `descricaoCompleta` varchar(500) DEFAULT NULL,
  `imagem` varchar(255) DEFAULT NULL,
  `multiploDeEmbarqueMaximo` int(11) NOT NULL,
  `nomeTipoEntrega` varchar(255) DEFAULT NULL,
  `percentualDeAtendimento` double NOT NULL,
  `prazoDeEntrega` int(11) NOT NULL,
  `qtdCampanhasSuperKompras` int(11) NOT NULL,
  `qtdMaximaDisponivelParaVendaEmUnidades` int(11) NOT NULL,
  `qtdMaximaDisponivelParaVendaEmVolume` int(11) NOT NULL,
  `qtdMinimaAceitavelParaconversao` int(11) NOT NULL,
  `qtdMinimaParaConversao` int(11) NOT NULL,
  `qtdPedidosAConfirmar` int(11) NOT NULL,
  `qtdPedidosConfirmados` int(11) NOT NULL,
  `qtdPedidosFeitos` int(11) NOT NULL,
  `qtdVendidaEmVolume` int(11) NOT NULL,
  `tempConvCampSegundos` date DEFAULT NULL,
  `tempoConversao` datetime(6) DEFAULT NULL,
  `tempoConversaoEmDias` int(11) NOT NULL,
  `tempoConversaoHoras` int(11) NOT NULL,
  `tempoConversaoMinutos` int(11) NOT NULL,
  `tempoConversaoSegundos` int(11) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `valorAConfirmar` double NOT NULL,
  `valorConfirmado` double NOT NULL,
  `valorEsperado` double NOT NULL,
  `filialFornecedor_id` int(11) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `regiaoAtendimento_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `tipoEntrega_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdc1fh80vef5holn2hul4d1cu3` (`filialFornecedor_id`),
  KEY `FKj0h2sum8itnoxj1l1gbife070` (`fornecedor_id`),
  KEY `FKb06qhrkp2ct23gxtpounj5oo7` (`regiaoAtendimento_id`),
  KEY `FKokisw0cuh16v3w3mn9bmwout4` (`status_id`),
  KEY `FK6vl5ii04vrnso9njad0gtca69` (`tipoEntrega_id`),
  KEY `FK28pk0acrknuk83elqydsey07s` (`usuarioAlteracao_id`),
  KEY `FKlnr7qseddohgb4n98lcm8vfdx` (`usuarioInsercao_id`),
  CONSTRAINT `FK28pk0acrknuk83elqydsey07s` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK6vl5ii04vrnso9njad0gtca69` FOREIGN KEY (`tipoEntrega_id`) REFERENCES `TipoEntrega` (`id`),
  CONSTRAINT `FKb06qhrkp2ct23gxtpounj5oo7` FOREIGN KEY (`regiaoAtendimento_id`) REFERENCES `Regiao` (`id`),
  CONSTRAINT `FKdc1fh80vef5holn2hul4d1cu3` FOREIGN KEY (`filialFornecedor_id`) REFERENCES `FilialFornecedor` (`id`),
  CONSTRAINT `FKj0h2sum8itnoxj1l1gbife070` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKlnr7qseddohgb4n98lcm8vfdx` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKokisw0cuh16v3w3mn9bmwout4` FOREIGN KEY (`status_id`) REFERENCES `StatusCampanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Campanha`
--

LOCK TABLES `Campanha` WRITE;
/*!40000 ALTER TABLE `Campanha` DISABLE KEYS */;
/*!40000 ALTER TABLE `Campanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Campanha_Bairro`
--

DROP TABLE IF EXISTS `Campanha_Bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Campanha_Bairro` (
  `Campanha_id` int(11) NOT NULL,
  `bairroNaoAtendido_id` int(11) NOT NULL,
  `bairroAtendido_id` int(11) NOT NULL,
  KEY `FK90oc3ntkr37iqt3fk3wktd13l` (`bairroNaoAtendido_id`),
  KEY `FKevii54exnsydi2nggn4tqmx34` (`Campanha_id`),
  KEY `FK242046jgo8gkesusa47jk1jha` (`bairroAtendido_id`),
  CONSTRAINT `FK242046jgo8gkesusa47jk1jha` FOREIGN KEY (`bairroAtendido_id`) REFERENCES `Bairro` (`id`),
  CONSTRAINT `FK90oc3ntkr37iqt3fk3wktd13l` FOREIGN KEY (`bairroNaoAtendido_id`) REFERENCES `Bairro` (`id`),
  CONSTRAINT `FKevii54exnsydi2nggn4tqmx34` FOREIGN KEY (`Campanha_id`) REFERENCES `Campanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Campanha_Bairro`
--

LOCK TABLES `Campanha_Bairro` WRITE;
/*!40000 ALTER TABLE `Campanha_Bairro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Campanha_Bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Campanha_Cidade`
--

DROP TABLE IF EXISTS `Campanha_Cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Campanha_Cidade` (
  `Campanha_id` int(11) NOT NULL,
  `cidadeNaoAtendida_id` int(11) NOT NULL,
  `cidadeAtendida_id` int(11) NOT NULL,
  KEY `FKsdy2ffbkl118s6bgj43873jg1` (`cidadeNaoAtendida_id`),
  KEY `FKcp1wmoprwe6ejkkieu62qay09` (`Campanha_id`),
  KEY `FKcxtm0prc8kd5am5b3iufdtubd` (`cidadeAtendida_id`),
  CONSTRAINT `FKcp1wmoprwe6ejkkieu62qay09` FOREIGN KEY (`Campanha_id`) REFERENCES `Campanha` (`id`),
  CONSTRAINT `FKcxtm0prc8kd5am5b3iufdtubd` FOREIGN KEY (`cidadeAtendida_id`) REFERENCES `Cidade` (`id`),
  CONSTRAINT `FKsdy2ffbkl118s6bgj43873jg1` FOREIGN KEY (`cidadeNaoAtendida_id`) REFERENCES `Cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Campanha_Cidade`
--

LOCK TABLES `Campanha_Cidade` WRITE;
/*!40000 ALTER TABLE `Campanha_Cidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `Campanha_Cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Campanha_FormasPagamento`
--

DROP TABLE IF EXISTS `Campanha_FormasPagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Campanha_FormasPagamento` (
  `campanha_id` int(11) NOT NULL,
  `formaPagamento_id` int(11) NOT NULL,
  KEY `FKd1mks796xrys1t5wj7428gh2k` (`formaPagamento_id`),
  KEY `FKgs01hqjrguy8o705qsgyy0cds` (`campanha_id`),
  CONSTRAINT `FKd1mks796xrys1t5wj7428gh2k` FOREIGN KEY (`formaPagamento_id`) REFERENCES `FormaPagamentoPedidoCampanha` (`id`),
  CONSTRAINT `FKgs01hqjrguy8o705qsgyy0cds` FOREIGN KEY (`campanha_id`) REFERENCES `Campanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Campanha_FormasPagamento`
--

LOCK TABLES `Campanha_FormasPagamento` WRITE;
/*!40000 ALTER TABLE `Campanha_FormasPagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Campanha_FormasPagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CartaoTokenCielo`
--

DROP TABLE IF EXISTS `CartaoTokenCielo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CartaoTokenCielo` (
  `tipoCartao` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `dataHoraCriou` datetime(6) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `finalCartao` varchar(255) NOT NULL,
  `nomeUsuario` varchar(255) NOT NULL,
  `respostaCielo` text,
  `token` varchar(255) DEFAULT NULL,
  `validadeCartao` varchar(255) DEFAULT NULL,
  `codigoUnicoCartao` varchar(255) DEFAULT NULL,
  `dataHoraEditou` datetime(6) DEFAULT NULL,
  `dataNascimentoUsuario` date DEFAULT NULL,
  `emailUsuario` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `bandeira_id` int(11) NOT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_8qw85jfowwgmcaud44rq9y16f` (`codigoUnicoCartao`),
  KEY `FKemying57pg3wyj2tsw27fgdqq` (`bandeira_id`),
  KEY `FK1j7jwt09bicjx8lyskiqpob19` (`comprador_id`),
  CONSTRAINT `FK1j7jwt09bicjx8lyskiqpob19` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKemying57pg3wyj2tsw27fgdqq` FOREIGN KEY (`bandeira_id`) REFERENCES `BandeiraCartao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CartaoTokenCielo`
--

LOCK TABLES `CartaoTokenCielo` WRITE;
/*!40000 ALTER TABLE `CartaoTokenCielo` DISABLE KEYS */;
/*!40000 ALTER TABLE `CartaoTokenCielo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CategoriadoProduto`
--

DROP TABLE IF EXISTS `CategoriadoProduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CategoriadoProduto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CategoriadoProduto`
--

LOCK TABLES `CategoriadoProduto` WRITE;
/*!40000 ALTER TABLE `CategoriadoProduto` DISABLE KEYS */;
INSERT INTO `CategoriadoProduto` VALUES (1,'Bebidas em geral','Bebidas'),(2,'Alimentos em potes, e Latas, que não precisão de refrigeração, Macarrão, Molhos e outros','Mercearia'),(3,'Arroz, feijão, trigo, soja, amendoim, ervilha, lentilha, etc','Cereais e Farinácios'),(4,'Biscoitos e Chocolates','Biscoitos e chocolates'),(5,'Produtos de padaria','Padaria'),(6,'Carnes de Peixe, Bovino, Suino e Aves','Carnes'),(7,'Horta e Frutas','Hortifruti'),(8,'Iorgutes, sobremesas, Leite, queijo, requeijão etc.','Frios e Laticinios'),(9,'Lazanha, Empanados, pizza,Legume congelado, pão de queijo etc','Congelados'),(10,'Perfumaria e Higiene','Perfumaria e Higiene'),(11,'Produtos de limpeza','Limpeza'),(12,'Papelaria, armarinho, aviamento, decoração etc.','Utilidades e Bazar'),(13,'Alimento para animais','Animais');
/*!40000 ALTER TABLE `CategoriadoProduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cidade`
--

DROP TABLE IF EXISTS `Cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cidade` (
  `id` int(11) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataCriacao` date DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `id_Localidade` int(11) DEFAULT NULL,
  `unidadeFederativa_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgj6br5dxt0ht6uje8hy4n2wgw` (`id_Localidade`),
  KEY `FK8fbd6ik5ht9qwwaik1mi6jgf0` (`unidadeFederativa_id`),
  CONSTRAINT `FK8fbd6ik5ht9qwwaik1mi6jgf0` FOREIGN KEY (`unidadeFederativa_id`) REFERENCES `UnidadeFederativa` (`id`),
  CONSTRAINT `FKgj6br5dxt0ht6uje8hy4n2wgw` FOREIGN KEY (`id_Localidade`) REFERENCES `Localidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cidade`
--

LOCK TABLES `Cidade` WRITE;
/*!40000 ALTER TABLE `Cidade` DISABLE KEYS */;
INSERT INTO `Cidade` VALUES (-1972251336,'','2018-05-16','2018-05-16','Ibirité',NULL,2458),(-1956268076,'','2018-05-16','2018-05-16','Itatiaiuçu',NULL,2458),(-1925135746,'','2018-05-16','2018-05-16','São_Jose_da_Lapa',NULL,2458),(-1856687620,'','2018-05-16','2018-05-16','Sabara',NULL,2458),(-1836501561,'','2018-05-16','2018-05-16','Igarapé',NULL,2458),(-1727579347,'','2018-05-16','2018-05-16','Mateus_Leme',NULL,2458),(-1707232582,'','2018-05-16','2018-05-16','Sarzedo',NULL,2458),(-1674173133,'','2018-05-16','2018-05-16','BELO_HORIZONTE',NULL,2458),(-1536122825,'','2018-05-16','2018-05-16','Santa_Luzia',NULL,2458),(-1486711115,'','2018-05-16','2018-05-16','Pedro_Leopoldo',NULL,2458),(-1411626103,'','2018-05-16','2018-05-16','Sao_Joaquim_de_Bicas',NULL,2458),(-1330591657,'','2018-05-16','2018-05-16','Vespasiano',NULL,2458),(-982302286,'','2018-05-16','2018-05-16','Capim_Branco',NULL,2458),(-880559648,'','2018-05-16','2018-05-16','MArio_Campos',NULL,2458),(-548111402,'','2018-05-16','2018-05-16','Juatuba',NULL,2458),(-93790049,'','2018-05-16','2018-05-16','Esmeraldas',NULL,2458),(63091029,'','2018-05-16','2018-05-16','Betim',NULL,2458),(63881304,'','2018-05-16','2018-05-16','Caeté',NULL,2458),(215178624,'','2018-05-16','2018-05-16','CONTAGEM',NULL,2458),(368938548,'','2018-05-16','2018-05-16','Rio_Acima',NULL,2458),(379966223,'','2018-05-16','2018-05-16','Rio_Manso',NULL,2458),(639869084,'','2018-05-16','2018-05-16','Matozinhos',NULL,2458),(713529131,'','2018-05-16','2018-05-16','Nova_União',NULL,2458),(1027141852,'','2018-05-16','2018-05-16','Jaboticatubas',NULL,2458),(1117164662,'','2018-05-16','2018-05-16','Ribeirao_das_Neves',NULL,2458),(1149021320,'','2018-05-16','2018-05-16','Florestal',NULL,2458),(1386876023,'','2018-05-16','2018-05-16','Brumadinho',NULL,2458),(1669100074,'','2018-05-16','2018-05-16','Confins',NULL,2458),(1698070089,'','2018-05-16','2018-05-16','Raposos',NULL,2458),(1841062860,'','2018-05-16','2018-05-16','Itaguara',NULL,2458),(1951884635,'','2018-05-16','2018-05-16','Baldim',NULL,2458),(1962406916,'','2018-05-16','2018-05-16','Nova_Lima',NULL,2458),(2101622002,'','2018-05-16','2018-05-16','Lagoa_Santa',NULL,2458),(2103479604,'','2018-05-16','2018-05-16','Taquaracu_de_Minas',NULL,2458);
/*!40000 ALTER TABLE `Cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Comprador`
--

DROP TABLE IF EXISTS `Comprador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Comprador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(10) DEFAULT NULL,
  `banco` varchar(50) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `conta` varchar(10) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `inscricaoEstadual` varchar(15) DEFAULT NULL,
  `inscricaoMunicipal` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `percentual` int(11) NOT NULL,
  `quantidadeCheckOuts` int(11) NOT NULL,
  `quantidadeFuncionarios` int(11) NOT NULL,
  `quantidadeLojas` int(11) NOT NULL,
  `razaoSocial` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `volumeDeCompraMensal` double NOT NULL,
  `arquivoAnalisedeCredito_id` int(11) DEFAULT NULL,
  `arquivoCNPJ_id` int(11) DEFAULT NULL,
  `arquivoComprovanteDeEndereco_id` int(11) DEFAULT NULL,
  `arquivoContratoSocial_id` int(11) DEFAULT NULL,
  `arquivoDadosBancarios_id` int(11) DEFAULT NULL,
  `arquivoDocSocios_id` int(11) DEFAULT NULL,
  `filialPrincipal_id` int(11) DEFAULT NULL,
  `gerenteComercial_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `responsavelPelaEmpresa_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  `usuarioPrincipal_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1tabqe474r9ge7ygf22xr3wwx` (`arquivoAnalisedeCredito_id`),
  KEY `FKaxfo17mhcrcdxv6kts3go868v` (`arquivoCNPJ_id`),
  KEY `FK2c1g2bmmw9vgmkcl02rfkfbd2` (`arquivoComprovanteDeEndereco_id`),
  KEY `FKh33xt17lf2fkqow53xqs1ftq1` (`arquivoContratoSocial_id`),
  KEY `FKldy5ffoxtrjjqmadgghr2w8ss` (`arquivoDadosBancarios_id`),
  KEY `FKgse9ohowyq9o5fec0knpjlpv` (`arquivoDocSocios_id`),
  KEY `FK46rsotgmaefgfj0imonx6exy0` (`filialPrincipal_id`),
  KEY `FKew31twy128akrhrjt0cpt8136` (`gerenteComercial_id`),
  KEY `FKgbs59h80ecfqn3ycfj5yawyss` (`localizacao_id`),
  KEY `FKi9e0g9blmuj9hwqr9fn2ycf3d` (`responsavelPelaEmpresa_id`),
  KEY `FKexaie7hacmiyjjfl14t5eppm5` (`status_id`),
  KEY `FK6y2uj3kkve2brocujbyxlcb08` (`usuarioAlteracao_id`),
  KEY `FKdbgss5793d696gimd77d05qys` (`usuarioInsercao_id`),
  KEY `FK3d8tclvbn726c6a78fpb4u9oy` (`usuarioPrincipal_id`),
  CONSTRAINT `FK1tabqe474r9ge7ygf22xr3wwx` FOREIGN KEY (`arquivoAnalisedeCredito_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FK2c1g2bmmw9vgmkcl02rfkfbd2` FOREIGN KEY (`arquivoComprovanteDeEndereco_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FK3d8tclvbn726c6a78fpb4u9oy` FOREIGN KEY (`usuarioPrincipal_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK46rsotgmaefgfj0imonx6exy0` FOREIGN KEY (`filialPrincipal_id`) REFERENCES `FilialComprador` (`id`),
  CONSTRAINT `FK6y2uj3kkve2brocujbyxlcb08` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKaxfo17mhcrcdxv6kts3go868v` FOREIGN KEY (`arquivoCNPJ_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKdbgss5793d696gimd77d05qys` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKew31twy128akrhrjt0cpt8136` FOREIGN KEY (`gerenteComercial_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKexaie7hacmiyjjfl14t5eppm5` FOREIGN KEY (`status_id`) REFERENCES `StatusComprador` (`id`),
  CONSTRAINT `FKgbs59h80ecfqn3ycfj5yawyss` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKgse9ohowyq9o5fec0knpjlpv` FOREIGN KEY (`arquivoDocSocios_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKh33xt17lf2fkqow53xqs1ftq1` FOREIGN KEY (`arquivoContratoSocial_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKi9e0g9blmuj9hwqr9fn2ycf3d` FOREIGN KEY (`responsavelPelaEmpresa_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKldy5ffoxtrjjqmadgghr2w8ss` FOREIGN KEY (`arquivoDadosBancarios_id`) REFERENCES `Documento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Comprador`
--

LOCK TABLES `Comprador` WRITE;
/*!40000 ALTER TABLE `Comprador` DISABLE KEYS */;
INSERT INTO `Comprador` VALUES (1,'777','TestBank','11111111111111','65666665','2018-05-16','666','999','comprador simulação',0,6,0,0,'SimulationCompany S/A',NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,2,1,1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `Comprador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CompradorSolicitante`
--

DROP TABLE IF EXISTS `CompradorSolicitante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompradorSolicitante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataHoraInsercao` date DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `mensagem` varchar(200) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `qtdCheckouts` int(11) NOT NULL,
  `qtdFuncionarios` int(11) NOT NULL,
  `qtdLojas` int(11) NOT NULL,
  `razaoSocial` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `contatoResponsavel_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_7kc9hhl6nr935hvw2vjvn6wkt` (`cnpj`),
  KEY `FKm2wm5b05jvvnnxau1u506l39q` (`contatoResponsavel_id`),
  KEY `FKeh611vkyff8vam054swhm8p6d` (`localizacao_id`),
  KEY `FKhxr1c33qyhswiyx0h3mvlngvp` (`usuarioAlteracao_id`),
  KEY `FK29to1so6slahvbj9fc2i7uek8` (`usuarioInsercao_id`),
  CONSTRAINT `FK29to1so6slahvbj9fc2i7uek8` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKeh611vkyff8vam054swhm8p6d` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKhxr1c33qyhswiyx0h3mvlngvp` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKm2wm5b05jvvnnxau1u506l39q` FOREIGN KEY (`contatoResponsavel_id`) REFERENCES `ContatoSuperCompras` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CompradorSolicitante`
--

LOCK TABLES `CompradorSolicitante` WRITE;
/*!40000 ALTER TABLE `CompradorSolicitante` DISABLE KEYS */;
/*!40000 ALTER TABLE `CompradorSolicitante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Comprador_ContatoSuperCompras`
--

DROP TABLE IF EXISTS `Comprador_ContatoSuperCompras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Comprador_ContatoSuperCompras` (
  `Comprador_id` int(11) NOT NULL,
  `referencias_id` int(11) NOT NULL,
  UNIQUE KEY `UK_kpvysdpjb4i7dkqnm7hp9w2kb` (`referencias_id`),
  KEY `FKt4gtu1pn09dp76rlbq6v00xd6` (`Comprador_id`),
  CONSTRAINT `FKd8colxbqhqanigye8l2yadnay` FOREIGN KEY (`referencias_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKt4gtu1pn09dp76rlbq6v00xd6` FOREIGN KEY (`Comprador_id`) REFERENCES `Comprador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Comprador_ContatoSuperCompras`
--

LOCK TABLES `Comprador_ContatoSuperCompras` WRITE;
/*!40000 ALTER TABLE `Comprador_ContatoSuperCompras` DISABLE KEYS */;
/*!40000 ALTER TABLE `Comprador_ContatoSuperCompras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConfiguracaoDePermissao`
--

DROP TABLE IF EXISTS `ConfiguracaoDePermissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConfiguracaoDePermissao` (
  `id` int(11) NOT NULL,
  `nomeConfig` varchar(255) DEFAULT NULL,
  `permitirCriacaoDeGrupos` bit(1) NOT NULL,
  `permitirPermissaoDeUsuario` bit(1) NOT NULL,
  `ultimaVersaoBanco` varchar(255) DEFAULT NULL,
  `grupoUsuarioPadrao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKah1otecpdqxj49533o8geb7c0` (`grupoUsuarioPadrao_id`),
  CONSTRAINT `FKah1otecpdqxj49533o8geb7c0` FOREIGN KEY (`grupoUsuarioPadrao_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConfiguracaoDePermissao`
--

LOCK TABLES `ConfiguracaoDePermissao` WRITE;
/*!40000 ALTER TABLE `ConfiguracaoDePermissao` DISABLE KEYS */;
INSERT INTO `ConfiguracaoDePermissao` VALUES (0,NULL,'\0','\0','4120946256',NULL);
/*!40000 ALTER TABLE `ConfiguracaoDePermissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ContatoSuperCompras`
--

DROP TABLE IF EXISTS `ContatoSuperCompras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ContatoSuperCompras` (
  `tipoContato` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `celular` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `nome` varchar(80) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsdjhtnjcaqsg9yaajj9nd907l` (`fornecedor_id`),
  KEY `FK9ehjc2km5apa01mtg7dvxncia` (`comprador_id`),
  CONSTRAINT `FK9ehjc2km5apa01mtg7dvxncia` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKsdjhtnjcaqsg9yaajj9nd907l` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ContatoSuperCompras`
--

LOCK TABLES `ContatoSuperCompras` WRITE;
/*!40000 ALTER TABLE `ContatoSuperCompras` DISABLE KEYS */;
INSERT INTO `ContatoSuperCompras` VALUES ('ResponsavelComprador',1,'31999999999','email@email.com','nome','3133333333','cargo','11111111111',NULL,NULL),('GerenteComercial',2,'celular','email','nome','telefone',NULL,'CPF',NULL,NULL),('ResponsavelFornecedor',3,'31999999999','emaillll@emailll.com','nome','3133333333','cargo','CPF',NULL,NULL),('GerenteComercial',4,'celular','email','nome','telefone',NULL,'CPF',NULL,NULL);
/*!40000 ALTER TABLE `ContatoSuperCompras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Documento`
--

DROP TABLE IF EXISTS `Documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Documento` (
  `tipoDocumento` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `dataHoracriacao` datetime(6) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `nomeArquivo` varchar(255) DEFAULT NULL,
  `numeroContrato` int(11) NOT NULL,
  `docAssinatura` varchar(255) DEFAULT NULL,
  `pdf` varchar(255) DEFAULT NULL,
  `rascunho` varchar(9999) DEFAULT NULL,
  `razaoSocial` varchar(255) DEFAULT NULL,
  `compradorVinculado_id` int(11) DEFAULT NULL,
  `fornecedorVinculado_id` int(11) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `filialComprador_id` int(11) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `modeloRelacionado_id` int(11) DEFAULT NULL,
  `filial_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKju7u0insi5fd40ua1psy2tmnm` (`compradorVinculado_id`),
  KEY `FKlvht15vnacysohk0tg2baersh` (`fornecedorVinculado_id`),
  KEY `FKeg63mj9ffvfd8rdcw6rqxflfj` (`comprador_id`),
  KEY `FK8wrankre53oooswu09nbi8wxl` (`filialComprador_id`),
  KEY `FKiss6b9yq1broaru0vtd3ys9r` (`fornecedor_id`),
  KEY `FKpu3ce3xdm1ygh9jqgxswwvhbg` (`modeloRelacionado_id`),
  KEY `FKdxwcm8rdxgylj4queo421ohae` (`filial_id`),
  CONSTRAINT `FK8wrankre53oooswu09nbi8wxl` FOREIGN KEY (`filialComprador_id`) REFERENCES `FilialComprador` (`id`),
  CONSTRAINT `FKdxwcm8rdxgylj4queo421ohae` FOREIGN KEY (`filial_id`) REFERENCES `FilialFornecedor` (`id`),
  CONSTRAINT `FKeg63mj9ffvfd8rdcw6rqxflfj` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKiss6b9yq1broaru0vtd3ys9r` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKju7u0insi5fd40ua1psy2tmnm` FOREIGN KEY (`compradorVinculado_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKlvht15vnacysohk0tg2baersh` FOREIGN KEY (`fornecedorVinculado_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKpu3ce3xdm1ygh9jqgxswwvhbg` FOREIGN KEY (`modeloRelacionado_id`) REFERENCES `ModeloContrato` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Documento`
--

LOCK TABLES `Documento` WRITE;
/*!40000 ALTER TABLE `Documento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Documento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Documento_LogAcesso`
--

DROP TABLE IF EXISTS `Documento_LogAcesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Documento_LogAcesso` (
  `Documento_id` int(11) NOT NULL,
  `acessos_id` int(11) NOT NULL,
  KEY `FK4cccj2w8xgqhrplyrduu54ggb` (`acessos_id`),
  KEY `FK1i0ha60kwnc9wf4xd85v3klbj` (`Documento_id`),
  CONSTRAINT `FK1i0ha60kwnc9wf4xd85v3klbj` FOREIGN KEY (`Documento_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FK4cccj2w8xgqhrplyrduu54ggb` FOREIGN KEY (`acessos_id`) REFERENCES `LogAcesso` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Documento_LogAcesso`
--

LOCK TABLES `Documento_LogAcesso` WRITE;
/*!40000 ALTER TABLE `Documento_LogAcesso` DISABLE KEYS */;
/*!40000 ALTER TABLE `Documento_LogAcesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EmailTransacionalSK`
--

DROP TABLE IF EXISTS `EmailTransacionalSK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EmailTransacionalSK` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assunto` varchar(300) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `conteudo` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataCriacao` date DEFAULT NULL,
  `descricao` varchar(300) NOT NULL,
  `tipoMensagem_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgk2oven04q3y08ige088jsl64` (`tipoMensagem_id`),
  KEY `FKlottc4v1y4go4n375ggbqyeon` (`usuarioAlteracao_id`),
  KEY `FKdou7phdpb56pn0fj6vnuw2arr` (`usuarioInsercao_id`),
  CONSTRAINT `FKdou7phdpb56pn0fj6vnuw2arr` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKgk2oven04q3y08ige088jsl64` FOREIGN KEY (`tipoMensagem_id`) REFERENCES `TipoMensagemSK` (`id`),
  CONSTRAINT `FKlottc4v1y4go4n375ggbqyeon` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EmailTransacionalSK`
--

LOCK TABLES `EmailTransacionalSK` WRITE;
/*!40000 ALTER TABLE `EmailTransacionalSK` DISABLE KEYS */;
INSERT INTO `EmailTransacionalSK` VALUES (1,'Seja Bem vindo','\0','Prezado Parceiro, Seja bem vindo ao SuperKompras segue seus dados [UsuarioSB.email] e [UsuarioSB.senha]. Lembre-se no primeiro acesso você deverá alterar sua senha.','2018-05-16','2018-05-16','Transição do status “Aguardando Contrato” para Ativo',5,NULL,NULL),(2,'Pedido Aguardando Término da Campanha','\0','Prezado Parceiro, o pagamento do seu pedido [Pedido.id], foi aprovado e está aguardando o término da campanha [Pedido.campanha.titulo]','2018-05-16','2018-05-16','Pagamento Aprovado',4,NULL,NULL),(3,'Pendencia no pagamento da Taxa de Pàrticipação','\0','Parceiro, houve um problema no pagamento da taxa do seu pedido [Pedido.id], da campanha [Pedido.campanha.titulo], verifique para não perder a oportunidade, lembre-se os produtos da campanha são limitados e podem acabar.','2018-05-16','2018-05-16','Pagamento Reprovado',4,NULL,NULL),(4,'Pedido Confirmado','\0','Prezado Parceiro, seu pedido [Pedido.id] foi confirmado e está aguardando a entrega pelo fornecedor.','2018-05-16','2018-05-16','Transição do status do pedido de “Aguardando Termino da Campanha” para Confirmado. E da Campanha de “Vigente” para “Convertida”',4,NULL,NULL),(5,'Pedido Faturado','\0','Prezado Parceiro, seu pedido [Pedido.id] foi faturado, você já pode verificar a nota fiscal no nosso sistema.','2018-05-16','2018-05-16','Cadastro da nota fiscal',4,NULL,NULL),(6,'Pedido Finalizado','\0','Prezado Parceiro, seu pedido [Pedido.id] foi finalizado, qualquer problema entre em contato conosco pelo Fale Conosco.','2018-05-16','2018-05-16','Transição do status Faturado para Finalizado',4,NULL,NULL),(7,'Taxa de Participação estornada','\0','Prezado Parceiro, a taxa de participação do seu pedido [Pedido.id], foi estornada.','2018-05-16','2018-05-16','Campanha com status “Vigente” e Transição do status do pedido de Aguardando termino da campanha para cancelado.',4,NULL,NULL),(8,'Divulgação de nova campanha','\0','Prezado Parceiro, nova campanha no dia [Campanha.dataDeInicio] a partir das 00:00.','2018-05-16','2018-05-16','Uma vez por dia, do dia em que a campanha foi aprovada até um dia antes da data de inicio da campanha',3,NULL,NULL),(9,'Nova Campanha em Andamento','\0','Prezado Parceiro, campanha [Campanha.titulo] foi aberta, lembre-se os produtos são limitados por campanha.','2018-05-16','2018-05-16','Transição do status da campanha de Aprovada para vigente',3,NULL,NULL),(10,'Campanha Vigente','\0','Prezado Parceiro, sua campanha [Campanha.titulo], já está em andamento.','2018-05-16','2018-05-16','Transição do status da campanha de Aprovada para vigente',3,NULL,NULL),(11,'Campanha no final','\0','Prezado Parceiro, a campanha [Campanha.titulo], está chegando ao final, não perca a oportunidade.','2018-05-16','2018-05-16','Envio a 5 horas da data final da campanha. (o prazo 5 poderá ser alterdo pelo administrador)',3,NULL,NULL),(12,'Campanha convertida','\0','Prezado Parceiro, sua campanha [Campanha.titulo], foi convertida.','2018-05-16','2018-05-16','Transição do status da campanha de Vigente para Convertida',3,NULL,NULL),(13,'Conversão Manual','\0','Prezado Parceiro, sua campanha não atingiu o minimo aceitavel, mas você ainda pode converte-la manualmente.','2018-05-16','2018-05-16','Campanha não atingiu o minimo aceitavel',3,NULL,NULL),(14,'Campanha Cancelada','\0','Prezado Parceiro, sua campanha [Campanha.titulo], foi cancelada','2018-05-16','2018-05-16','Campanha entra no status Cancelada',3,NULL,NULL),(15,'Campanha Cancelada','\0','Prezado Parceiro, a campanha [Campanha.titulo] foi cancelada, em breve a sua taxa de participação será estornada.','2018-05-16','2018-05-16','Campanha entra no status Cancelada e pedido encontra-se no status Aguardando término da campanha.',3,NULL,NULL),(16,'Nota fiscal da taxa de participação','\0','Prezado Parceiro, a nota fiscal da taxa de participação, do pedido foi gerada e enviada ao seu e-mail.','2018-05-16','2018-05-16','Campanha entra no status convertida',4,NULL,NULL),(17,'Campanha Aprovada','\0','Prezado Parceiro, sua campanha [Campanha.titulo], foi aprovada.','2018-05-16','2018-05-16','Campanha entra no status Aprovada, somente quando o Administrador aprovar',3,NULL,NULL),(18,'Campanha Reprovada','\0','Prezado Parceiro, a Campanha [Campanha.titulo] foi reprovada.','2018-05-16','2018-05-16','Campanha entra no status Reprovada, somente quando o Administrador reprovar',3,NULL,NULL),(19,'Sugestão Campanha','\0','','2018-05-16','2018-05-16','Sugestão atingir 20 votos positivos',6,NULL,NULL);
/*!40000 ALTER TABLE `EmailTransacionalSK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FaleConosco`
--

DROP TABLE IF EXISTS `FaleConosco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FaleConosco` (
  `tipoFaleConosco` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataInclusao` date DEFAULT NULL,
  `dataResposta` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emailDestinatario` varchar(255) DEFAULT NULL,
  `mensagem` varchar(255) DEFAULT NULL,
  `remetente` varchar(255) DEFAULT NULL,
  `assunto_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  `campanha_id` int(11) DEFAULT NULL,
  `pedido_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjicie0ysp4yg66286nushyb7m` (`assunto_id`),
  KEY `FKrly8fkf6ihc0np7arnb1w720s` (`usuarioInsercao_id`),
  KEY `FKic85cb6gnon8adnbditgw8ess` (`campanha_id`),
  KEY `FKmyo4hcgin1bbufgbqqd29s2xb` (`pedido_id`),
  CONSTRAINT `FKic85cb6gnon8adnbditgw8ess` FOREIGN KEY (`campanha_id`) REFERENCES `Campanha` (`id`),
  CONSTRAINT `FKjicie0ysp4yg66286nushyb7m` FOREIGN KEY (`assunto_id`) REFERENCES `AssuntoFaleConosco` (`id`),
  CONSTRAINT `FKmyo4hcgin1bbufgbqqd29s2xb` FOREIGN KEY (`pedido_id`) REFERENCES `Pedido` (`id`),
  CONSTRAINT `FKrly8fkf6ihc0np7arnb1w720s` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FaleConosco`
--

LOCK TABLES `FaleConosco` WRITE;
/*!40000 ALTER TABLE `FaleConosco` DISABLE KEYS */;
/*!40000 ALTER TABLE `FaleConosco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FilialComprador`
--

DROP TABLE IF EXISTS `FilialComprador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FilialComprador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(18) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `filialPrincipal` bit(1) NOT NULL,
  `inscricaoEstadual` varchar(15) DEFAULT NULL,
  `inscricaoMunicipal` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `quantidadePedidosConfirmados` int(11) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `comprovanteDeEndereco_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `statusFilialComprador_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKj91m2waa2nmfsnmb4ppbrxxmb` (`comprador_id`),
  KEY `FKf8tqra2a5bnl20tx7gkl6j33u` (`comprovanteDeEndereco_id`),
  KEY `FKc52xijh8m7coqefeg4t65cksb` (`localizacao_id`),
  KEY `FK5c5edgx8mq36ewfy0824664rh` (`statusFilialComprador_id`),
  KEY `FKowre8v7ccdx8ykndldc06e01p` (`usuarioAlteracao_id`),
  KEY `FKrbwxs5ybntxol8fm4dk3jswan` (`usuarioInsercao_id`),
  CONSTRAINT `FK5c5edgx8mq36ewfy0824664rh` FOREIGN KEY (`statusFilialComprador_id`) REFERENCES `StatusFilialComprador` (`id`),
  CONSTRAINT `FKc52xijh8m7coqefeg4t65cksb` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKf8tqra2a5bnl20tx7gkl6j33u` FOREIGN KEY (`comprovanteDeEndereco_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKj91m2waa2nmfsnmb4ppbrxxmb` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKowre8v7ccdx8ykndldc06e01p` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKrbwxs5ybntxol8fm4dk3jswan` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FilialComprador`
--

LOCK TABLES `FilialComprador` WRITE;
/*!40000 ALTER TABLE `FilialComprador` DISABLE KEYS */;
INSERT INTO `FilialComprador` VALUES (1,NULL,NULL,'2018-05-16','',NULL,NULL,'teste',0,'telefone teste',1,NULL,NULL,1,NULL,NULL);
/*!40000 ALTER TABLE `FilialComprador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FilialFornecedor`
--

DROP TABLE IF EXISTS `FilialFornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FilialFornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(18) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `filialPrincipal` bit(1) NOT NULL,
  `inscricaoEstadual` varchar(15) DEFAULT NULL,
  `inscricaoMunicipal` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `quantidadePedidosConfirmados` int(11) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `bairro_id` int(11) DEFAULT NULL,
  `comprovanteDeEndereco_id` int(11) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `statusFilialFornecedor_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsr01vbl3xcq3ucgve6bnffd6j` (`bairro_id`),
  KEY `FKr0mt2yo99e846vdhp7sbfypk` (`comprovanteDeEndereco_id`),
  KEY `FKl1b5wo11akjcfdicpapancgru` (`fornecedor_id`),
  KEY `FK3mppbw2xi2swdrw4mgh5hy3g4` (`localizacao_id`),
  KEY `FKpuaorjag5tqsv47t42myjbgkw` (`statusFilialFornecedor_id`),
  KEY `FKg1silafjar283gv6c1slwjii` (`usuarioAlteracao_id`),
  KEY `FKtouhel6lekfr6qbv5oapr1g2e` (`usuarioInsercao_id`),
  CONSTRAINT `FK3mppbw2xi2swdrw4mgh5hy3g4` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKg1silafjar283gv6c1slwjii` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKl1b5wo11akjcfdicpapancgru` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKpuaorjag5tqsv47t42myjbgkw` FOREIGN KEY (`statusFilialFornecedor_id`) REFERENCES `StatusFilialFornecedor` (`id`),
  CONSTRAINT `FKr0mt2yo99e846vdhp7sbfypk` FOREIGN KEY (`comprovanteDeEndereco_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKsr01vbl3xcq3ucgve6bnffd6j` FOREIGN KEY (`bairro_id`) REFERENCES `Bairro` (`id`),
  CONSTRAINT `FKtouhel6lekfr6qbv5oapr1g2e` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FilialFornecedor`
--

LOCK TABLES `FilialFornecedor` WRITE;
/*!40000 ALTER TABLE `FilialFornecedor` DISABLE KEYS */;
INSERT INTO `FilialFornecedor` VALUES (1,NULL,NULL,'2018-05-16','fornecedor_1@superkompras.com','',NULL,NULL,'teste',0,'(31)3332-1035',NULL,NULL,1,NULL,1,NULL,NULL);
/*!40000 ALTER TABLE `FilialFornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FormaPagamentoPedidoCampanha`
--

DROP TABLE IF EXISTS `FormaPagamentoPedidoCampanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FormaPagamentoPedidoCampanha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `bandeiraStone` varchar(255) DEFAULT NULL,
  `dataDeAlteracao` date DEFAULT NULL,
  `dataDeCriacao` date DEFAULT NULL,
  `dataDeExpiracao` date DEFAULT NULL,
  `debitoAutomatico` bit(1) DEFAULT NULL,
  `enviarDocumentoCliente` bit(1) DEFAULT NULL,
  `jurosAdministradora` double NOT NULL,
  `logomarca` varchar(255) DEFAULT NULL,
  `mascaraCartao` varchar(255) DEFAULT NULL,
  `mensagem` varchar(255) DEFAULT NULL,
  `naoRepetir` bit(1) DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `parcelas` int(11) NOT NULL,
  `parcelasAdministradora` int(11) NOT NULL,
  `parcelasProprias` int(11) NOT NULL,
  `sigla` varchar(255) DEFAULT NULL,
  `somentePessoaJuridica` bit(1) DEFAULT NULL,
  `valorMinimo` double NOT NULL,
  `tipoPagamento_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5ux0i8k876lf2j3oqe5gvh6c` (`tipoPagamento_id`),
  KEY `FK1wblxlivw9cqxge2rqfng066c` (`usuarioAlteracao_id`),
  KEY `FKdq8fo32gqdopilo32y1educj5` (`usuarioInsercao_id`),
  CONSTRAINT `FK1wblxlivw9cqxge2rqfng066c` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK5ux0i8k876lf2j3oqe5gvh6c` FOREIGN KEY (`tipoPagamento_id`) REFERENCES `TipoPagamento` (`id`),
  CONSTRAINT `FKdq8fo32gqdopilo32y1educj5` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FormaPagamentoPedidoCampanha`
--

LOCK TABLES `FormaPagamentoPedidoCampanha` WRITE;
/*!40000 ALTER TABLE `FormaPagamentoPedidoCampanha` DISABLE KEYS */;
INSERT INTO `FormaPagamentoPedidoCampanha` VALUES (1,'',NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,'Boleto',0,0,0,NULL,NULL,0,NULL,NULL,NULL),(2,'','VISA',NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,'Cartão',0,0,0,NULL,NULL,0,NULL,NULL,NULL);
/*!40000 ALTER TABLE `FormaPagamentoPedidoCampanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FormaPagamentoTaxa`
--

DROP TABLE IF EXISTS `FormaPagamentoTaxa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FormaPagamentoTaxa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativio` bit(1) NOT NULL,
  `descricaoFormaPgto` varchar(255) DEFAULT NULL,
  `bandeira_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo1ytxx27su2ey9p31j21aiiml` (`bandeira_id`),
  CONSTRAINT `FKo1ytxx27su2ey9p31j21aiiml` FOREIGN KEY (`bandeira_id`) REFERENCES `BandeiraCartao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FormaPagamentoTaxa`
--

LOCK TABLES `FormaPagamentoTaxa` WRITE;
/*!40000 ALTER TABLE `FormaPagamentoTaxa` DISABLE KEYS */;
/*!40000 ALTER TABLE `FormaPagamentoTaxa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Fornecedor`
--

DROP TABLE IF EXISTS `Fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Fornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `agencia` varchar(10) DEFAULT NULL,
  `banco` varchar(50) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `conta` varchar(10) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `inscricaoEstadual` varchar(15) DEFAULT NULL,
  `inscricaoMunicipal` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `quantidadeArmazens` int(11) NOT NULL,
  `quantidadeFuncionarios` int(11) NOT NULL,
  `quantidadeVeiculos` int(11) NOT NULL,
  `razaoSocial` varchar(50) DEFAULT NULL,
  `arquivoAnalisedeCredito_id` int(11) DEFAULT NULL,
  `arquivoCNPJ_id` int(11) DEFAULT NULL,
  `arquivoComprovanteDeEndereco_id` int(11) DEFAULT NULL,
  `arquivoContratoSocial_id` int(11) DEFAULT NULL,
  `arquivoDadosBancarios_id` int(11) DEFAULT NULL,
  `arquivoDocSocios_id` int(11) DEFAULT NULL,
  `filialPrincipal_id` int(11) DEFAULT NULL,
  `gerenteComercial_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `responsavelPelaEmpresa_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  `usuarioPrincipal_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKft0nhj80pe1fj0uh5adnmuc97` (`arquivoAnalisedeCredito_id`),
  KEY `FK3qfuiutpqe4v31gtx00id0tvq` (`arquivoCNPJ_id`),
  KEY `FK8m4iqwe3trmq4ivho98g4pait` (`arquivoComprovanteDeEndereco_id`),
  KEY `FKev2dhw3g65or2srj2hu2kt008` (`arquivoContratoSocial_id`),
  KEY `FKbc075d5a09c02fbcktogn3qe5` (`arquivoDadosBancarios_id`),
  KEY `FKo8u9okfl95ofhnp0jr40icqnc` (`arquivoDocSocios_id`),
  KEY `FKfdw01cbfg7r36x4ni5bry0t6p` (`filialPrincipal_id`),
  KEY `FKo9mafr43d9mbqyon6x4qclxhs` (`gerenteComercial_id`),
  KEY `FKi363um6icu4cxhfhjaxbdwvb6` (`localizacao_id`),
  KEY `FKkip8vam4lk5cfj5x38set21mi` (`responsavelPelaEmpresa_id`),
  KEY `FK1f71yb0e4yuxr4n8spi5tpn5x` (`status_id`),
  KEY `FKrdc03ti6npumi58k7uvggcdyq` (`usuarioAlteracao_id`),
  KEY `FKpai0vm0cvx80gbrs7oqirnfwb` (`usuarioInsercao_id`),
  KEY `FK7tablktqc7o086cbhhoywltv8` (`usuarioPrincipal_id`),
  CONSTRAINT `FK1f71yb0e4yuxr4n8spi5tpn5x` FOREIGN KEY (`status_id`) REFERENCES `StatusFornecedor` (`id`),
  CONSTRAINT `FK3qfuiutpqe4v31gtx00id0tvq` FOREIGN KEY (`arquivoCNPJ_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FK7tablktqc7o086cbhhoywltv8` FOREIGN KEY (`usuarioPrincipal_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK8m4iqwe3trmq4ivho98g4pait` FOREIGN KEY (`arquivoComprovanteDeEndereco_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKbc075d5a09c02fbcktogn3qe5` FOREIGN KEY (`arquivoDadosBancarios_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKev2dhw3g65or2srj2hu2kt008` FOREIGN KEY (`arquivoContratoSocial_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKfdw01cbfg7r36x4ni5bry0t6p` FOREIGN KEY (`filialPrincipal_id`) REFERENCES `FilialFornecedor` (`id`),
  CONSTRAINT `FKft0nhj80pe1fj0uh5adnmuc97` FOREIGN KEY (`arquivoAnalisedeCredito_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKi363um6icu4cxhfhjaxbdwvb6` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKkip8vam4lk5cfj5x38set21mi` FOREIGN KEY (`responsavelPelaEmpresa_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKo8u9okfl95ofhnp0jr40icqnc` FOREIGN KEY (`arquivoDocSocios_id`) REFERENCES `Documento` (`id`),
  CONSTRAINT `FKo9mafr43d9mbqyon6x4qclxhs` FOREIGN KEY (`gerenteComercial_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKpai0vm0cvx80gbrs7oqirnfwb` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKrdc03ti6npumi58k7uvggcdyq` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Fornecedor`
--

LOCK TABLES `Fornecedor` WRITE;
/*!40000 ALTER TABLE `Fornecedor` DISABLE KEYS */;
INSERT INTO `Fornecedor` VALUES (1,'898','TestBank','22222222222222',NULL,'5000','2018-05-16','123567','0984311','Fornecedor test 1',5,1000,300,'Simulação LTDA',NULL,NULL,NULL,NULL,NULL,NULL,NULL,4,4,3,1,NULL,NULL,NULL);
/*!40000 ALTER TABLE `Fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FornecedorSolicitante`
--

DROP TABLE IF EXISTS `FornecedorSolicitante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FornecedorSolicitante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataAlteraca` date DEFAULT NULL,
  `dataHoraInsercao` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mensagem` varchar(200) DEFAULT NULL,
  `nomeFantasia` varchar(100) DEFAULT NULL,
  `qtdArmazem` int(11) NOT NULL,
  `qtdFuncionarios` int(11) NOT NULL,
  `qtdVeiculos` int(11) NOT NULL,
  `razaoSocial` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `contatoResponsavel_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_pouq9tc4yb1iidfrcnwl2hbrg` (`cnpj`),
  KEY `FKgo459vmn4snd98q6v8jxmd64l` (`contatoResponsavel_id`),
  KEY `FKic09jbmunhfk5iurhfyocylpl` (`localizacao_id`),
  KEY `FKbfneisfkycqfd9lh9w92cdsiq` (`usuarioAlteracao_id`),
  KEY `FKmq8atyx0vu3tk58eoyuguxwab` (`usuarioInsercao_id`),
  CONSTRAINT `FKbfneisfkycqfd9lh9w92cdsiq` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKgo459vmn4snd98q6v8jxmd64l` FOREIGN KEY (`contatoResponsavel_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKic09jbmunhfk5iurhfyocylpl` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKmq8atyx0vu3tk58eoyuguxwab` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FornecedorSolicitante`
--

LOCK TABLES `FornecedorSolicitante` WRITE;
/*!40000 ALTER TABLE `FornecedorSolicitante` DISABLE KEYS */;
/*!40000 ALTER TABLE `FornecedorSolicitante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GrupoUsuarioSB`
--

DROP TABLE IF EXISTS `GrupoUsuarioSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GrupoUsuarioSB` (
  `tipoGrupoUsuario` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `XhtmlPaginaInicial` varchar(255) DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `dataHoraAlteracao` datetime(6) DEFAULT NULL,
  `dataHoraInsersao` datetime(6) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipoGrupoNativo` bit(1) NOT NULL,
  `moduloPrincipal_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3wv40cn2xjarnckhmw50xibgh` (`nome`),
  KEY `FKrcx4qo1ruqe8koyfg2vb238jg` (`moduloPrincipal_id`),
  KEY `FKn20xy684qdisrx1r0wyeffosn` (`usuarioAlteracao_id`),
  KEY `FK7s5bl86yjv1r1rfn9i964cq7g` (`usuarioInsercao_id`),
  CONSTRAINT `FK7s5bl86yjv1r1rfn9i964cq7g` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKn20xy684qdisrx1r0wyeffosn` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKrcx4qo1ruqe8koyfg2vb238jg` FOREIGN KEY (`moduloPrincipal_id`) REFERENCES `ModuloAcaoSistema` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GrupoUsuarioSB`
--

LOCK TABLES `GrupoUsuarioSB` WRITE;
/*!40000 ALTER TABLE `GrupoUsuarioSB` DISABLE KEYS */;
INSERT INTO `GrupoUsuarioSB` VALUES ('GrupoUsuarioSB',1,'/site/administrador/administrador/administrador_inicial.xhtml','',NULL,NULL,'Usuários da central, super Compras','Administrador','',-925014728,NULL,NULL),('GrupoUsuarioSB',2,'/site/fornecedor/fornecedor/fornecedor_inicial.xhtml','',NULL,NULL,'Usuários de Fornecedores','Fornecedor','',1795722597,NULL,NULL),('GrupoUsuarioSB',3,'/site/comprador/campanha/campanha_gerenciar.xhtml','',NULL,NULL,'Usuários de compras','Comprador','',1389070057,NULL,NULL);
/*!40000 ALTER TABLE `GrupoUsuarioSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ips`
--

DROP TABLE IF EXISTS `Ips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ips` (
  `id` int(11) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dns` varchar(255) DEFAULT NULL,
  `finalFaixa` varchar(15) NOT NULL,
  `inicialFaixa` varchar(15) NOT NULL,
  `tipo_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg91qw90kdtcwkq94o48c8sfah` (`tipo_id`),
  KEY `FK332ut8y08mn06rtgbpyqei73p` (`usuarioAlteracao_id`),
  KEY `FK92k8tn1tlblje3ees74kebihi` (`usuarioInsercao_id`),
  CONSTRAINT `FK332ut8y08mn06rtgbpyqei73p` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK92k8tn1tlblje3ees74kebihi` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKg91qw90kdtcwkq94o48c8sfah` FOREIGN KEY (`tipo_id`) REFERENCES `TipoIp` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ips`
--

LOCK TABLES `Ips` WRITE;
/*!40000 ALTER TABLE `Ips` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Localidade`
--

DROP TABLE IF EXISTS `Localidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localidade`
--

LOCK TABLES `Localidade` WRITE;
/*!40000 ALTER TABLE `Localidade` DISABLE KEYS */;
INSERT INTO `Localidade` VALUES (1,'','2018-05-16','localidade para testes','local de testes');
/*!40000 ALTER TABLE `Localidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Localizacao`
--

DROP TABLE IF EXISTS `Localizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localizacao` (
  `tipoLocalizacao` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `complemento` varchar(255) DEFAULT NULL,
  `latitude` bigint(20) NOT NULL,
  `longitude` bigint(20) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `bairro_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1x27cqle98ktlx448eo2lticm` (`bairro_id`),
  CONSTRAINT `FK1x27cqle98ktlx448eo2lticm` FOREIGN KEY (`bairro_id`) REFERENCES `Bairro` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localizacao`
--

LOCK TABLES `Localizacao` WRITE;
/*!40000 ALTER TABLE `Localizacao` DISABLE KEYS */;
INSERT INTO `Localizacao` VALUES ('LocalizacaoPostavel',1,'100',0,0,'localizacao simulacao',NULL,NULL,1108321817),('LocalizacaoPostavel',2,NULL,0,0,NULL,NULL,NULL,1108321817),('LocalizacaoPostavel',3,'100',0,0,'localizacao simulacao',NULL,NULL,1108321817),('LocalizacaoPostavel',4,'100',0,0,'localizacao simulacao',NULL,NULL,1108321817);
/*!40000 ALTER TABLE `Localizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LogAcesso`
--

DROP TABLE IF EXISTS `LogAcesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LogAcesso` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dataHora` datetime(6) DEFAULT NULL,
  `descricaoAcesso` varchar(255) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaokbs0kxa5b2641xsu7e68vrh` (`usuario_id`),
  CONSTRAINT `FKaokbs0kxa5b2641xsu7e68vrh` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LogAcesso`
--

LOCK TABLES `LogAcesso` WRITE;
/*!40000 ALTER TABLE `LogAcesso` DISABLE KEYS */;
/*!40000 ALTER TABLE `LogAcesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ModeloContrato`
--

DROP TABLE IF EXISTS `ModeloContrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ModeloContrato` (
  `tipoModelo` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alteradoEm` date DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `criadoEm` date DEFAULT NULL,
  `descricao` varchar(20) NOT NULL,
  `modeloComprador` varchar(9999) DEFAULT NULL,
  `modeloFornecedor` varchar(9999) DEFAULT NULL,
  `tipoParceiro_id` int(11) NOT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKr3yjkmfqu1kmy3gbcbxjljlj4` (`tipoParceiro_id`),
  KEY `FK5kl47co1jdxyd14j6iqpwyyik` (`usuarioAlteracao_id`),
  KEY `FKj94am636jeq82uy1t2vd4mwdj` (`usuarioInsercao_id`),
  CONSTRAINT `FK5kl47co1jdxyd14j6iqpwyyik` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKj94am636jeq82uy1t2vd4mwdj` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKr3yjkmfqu1kmy3gbcbxjljlj4` FOREIGN KEY (`tipoParceiro_id`) REFERENCES `TipoParceiro` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ModeloContrato`
--

LOCK TABLES `ModeloContrato` WRITE;
/*!40000 ALTER TABLE `ModeloContrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `ModeloContrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ModuloAcaoSistema`
--

DROP TABLE IF EXISTS `ModuloAcaoSistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ModuloAcaoSistema` (
  `tipoModulo` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `dataHoraCriacao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `iconeDaClasse` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `umModuloNativo` bit(1) NOT NULL,
  `enumVinculado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ModuloAcaoSistema`
--

LOCK TABLES `ModuloAcaoSistema` WRITE;
/*!40000 ALTER TABLE `ModuloAcaoSistema` DISABLE KEYS */;
INSERT INTO `ModuloAcaoSistema` VALUES ('ModuloSuperKompras',-925014728,'2018-05-16',NULL,'fa fa-puzzle-piece','Administrador','\0',0),('ModuloSuperKompras',-530550724,'2018-05-16',NULL,'fa fa-puzzle-piece','Super Kompras','\0',3),('ModuloSuperKompras',258245668,'2018-05-16',NULL,'fa fa-puzzle-piece','Comunicação','\0',4),('ModuloSuperKompras',1389070057,'2018-05-16',NULL,'fa fa-puzzle-piece','Comprador','\0',2),('ModuloSuperKompras',1795722597,'2018-05-16',NULL,'fa fa-puzzle-piece','Fornecedor','\0',1);
/*!40000 ALTER TABLE `ModuloAcaoSistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Negado_Grupos`
--

DROP TABLE IF EXISTS `Negado_Grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Negado_Grupos` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhd45weeoe1avo5qunwppgnfhm` (`acesso_id`),
  KEY `FK7m9qmg1btyx5cwglbveiugmbm` (`grupo_id`),
  CONSTRAINT `FK7m9qmg1btyx5cwglbveiugmbm` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`),
  CONSTRAINT `FKhd45weeoe1avo5qunwppgnfhm` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Negado_Grupos`
--

LOCK TABLES `Negado_Grupos` WRITE;
/*!40000 ALTER TABLE `Negado_Grupos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Negado_Grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Negado_Usuarios`
--

DROP TABLE IF EXISTS `Negado_Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Negado_Usuarios` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK39gufe3ixex80jpg9lshm4y1v` (`usuario_id`,`acesso_id`),
  KEY `FKgm8m18ifbnjd04dyl9drki4va` (`acesso_id`),
  CONSTRAINT `FK8wgk7y8p69ttbgf7if2k5n1pt` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKgm8m18ifbnjd04dyl9drki4va` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Negado_Usuarios`
--

LOCK TABLES `Negado_Usuarios` WRITE;
/*!40000 ALTER TABLE `Negado_Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Negado_Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Newsletter`
--

DROP TABLE IF EXISTS `Newsletter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Newsletter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `assunto` varchar(100) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataCriacao` date DEFAULT NULL,
  `dataEnvio` date DEFAULT NULL,
  `descricao` varchar(50) NOT NULL,
  `destinatario` varchar(255) DEFAULT NULL,
  `emailDestinatario` varchar(30) NOT NULL,
  `emailRemetente` varchar(30) NOT NULL,
  `nomeRemetente` varchar(50) NOT NULL,
  `arquivoNewsletter_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs1mmuhscxdgiigqbdfgai6al6` (`arquivoNewsletter_id`),
  KEY `FK8y3sgy54x6gjw7bsncbycdl0r` (`usuarioAlteracao_id`),
  KEY `FKnpwmcbuqd9ykx57eucg9j2gtr` (`usuarioInsercao_id`),
  CONSTRAINT `FK8y3sgy54x6gjw7bsncbycdl0r` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKnpwmcbuqd9ykx57eucg9j2gtr` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKs1mmuhscxdgiigqbdfgai6al6` FOREIGN KEY (`arquivoNewsletter_id`) REFERENCES `Documento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Newsletter`
--

LOCK TABLES `Newsletter` WRITE;
/*!40000 ALTER TABLE `Newsletter` DISABLE KEYS */;
/*!40000 ALTER TABLE `Newsletter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PagamentoTaxa`
--

DROP TABLE IF EXISTS `PagamentoTaxa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PagamentoTaxa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dataHoraAutorizacao` datetime(6) DEFAULT NULL,
  `datahoraTentativaAutorizacao` datetime(6) DEFAULT NULL,
  `descricaoTransacao` varchar(255) DEFAULT NULL,
  `respostaCielo` text,
  `tokenAutorizacao` varchar(255) DEFAULT NULL,
  `cartao_id` int(11) DEFAULT NULL,
  `pedido_id` int(11) DEFAULT NULL,
  `statusTransacao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKje9omf90m4akqr45v1pl16rot` (`cartao_id`),
  KEY `FK1pqdrk05vjqxs9mmfd4oe4p09` (`pedido_id`),
  KEY `FK8nwo84l3d3ilgk1ykow45c738` (`statusTransacao_id`),
  CONSTRAINT `FK1pqdrk05vjqxs9mmfd4oe4p09` FOREIGN KEY (`pedido_id`) REFERENCES `Pedido` (`id`),
  CONSTRAINT `FK8nwo84l3d3ilgk1ykow45c738` FOREIGN KEY (`statusTransacao_id`) REFERENCES `StatusTransacaoCartao` (`id`),
  CONSTRAINT `FKje9omf90m4akqr45v1pl16rot` FOREIGN KEY (`cartao_id`) REFERENCES `CartaoTokenCielo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PagamentoTaxa`
--

LOCK TABLES `PagamentoTaxa` WRITE;
/*!40000 ALTER TABLE `PagamentoTaxa` DISABLE KEYS */;
/*!40000 ALTER TABLE `PagamentoTaxa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pedido`
--

DROP TABLE IF EXISTS `Pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Pedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chaveNotaFiscal` varchar(255) DEFAULT NULL,
  `dataAlteracao` datetime(6) DEFAULT NULL,
  `dataDeEncerramentoDaCampanhaDoPedido` date DEFAULT NULL,
  `dataFinal` date DEFAULT NULL,
  `dataInsercao` datetime(6) DEFAULT NULL,
  `fornecedorDaCampanhaDoPedido` varchar(255) DEFAULT NULL,
  `multiploDeEmbarqueSolicitado` int(11) NOT NULL,
  `nomeDoCliente` varchar(255) DEFAULT NULL,
  `numeroDaCampanhaDoPedido` int(11) NOT NULL,
  `numeroNotaFiscal` varchar(255) DEFAULT NULL,
  `pedidoValorTotal` double NOT NULL,
  `quantidadeCaixas` int(11) NOT NULL,
  `quantidadeDiponivelPedidoFilial` int(11) NOT NULL,
  `quantidadeUnidades` int(11) NOT NULL,
  `quantidadeUnidadesECaixasUnificado` varchar(255) DEFAULT NULL,
  `razaoSocialDoComprador` varchar(255) DEFAULT NULL,
  `taxaServico` double NOT NULL,
  `tituloCampanha` varchar(255) DEFAULT NULL,
  `valorTxServico` double NOT NULL,
  `campanha_id` int(11) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `filialComprador_id` int(11) DEFAULT NULL,
  `formaPagamento_id` int(11) DEFAULT NULL,
  `produtoCampanhaPedidoPrincipal_id` int(11) DEFAULT NULL,
  `statusPedido_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtnycdxwx9r6wkbfsbi20m3n17` (`campanha_id`),
  KEY `FKsix1fcl15298xjb43yh3da7kp` (`comprador_id`),
  KEY `FKcm7kqx9eh5reh4c2p0ixda719` (`filialComprador_id`),
  KEY `FKm3pu7547s8rxibqmoolwm6cd9` (`formaPagamento_id`),
  KEY `FKsr8nfw6m5fqaj1cw6ha4flhrc` (`produtoCampanhaPedidoPrincipal_id`),
  KEY `FK8nk07qh9bg2kqb9mlykbuvlm4` (`statusPedido_id`),
  KEY `FK5dqh58cx141bu08sqbkxn5k7j` (`usuarioAlteracao_id`),
  KEY `FKiiv913wxmjlf4atagu85riv3a` (`usuarioInsercao_id`),
  CONSTRAINT `FK5dqh58cx141bu08sqbkxn5k7j` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK8nk07qh9bg2kqb9mlykbuvlm4` FOREIGN KEY (`statusPedido_id`) REFERENCES `StatusPedido` (`id`),
  CONSTRAINT `FKcm7kqx9eh5reh4c2p0ixda719` FOREIGN KEY (`filialComprador_id`) REFERENCES `FilialComprador` (`id`),
  CONSTRAINT `FKiiv913wxmjlf4atagu85riv3a` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKm3pu7547s8rxibqmoolwm6cd9` FOREIGN KEY (`formaPagamento_id`) REFERENCES `FormaPagamentoPedidoCampanha` (`id`),
  CONSTRAINT `FKsix1fcl15298xjb43yh3da7kp` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKsr8nfw6m5fqaj1cw6ha4flhrc` FOREIGN KEY (`produtoCampanhaPedidoPrincipal_id`) REFERENCES `Produto_Campanha_Pedido` (`id`),
  CONSTRAINT `FKtnycdxwx9r6wkbfsbi20m3n17` FOREIGN KEY (`campanha_id`) REFERENCES `Campanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pedido`
--

LOCK TABLES `Pedido` WRITE;
/*!40000 ALTER TABLE `Pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `Pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PermissaoSB`
--

DROP TABLE IF EXISTS `PermissaoSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PermissaoSB` (
  `id` int(11) NOT NULL,
  `idAcaoGestao` int(11) NOT NULL,
  `idacaoDoSistema` int(11) NOT NULL,
  `nomeAcesso` varchar(255) DEFAULT NULL,
  `tipoAutenticacao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PermissaoSB`
--

LOCK TABLES `PermissaoSB` WRITE;
/*!40000 ALTER TABLE `PermissaoSB` DISABLE KEYS */;
INSERT INTO `PermissaoSB` VALUES (-2105322184,-2105322184,-2105322184,'FabAcaoAdministrador.PRODUTO_MB_GERENCIAR',NULL),(-2045662374,-2045662374,-2045662374,'FabAcaoAdministrador.CAMPANHA_MB_GERENCIAR',NULL),(-2010723771,-2010723771,-2010723771,'FabAcaoAdministrador.CONTRATO_MB_GERENCIAR',NULL),(-1874789968,-1874789968,-1874789968,'FabAcaoAdministrador.TEXTOS_MB_GERENCIAR',NULL),(-1407066025,-1407066025,-1407066025,'FabAcaoAdministrador.FORMA_DE_PAGAMENTO_MB_GERENCIAR',NULL),(-1406939282,-1406939282,-1406939282,'FabAcaoComprador.SUGESTAO_CAMPANHA_MB_GERENCIAR',NULL),(-1253617710,-1253617710,-1253617710,'FabAcaoAdministrador.SOLICITACAO_ENTRADA_FORNECEDOR_MB_GERENCIAR_ENTRADA',NULL),(-1198482115,-1198482115,-1198482115,'FabAcaoAdministrador.CIDADE_MB_GERENCIAR',NULL),(-1155393754,-1155393754,-1155393754,'FabAcaoComprador.CAMPANHA_MB_GERENCIAR',NULL),(-853488811,-853488811,-853488811,'FabAcaoAdministrador.ADMINISTRADOR_MB_INICIAL',NULL),(-765086278,-765086278,-765086278,'FabAcaoAdministrador.SUGESTAO_CAMPANHA_MB_GERENCIAR',NULL),(-699761716,-699761716,-699761716,'FabAcaoAdministrador.FORNECEDOR_FILIAL_MB_GERENCIAR',NULL),(-575666320,-575666320,-575666320,'FabAcaoAdministrador.PRE_NEGOCIACAO_MB_GERENCIAR',NULL),(-148317508,-148317508,-148317508,'FabAcaoAdministrador.PEDIDO_MB_GERENCIAR',NULL),(-23616265,-23616265,-23616265,'FabAcaoAdministrador.REGRAS_SUSPENSAO_MB_GERENCIAR',NULL),(-22974685,-22974685,-22974685,'FabAcaoAdministrador.USUARIO_MB_GERENCIAR',NULL),(-11260200,-11260200,-11260200,'FabAcaoAdministrador.SMS_MB_GERENCIAR',NULL),(9557072,9557072,9557072,'FabAcaoAdministrador.ASSUNTO_FALE_CONOSCO_MB_GERENCIAR',NULL),(217289421,217289421,217289421,'FabAcaoAdministrador.REGRAS_INATIVACAO_MB_GERENCIAR',NULL),(241086620,241086620,241086620,'FabAcaoAdministrador.FORNECEDOR_MB_GERENCIAR',NULL),(433677760,433677760,433677760,'FabAcaoAdministrador.COMPRADOR_FILIAL_MB_GERENCIAR',NULL),(499134325,499134325,499134325,'FabAcaoAdministrador.EMAIL_MB_GERENCIAR',NULL),(679269602,679269602,679269602,'FabAcaoComprador.FILIAL_MB_GERENCIAR',NULL),(864076341,864076341,864076341,'FabAcaoAdministrador.BANNER_MB_GERENCIAR',NULL),(958853429,958853429,958853429,'FabAcaoAdministrador.ALTERAR_CONFIGURACAO_GATEWAY_MB_GERENCIAR',NULL),(1115723404,1115723404,1115723404,'FabAcaoFornecedor.FILIAL_MB_GERENCIAR',NULL),(1184127186,-22974685,1184127186,'FabAcaoAdministrador.USUARIO_FRM_EDITAR',NULL),(1225984425,1225984425,1225984425,'FabAcaoAdministrador.REGIOES_MB_GERENCIAR',NULL),(1287244168,1287244168,1287244168,'FabAcaoComprador.PEDIDO_MB_GERENCIAR',NULL),(1483528380,1483528380,1483528380,'FabAcaoAdministrador.MODELO_CONTRATO_MB_GERENCIAR',NULL),(1516544858,1516544858,1516544858,'FabAcaoAdministrador.FALE_CONOSCO_MB_GERENCIAR',NULL),(1527083024,1527083024,1527083024,'FabAcaoAdministrador.TAXA_CANCELAMENTO_PEDIDO_MB_GERENCIAR',NULL),(1532141602,1532141602,1532141602,'FabAcaoAdministrador.SOLICITACAO_ENTRADA_COMPRADOR_MB_GERENCIAR_ENTRADA',NULL),(1543103996,1543103996,1543103996,'FabAcaoAdministrador.REGRAS_CONVERSAO_CAMPANHA_MB_GERENCIAR',NULL),(1562662344,1562662344,1562662344,'FabAcaoAdministrador.NEWSLETTER_MB_GERENCIAR',NULL),(1664882256,1664882256,1664882256,'FabAcaoFornecedor.CAMPANHA_MB_GERENCIAR',NULL),(1696480174,1696480174,1696480174,'FabAcaoAdministrador.TAXA_CANCELAMENTO_CAMPANHA_MB_GERENCIAR',NULL),(1723697970,1723697970,1723697970,'FabAcaoFornecedor.PEDIDO_MB_GERENCIAR',NULL),(1761307196,1761307196,1761307196,'FabAcaoComprador.PRE_NEGOCIACAO_MB_GERENCIAR',NULL),(1927303464,1927303464,1927303464,'FabAcaoAdministrador.COMPRADOR_MB_GERENCIAR',NULL),(1976869712,1976869712,1976869712,'FabAcaoFornecedor.FALE_CONOSCO_MB_GERENCIAR',NULL),(1988249894,1988249894,1988249894,'FabAcaoComprador.FALE_CONOSCO_MB_GERENCIAR',NULL);
/*!40000 ALTER TABLE `PermissaoSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Permitido_Grupos`
--

DROP TABLE IF EXISTS `Permitido_Grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Permitido_Grupos` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKonpllqmu9mxhrobrxvvdvqgw3` (`acesso_id`),
  KEY `FKqy7db3uujsot9o8hi9tr16ifw` (`grupo_id`),
  CONSTRAINT `FKonpllqmu9mxhrobrxvvdvqgw3` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`),
  CONSTRAINT `FKqy7db3uujsot9o8hi9tr16ifw` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permitido_Grupos`
--

LOCK TABLES `Permitido_Grupos` WRITE;
/*!40000 ALTER TABLE `Permitido_Grupos` DISABLE KEYS */;
INSERT INTO `Permitido_Grupos` VALUES (-2105322183,-2105322184,1),(-2045662373,-2045662374,1),(-2010723770,-2010723771,1),(-1874789967,-1874789968,1),(-1407066024,-1407066025,1),(-1406939279,-1406939282,3),(-1253617709,-1253617710,1),(-1198482114,-1198482115,1),(-1155393751,-1155393754,3),(-853488810,-853488811,1),(-765086277,-765086278,1),(-699761715,-699761716,1),(-575666319,-575666320,1),(-148317507,-148317508,1),(-11260199,-11260200,1),(9557073,9557072,1),(241086621,241086620,1),(433677761,433677760,1),(499134326,499134325,1),(679269605,679269602,3),(864076342,864076341,1),(958853430,958853429,1),(1115723406,1115723404,2),(1225984426,1225984425,1),(1287244171,1287244168,3),(1483528381,1483528380,1),(1516544859,1516544858,1),(1527083025,1527083024,1),(1532141603,1532141602,1),(1543103997,1543103996,1),(1562662345,1562662344,1),(1664882258,1664882256,2),(1696480175,1696480174,1),(1723697972,1723697970,2),(1761307199,1761307196,3),(1927303465,1927303464,1),(1976869714,1976869712,2),(1988249897,1988249894,3);
/*!40000 ALTER TABLE `Permitido_Grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Permitido_Usuarios`
--

DROP TABLE IF EXISTS `Permitido_Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Permitido_Usuarios` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK9j92iu9201tx0dm010v5fq4wo` (`usuario_id`,`acesso_id`),
  KEY `FKeb1qf23eyq6brt5o1sbbka3oq` (`acesso_id`),
  CONSTRAINT `FKeb1qf23eyq6brt5o1sbbka3oq` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`),
  CONSTRAINT `FKkk1bvscvwf4sxlf15t8pk4e10` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permitido_Usuarios`
--

LOCK TABLES `Permitido_Usuarios` WRITE;
/*!40000 ALTER TABLE `Permitido_Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Permitido_Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Prenegociacao`
--

DROP TABLE IF EXISTS `Prenegociacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Prenegociacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alteradoEm` date DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `codigoDeBarras` varchar(255) DEFAULT NULL,
  `criadaEm` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nomeDoContato` varchar(255) DEFAULT NULL,
  `quantidadedisponivel` int(11) NOT NULL,
  `telefone` int(11) NOT NULL,
  `valorUnitario` double NOT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `compradorNegociante_id` int(11) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `produto_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpf4hxqyjuif7snhlp70yeoent` (`comprador_id`),
  KEY `FKq0o1otx0d2cienls9hduqdhak` (`compradorNegociante_id`),
  KEY `FKik1rntiv0pxtt0pfkymksma80` (`fornecedor_id`),
  KEY `FKj5dnkfafyg2ordkh54ss2xxbu` (`produto_id`),
  CONSTRAINT `FKik1rntiv0pxtt0pfkymksma80` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKj5dnkfafyg2ordkh54ss2xxbu` FOREIGN KEY (`produto_id`) REFERENCES `Produto` (`id`),
  CONSTRAINT `FKpf4hxqyjuif7snhlp70yeoent` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKq0o1otx0d2cienls9hduqdhak` FOREIGN KEY (`compradorNegociante_id`) REFERENCES `Comprador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Prenegociacao`
--

LOCK TABLES `Prenegociacao` WRITE;
/*!40000 ALTER TABLE `Prenegociacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Prenegociacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Produto`
--

DROP TABLE IF EXISTS `Produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `codigoDeBarras` varchar(13) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `nome` varchar(150) DEFAULT NULL,
  `categoria_id` int(11) DEFAULT NULL,
  `tipo_id` int(11) DEFAULT NULL,
  `unidade_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4a6iyamw1f1xx19g82vo6lbg9` (`categoria_id`),
  KEY `FKovccyl565ijgmpjohy01ucsoh` (`tipo_id`),
  KEY `FKi0beguu6hh4ub2uo9uh2kocna` (`unidade_id`),
  KEY `FK54sl0i9w2qm9jmgnnky07erai` (`usuarioAlteracao_id`),
  KEY `FKfqb6pfj8lxunnghipgdemmx17` (`usuarioInsercao_id`),
  CONSTRAINT `FK4a6iyamw1f1xx19g82vo6lbg9` FOREIGN KEY (`categoria_id`) REFERENCES `CategoriadoProduto` (`id`),
  CONSTRAINT `FK54sl0i9w2qm9jmgnnky07erai` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKfqb6pfj8lxunnghipgdemmx17` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKi0beguu6hh4ub2uo9uh2kocna` FOREIGN KEY (`unidade_id`) REFERENCES `Unidade` (`id`),
  CONSTRAINT `FKovccyl565ijgmpjohy01ucsoh` FOREIGN KEY (`tipo_id`) REFERENCES `TipoProduto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Produto`
--

LOCK TABLES `Produto` WRITE;
/*!40000 ALTER TABLE `Produto` DISABLE KEYS */;
INSERT INTO `Produto` VALUES (1,'','0001',NULL,'NESCAU',3,1,2,NULL,NULL),(2,'','0002',NULL,'LEITE_MOCA_',8,1,2,NULL,NULL),(3,'','0003',NULL,'MANTEIGA',8,2,2,NULL,NULL);
/*!40000 ALTER TABLE `Produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ProdutoCampanha`
--

DROP TABLE IF EXISTS `ProdutoCampanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ProdutoCampanha` (
  `tipoProduto` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(255) DEFAULT NULL,
  `produtoPrincipal` bit(1) NOT NULL,
  `qtdPedidaEmUnidades` int(11) NOT NULL,
  `quantidadeDisponivelEmUnidades` int(11) NOT NULL,
  `quantidadeDisponivelEmVolume` int(11) NOT NULL,
  `quantidadeMaximaPorFilialEmUnidades` int(11) NOT NULL,
  `quantidadeMaximaPorFilialEmVolume` int(11) NOT NULL,
  `quantidadeMinimaPorFilialEmUnidades` int(11) NOT NULL,
  `quantidadeMinimaPorFilialEmVolume` int(11) NOT NULL,
  `quantidadePorVolume` int(11) NOT NULL,
  `validade` date DEFAULT NULL,
  `valorDoVolume` double NOT NULL,
  `valorUnitarioProduto` double NOT NULL,
  `campanhaDoProduto_id` int(11) DEFAULT NULL,
  `produto_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsggyvlpq8iltsfa3e1hntcnwb` (`campanhaDoProduto_id`),
  KEY `FK9miuuudugloevjj6vsan1dywb` (`produto_id`),
  CONSTRAINT `FK9miuuudugloevjj6vsan1dywb` FOREIGN KEY (`produto_id`) REFERENCES `Produto` (`id`),
  CONSTRAINT `FKsggyvlpq8iltsfa3e1hntcnwb` FOREIGN KEY (`campanhaDoProduto_id`) REFERENCES `Campanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProdutoCampanha`
--

LOCK TABLES `ProdutoCampanha` WRITE;
/*!40000 ALTER TABLE `ProdutoCampanha` DISABLE KEYS */;
/*!40000 ALTER TABLE `ProdutoCampanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ProdutoCampanhaSugerido`
--

DROP TABLE IF EXISTS `ProdutoCampanhaSugerido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ProdutoCampanhaSugerido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigoDeBarrasSugerido` varchar(255) DEFAULT NULL,
  `descricaoProdutoSugerida` varchar(255) DEFAULT NULL,
  `descritivo` varchar(255) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `valorUnitario` double NOT NULL,
  `produtoVinculado_id` int(11) DEFAULT NULL,
  `sugestao_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4guyqbdsdybpfsd6bmr6jpesy` (`produtoVinculado_id`),
  KEY `FK532nhqk73cej2g078shwqs55i` (`sugestao_id`),
  CONSTRAINT `FK4guyqbdsdybpfsd6bmr6jpesy` FOREIGN KEY (`produtoVinculado_id`) REFERENCES `Produto` (`id`),
  CONSTRAINT `FK532nhqk73cej2g078shwqs55i` FOREIGN KEY (`sugestao_id`) REFERENCES `SugestaoDeCampanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProdutoCampanhaSugerido`
--

LOCK TABLES `ProdutoCampanhaSugerido` WRITE;
/*!40000 ALTER TABLE `ProdutoCampanhaSugerido` DISABLE KEYS */;
/*!40000 ALTER TABLE `ProdutoCampanhaSugerido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Produto_Campanha_Pedido`
--

DROP TABLE IF EXISTS `Produto_Campanha_Pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Produto_Campanha_Pedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `quantidadePedidaEmUnidades` int(11) NOT NULL,
  `quantidadePedidaEmVolumes` int(11) NOT NULL,
  `subTotal` double NOT NULL,
  `pedido_id` int(11) DEFAULT NULL,
  `produtoCampanha_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5p4o81g9urhcwgwjkkpkm22pj` (`pedido_id`),
  KEY `FKf8ikwdhjibpbx7mewufr0k56h` (`produtoCampanha_id`),
  CONSTRAINT `FK5p4o81g9urhcwgwjkkpkm22pj` FOREIGN KEY (`pedido_id`) REFERENCES `Pedido` (`id`),
  CONSTRAINT `FKf8ikwdhjibpbx7mewufr0k56h` FOREIGN KEY (`produtoCampanha_id`) REFERENCES `ProdutoCampanha` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Produto_Campanha_Pedido`
--

LOCK TABLES `Produto_Campanha_Pedido` WRITE;
/*!40000 ALTER TABLE `Produto_Campanha_Pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `Produto_Campanha_Pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Regiao`
--

DROP TABLE IF EXISTS `Regiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Regiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alteradoEm` date DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `criadoEm` date DEFAULT NULL,
  `nomeRegiao` varchar(255) DEFAULT NULL,
  `quantidadeCidades` int(11) NOT NULL,
  `sigla` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Regiao`
--

LOCK TABLES `Regiao` WRITE;
/*!40000 ALTER TABLE `Regiao` DISABLE KEYS */;
INSERT INTO `Regiao` VALUES (1,NULL,'',NULL,'Regiao Simulação',0,NULL);
/*!40000 ALTER TABLE `Regiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Regiao_Bairro`
--

DROP TABLE IF EXISTS `Regiao_Bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Regiao_Bairro` (
  `Regiao_id` int(11) NOT NULL,
  `bairros_id` int(11) NOT NULL,
  KEY `FKew8f3d6bl78s7v7htp3thaj1d` (`bairros_id`),
  KEY `FKewbhodadapv1i3pyarhm5vpsa` (`Regiao_id`),
  CONSTRAINT `FKew8f3d6bl78s7v7htp3thaj1d` FOREIGN KEY (`bairros_id`) REFERENCES `Bairro` (`id`),
  CONSTRAINT `FKewbhodadapv1i3pyarhm5vpsa` FOREIGN KEY (`Regiao_id`) REFERENCES `Regiao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Regiao_Bairro`
--

LOCK TABLES `Regiao_Bairro` WRITE;
/*!40000 ALTER TABLE `Regiao_Bairro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Regiao_Bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RegrasSK`
--

DROP TABLE IF EXISTS `RegrasSK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RegrasSK` (
  `id` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `vaor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RegrasSK`
--

LOCK TABLES `RegrasSK` WRITE;
/*!40000 ALTER TABLE `RegrasSK` DISABLE KEYS */;
/*!40000 ALTER TABLE `RegrasSK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sms`
--

DROP TABLE IF EXISTS `Sms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataCriacao` date DEFAULT NULL,
  `dataParaEnvio` date DEFAULT NULL,
  `descricao` varchar(300) NOT NULL,
  `grupo` varchar(255) DEFAULT NULL,
  `mensagem` varchar(300) NOT NULL,
  `responsavel_id` int(11) DEFAULT NULL,
  `tipoMensagem_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmg5jdqihwbovs4i4rmnpq6yhw` (`responsavel_id`),
  KEY `FKodbkdh7hvntprm4dgaudjx63n` (`tipoMensagem_id`),
  KEY `FKlgb0o4o8x58cjkyk3tiwlyq7h` (`usuarioAlteracao_id`),
  KEY `FK10v1ls5qyddh953xr3lh0ijeg` (`usuarioInsercao_id`),
  CONSTRAINT `FK10v1ls5qyddh953xr3lh0ijeg` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKlgb0o4o8x58cjkyk3tiwlyq7h` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKmg5jdqihwbovs4i4rmnpq6yhw` FOREIGN KEY (`responsavel_id`) REFERENCES `ContatoSuperCompras` (`id`),
  CONSTRAINT `FKodbkdh7hvntprm4dgaudjx63n` FOREIGN KEY (`tipoMensagem_id`) REFERENCES `TipoMensagemSK` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sms`
--

LOCK TABLES `Sms` WRITE;
/*!40000 ALTER TABLE `Sms` DISABLE KEYS */;
INSERT INTO `Sms` VALUES (1,'\0',NULL,NULL,NULL,NULL,'Seja Bem vindo',NULL,'Prezado Parceiro, Seja bem vindo ao SuperKompras segue seus dados [UsuarioSB.email] e [UsuarioSB.senha]',NULL,5,NULL,NULL),(2,'\0',NULL,NULL,NULL,NULL,'Alteração de dados',NULL,'Alteração de dados cadastrais na data [Comprador.dataAlteracao] às 00:00',NULL,1,NULL,NULL),(3,'\0',NULL,NULL,NULL,NULL,'Alteração de dados',NULL,'Alteração de dados cadastrais na data [Fornecedor.dataAlteracao] às 00:00',NULL,2,NULL,NULL),(4,'\0',NULL,NULL,NULL,NULL,'Pedido Aguardando Término da Campanha',NULL,'Prezado Parceiro, o pagamento da taxa do seu pedido [Pedido.id], foi aprovado e está aguardando o término da campanha [Pedido.campanha.titulo]',NULL,4,NULL,NULL),(5,'\0',NULL,NULL,NULL,NULL,'Pendencia no pagamento da Taxa de Pàrticipação',NULL,'Parceiro, houve um problema no pagamento da taxa do seu pedido [Pedido.id], verifique para não perder a oportunidade, lembre-se os produtos da campanha são limitados.',NULL,4,NULL,NULL),(6,'\0',NULL,NULL,NULL,NULL,'Pedido Confirmado',NULL,'Prezado Parceiro, seu pedido [Pedido.id] foi confirmado e está aguardando a entrega pelo fornecedor.',NULL,4,NULL,NULL),(7,'\0',NULL,NULL,NULL,NULL,'Pedido Faturado',NULL,'Prezado Parceiro, seu pedido [Pedido.id] foi faturado, você já pode verificar a nota fiscal no nosso sistema.',NULL,4,NULL,NULL),(8,'\0',NULL,NULL,NULL,NULL,'Taxa de Participação estornada',NULL,'Prezado Parceiro, a taxa de participação do seu pedido [Pedido.id], foi estornada.',NULL,4,NULL,NULL),(9,'\0',NULL,NULL,NULL,NULL,'Divulgação de nova campanha',NULL,'Prezado Parceiro, nova campanha no dia [Campanha.dataDeInicio] a partir das 00:00.',NULL,3,NULL,NULL),(10,'\0',NULL,NULL,NULL,NULL,'Nova Campanha em Andamento',NULL,'Prezado Parceiro, campanha [Campanha.titulo] foi aberta, lembre-se os produtos são limitados por campanha.',NULL,3,NULL,NULL),(11,'\0',NULL,NULL,NULL,NULL,'Campanha Vigente',NULL,'Prezado Parceiro, sua campanha [Campanha.titulo], já está em andamento.',NULL,3,NULL,NULL),(12,'\0',NULL,NULL,NULL,NULL,'Campanha no final',NULL,'Prezado Parceiro, a campanha [Campanha.titulo], está chegando ao final, não perca a oportunidade.',NULL,3,NULL,NULL),(13,'\0',NULL,NULL,NULL,NULL,'Campanha convertida',NULL,'Prezado Parceiro, sua campanha [Campanha.titulo], foi convertida.',NULL,3,NULL,NULL),(14,'\0',NULL,NULL,NULL,NULL,'Conversão Manual',NULL,'Prezado Parceiro, sua campanha não atingiu o minimo aceitavel, mas você ainda pode converte-la manualmente.',NULL,3,NULL,NULL),(15,'\0',NULL,NULL,NULL,NULL,'Campanha Cancelada',NULL,'Prezado Parceiro, sua campanha [Campanha.titulo], foi cancelada',NULL,3,NULL,NULL),(16,'\0',NULL,NULL,NULL,NULL,'Campanha Cancelada',NULL,'Prezado Parceiro, a campanha [Campanha.titulo] foi cancelada, em breve a sua taxa de participação será estornada.',NULL,3,NULL,NULL),(17,'\0',NULL,NULL,NULL,NULL,'Nota fiscal da taxa de participação',NULL,'Prezado Parceiro, a nota fiscal da taxa de participação, do pedido foi gerada e enviada ao seu e-mail.',NULL,4,NULL,NULL),(18,'\0',NULL,NULL,NULL,NULL,'Campanha Aprovada',NULL,'Prezado Parceiro, sua campanha [Campanha.titulo], foi aprovada.',NULL,3,NULL,NULL),(19,'\0',NULL,NULL,NULL,NULL,'Campanha Reprovada',NULL,'Prezado Parceiro, a Campanha [Campanha.titulo] foi reprovada.',NULL,3,NULL,NULL),(20,'\0',NULL,NULL,NULL,NULL,'Sugestão Campanha',NULL,'',NULL,3,NULL,NULL);
/*!40000 ALTER TABLE `Sms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusCampanha`
--

DROP TABLE IF EXISTS `StatusCampanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusCampanha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusCampanha`
--

LOCK TABLES `StatusCampanha` WRITE;
/*!40000 ALTER TABLE `StatusCampanha` DISABLE KEYS */;
INSERT INTO `StatusCampanha` VALUES (1,'Campanha aguardando aprovacao do setor resposavel','Aguardando aprovacao'),(2,'Campanha aguardando data de inicio','Aprovada'),(3,'Campanha em andamento','Vigente'),(4,'Campanha atingiu a meta de conversao','Convertida'),(5,'Campanha nao autorizada pelo setor responsavel','Reprovada'),(6,'Campanha cancelada','Cancelada'),(7,'Campanha nao foi convertida','Expirada'),(8,'Campanha esta aguardando conversao','Aguarde Conversao'),(9,'Campanha com dados ainda não preenchidos','Incompleta'),(10,'Campanha para ser Cancelada','Cancelando');
/*!40000 ALTER TABLE `StatusCampanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusComprador`
--

DROP TABLE IF EXISTS `StatusComprador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusComprador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusComprador`
--

LOCK TABLES `StatusComprador` WRITE;
/*!40000 ALTER TABLE `StatusComprador` DISABLE KEYS */;
INSERT INTO `StatusComprador` VALUES (1,'Comprador com acesso ao sistema.','Ativo'),(2,'Comprador bloqueado do sistema.','Suspenso'),(3,'Comprador sem acesso ao sistema temporariamente.','Inativo'),(4,'O cadastro foi completado, mas não foi gerado o contrato.','Aguardando Contrato'),(5,'Comprador com cadastro incompleto','Incompleto');
/*!40000 ALTER TABLE `StatusComprador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusFilialComprador`
--

DROP TABLE IF EXISTS `StatusFilialComprador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusFilialComprador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusFilialComprador`
--

LOCK TABLES `StatusFilialComprador` WRITE;
/*!40000 ALTER TABLE `StatusFilialComprador` DISABLE KEYS */;
INSERT INTO `StatusFilialComprador` VALUES (1,'Filial ativa no sistema, podendo ser realizado campanha ou pedidos.','Ativa'),(2,'Filial matriz encontra-se suspensa.','Suspenso'),(3,'Filial que não será listada para realizar campanha ou pedidos.','Inativo');
/*!40000 ALTER TABLE `StatusFilialComprador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusFilialFornecedor`
--

DROP TABLE IF EXISTS `StatusFilialFornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusFilialFornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusFilialFornecedor`
--

LOCK TABLES `StatusFilialFornecedor` WRITE;
/*!40000 ALTER TABLE `StatusFilialFornecedor` DISABLE KEYS */;
INSERT INTO `StatusFilialFornecedor` VALUES (1,'Filial ativa no sistema, podendo ser realizado campanha ou pedidos.','Ativa'),(2,'Filial matriz encontra-se suspensa.','Suspenso'),(3,'Filial que não será listada para realizar campanha ou pedidos.','Inativo');
/*!40000 ALTER TABLE `StatusFilialFornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusFornecedor`
--

DROP TABLE IF EXISTS `StatusFornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusFornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusFornecedor`
--

LOCK TABLES `StatusFornecedor` WRITE;
/*!40000 ALTER TABLE `StatusFornecedor` DISABLE KEYS */;
INSERT INTO `StatusFornecedor` VALUES (1,'Fornecedor Ativo no Sistema','Ativo'),(2,'Fornecedor bloqueado do sistema.','Suspenso'),(3,'Fornecedor sem acesso ao sistema temporariamente.','Inativo'),(4,'O cadastro foi completado, mas não foi gerado o contrato.','Aguardando Contrato'),(5,'Fornecedor com cadastro incompleto','Incompleto');
/*!40000 ALTER TABLE `StatusFornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusPedido`
--

DROP TABLE IF EXISTS `StatusPedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusPedido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusPedido`
--

LOCK TABLES `StatusPedido` WRITE;
/*!40000 ALTER TABLE `StatusPedido` DISABLE KEYS */;
INSERT INTO `StatusPedido` VALUES (1,'Pedido aguarda termino da campanha ','Aguardando termino da campanha'),(2,'Pedido foi confirmado','Confirmado'),(3,'Pedido foi faturado','Faturado'),(4,'Pedido foi finalizado','Finalizado'),(5,'Pendencia de pagamento do pedido','Pendencia de pagamento'),(6,'Pendencia de entrega do pedido','Pendencia de entrega'),(7,'Pedido foi cancelado','Pedido cancelado'),(8,'Pedido foi estornado','Pedido estornado'),(9,'Pedido com atraso','Pedido com atraso');
/*!40000 ALTER TABLE `StatusPedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StatusTransacaoCartao`
--

DROP TABLE IF EXISTS `StatusTransacaoCartao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StatusTransacaoCartao` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StatusTransacaoCartao`
--

LOCK TABLES `StatusTransacaoCartao` WRITE;
/*!40000 ALTER TABLE `StatusTransacaoCartao` DISABLE KEYS */;
INSERT INTO `StatusTransacaoCartao` VALUES (1,'Aprovado'),(2,'Não Processado'),(3,'Recusado'),(4,'Consolidado'),(5,'Cancelado');
/*!40000 ALTER TABLE `StatusTransacaoCartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SugestaoDeCampanha`
--

DROP TABLE IF EXISTS `SugestaoDeCampanha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SugestaoDeCampanha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataInserida` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `descritivo` varchar(255) DEFAULT NULL,
  `nota` int(11) NOT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK63vfnb229p24nhjd3xvvb0bel` (`comprador_id`),
  KEY `FKk1dpkcfjl6c5j8k4591jvcvpd` (`usuarioAlteracao_id`),
  KEY `FKs4pmyu2dd1tnfsq3ksfh4lixj` (`usuarioInsercao_id`),
  CONSTRAINT `FK63vfnb229p24nhjd3xvvb0bel` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`),
  CONSTRAINT `FKk1dpkcfjl6c5j8k4591jvcvpd` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKs4pmyu2dd1tnfsq3ksfh4lixj` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SugestaoDeCampanha`
--

LOCK TABLES `SugestaoDeCampanha` WRITE;
/*!40000 ALTER TABLE `SugestaoDeCampanha` DISABLE KEYS */;
/*!40000 ALTER TABLE `SugestaoDeCampanha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoEntrega`
--

DROP TABLE IF EXISTS `TipoEntrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoEntrega` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoEntrega`
--

LOCK TABLES `TipoEntrega` WRITE;
/*!40000 ALTER TABLE `TipoEntrega` DISABLE KEYS */;
INSERT INTO `TipoEntrega` VALUES (1,'Retirada na Unidade Fornecedora','FOB'),(2,'Entrega na Unidade Compradora','CIF');
/*!40000 ALTER TABLE `TipoEntrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoIp`
--

DROP TABLE IF EXISTS `TipoIp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoIp` (
  `id` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoIp`
--

LOCK TABLES `TipoIp` WRITE;
/*!40000 ALTER TABLE `TipoIp` DISABLE KEYS */;
INSERT INTO `TipoIp` VALUES (1,NULL,'FaixaIP'),(2,NULL,'DNS');
/*!40000 ALTER TABLE `TipoIp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoMensagemSK`
--

DROP TABLE IF EXISTS `TipoMensagemSK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoMensagemSK` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `enumTipoMensagem` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoMensagemSK`
--

LOCK TABLES `TipoMensagemSK` WRITE;
/*!40000 ALTER TABLE `TipoMensagemSK` DISABLE KEYS */;
INSERT INTO `TipoMensagemSK` VALUES (1,'Mensagem ref. Comprador',0),(2,'Mensagem ref. Fornecedor',1),(3,'Mensagem ref. Campanha',2),(4,'Mensagem ref. Pedido',3),(5,'Mensagem ref. Usuario',4),(6,'Mensagem ref. Sugestão de Campanha',5);
/*!40000 ALTER TABLE `TipoMensagemSK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoPagamento`
--

DROP TABLE IF EXISTS `TipoPagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoPagamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoPagamento`
--

LOCK TABLES `TipoPagamento` WRITE;
/*!40000 ALTER TABLE `TipoPagamento` DISABLE KEYS */;
INSERT INTO `TipoPagamento` VALUES (1,'Pagamento será efetuado com créditos obtidos','Pré-Pago','\0'),(2,'Pagamento será efetuado posteriormente','Pós-Pago','\0');
/*!40000 ALTER TABLE `TipoPagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoParceiro`
--

DROP TABLE IF EXISTS `TipoParceiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoParceiro` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoParceiro`
--

LOCK TABLES `TipoParceiro` WRITE;
/*!40000 ALTER TABLE `TipoParceiro` DISABLE KEYS */;
INSERT INTO `TipoParceiro` VALUES (1,'Comprador'),(2,'Fornecedor');
/*!40000 ALTER TABLE `TipoParceiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoProduto`
--

DROP TABLE IF EXISTS `TipoProduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoProduto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4embdq55nmvpinmguvpbga2bt` (`usuarioAlteracao_id`),
  KEY `FKtiw1beq4shkw8orwgmfn3mlw4` (`usuarioInsercao_id`),
  CONSTRAINT `FK4embdq55nmvpinmguvpbga2bt` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKtiw1beq4shkw8orwgmfn3mlw4` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoProduto`
--

LOCK TABLES `TipoProduto` WRITE;
/*!40000 ALTER TABLE `TipoProduto` DISABLE KEYS */;
INSERT INTO `TipoProduto` VALUES (1,'\0','Produto perecível','Perecível',NULL,NULL),(2,'\0','Produto NÂO perecível','Não perecível',NULL,NULL);
/*!40000 ALTER TABLE `TipoProduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Unidade`
--

DROP TABLE IF EXISTS `Unidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Unidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Unidade`
--

LOCK TABLES `Unidade` WRITE;
/*!40000 ALTER TABLE `Unidade` DISABLE KEYS */;
INSERT INTO `Unidade` VALUES (1,'Litros etc.','Volume'),(2,'Quantidade unitária','Quantidade');
/*!40000 ALTER TABLE `Unidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UnidadeFederativa`
--

DROP TABLE IF EXISTS `UnidadeFederativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UnidadeFederativa` (
  `id` int(11) NOT NULL,
  `UF` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UnidadeFederativa`
--

LOCK TABLES `UnidadeFederativa` WRITE;
/*!40000 ALTER TABLE `UnidadeFederativa` DISABLE KEYS */;
INSERT INTO `UnidadeFederativa` VALUES (2082,'AC','AC'),(2091,'AL','AL'),(2092,'AM','AM'),(2095,'AP','AP'),(2111,'BA','BA'),(2146,'CE','CE'),(2178,'DF','DF'),(2222,'ES','ES'),(2280,'GO','GO'),(2452,'MA','MA'),(2458,'MG','Minas Gerais'),(2470,'MS','MS'),(2471,'MT','MT'),(2545,'PA','PA'),(2546,'PB','PB'),(2549,'PE','PE'),(2553,'PI','PI'),(2562,'PR','PR'),(2616,'RJ','RJ'),(2620,'RN','RN'),(2621,'RO','RO'),(2624,'RR','RR'),(2625,'RS','RS'),(2640,'SC','SC'),(2642,'SE','SE'),(2653,'SP','SP'),(2683,'TO','TO');
/*!40000 ALTER TABLE `UnidadeFederativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UsuarioSB`
--

DROP TABLE IF EXISTS `UsuarioSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UsuarioSB` (
  `tipoUsuario` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apelido` varchar(255) DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `dataHoraAlteracao` datetime(6) DEFAULT NULL,
  `dataHoraInsersao` datetime(6) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `usuarioPrincipal` bit(1) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  `comprador_id` int(11) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_d8hre5rs465kuoya4b9epuot7` (`apelido`),
  UNIQUE KEY `UK_m1rxw56li2lkr3guust77ltso` (`email`),
  KEY `FKpu9xpcabqjpw3jjdb6mu4w3a9` (`grupo_id`),
  KEY `FKddt81m657meu8v89qakv0792x` (`localizacao_id`),
  KEY `FKa0hk7be13ip4xg104xlxghvba` (`usuarioAlteracao_id`),
  KEY `FKg5805u50psplpao25esj3i4om` (`usuarioInsercao_id`),
  KEY `FKt8g8k2244jmsaj2jkpwhtaqcr` (`comprador_id`),
  KEY `FK1rn8c056blghgqj49cvqx7ikb` (`fornecedor_id`),
  CONSTRAINT `FK1rn8c056blghgqj49cvqx7ikb` FOREIGN KEY (`fornecedor_id`) REFERENCES `Fornecedor` (`id`),
  CONSTRAINT `FKa0hk7be13ip4xg104xlxghvba` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKddt81m657meu8v89qakv0792x` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKg5805u50psplpao25esj3i4om` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKpu9xpcabqjpw3jjdb6mu4w3a9` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`),
  CONSTRAINT `FKt8g8k2244jmsaj2jkpwhtaqcr` FOREIGN KEY (`comprador_id`) REFERENCES `Comprador` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UsuarioSB`
--

LOCK TABLES `UsuarioSB` WRITE;
/*!40000 ALTER TABLE `UsuarioSB` DISABLE KEYS */;
INSERT INTO `UsuarioSB` VALUES ('UserComprador',1,NULL,'',NULL,'2018-05-16',NULL,NULL,'comprador@superkompras.com.br','Usuário comprador testes','123',NULL,'',3,NULL,NULL,NULL,1,NULL),('UserFornecedor',2,NULL,'',NULL,'2018-05-16',NULL,NULL,'fornecedor@superkompras.com.br','Fornecedor Test','123',NULL,'\0',2,NULL,NULL,NULL,NULL,1),('UsuarioSB',3,'Administrador Exemplo','',NULL,'2018-05-16',NULL,NULL,'administrador@superkompras.com.br','administradorExemplo','123',NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `UsuarioSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (3),(3),(3),(3),(3),(3),(3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulos_grupo`
--

DROP TABLE IF EXISTS `modulos_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modulos_grupo` (
  `grupo_id` int(11) NOT NULL,
  `modulo_id` int(11) NOT NULL,
  UNIQUE KEY `UKngph303pxo2b2mrtpfkoacmwq` (`grupo_id`,`modulo_id`),
  KEY `FK1616eg4vq1ubds5aof20ci82b` (`modulo_id`),
  CONSTRAINT `FK1616eg4vq1ubds5aof20ci82b` FOREIGN KEY (`modulo_id`) REFERENCES `ModuloAcaoSistema` (`id`),
  CONSTRAINT `FKf5g7yb014obr43smkvslw1hmu` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulos_grupo`
--

LOCK TABLES `modulos_grupo` WRITE;
/*!40000 ALTER TABLE `modulos_grupo` DISABLE KEYS */;
INSERT INTO `modulos_grupo` VALUES (1,-925014728),(2,258245668),(3,258245668),(3,1389070057),(2,1795722597);
/*!40000 ALTER TABLE `modulos_grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regiao_cidades`
--

DROP TABLE IF EXISTS `regiao_cidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regiao_cidades` (
  `regiao_id` int(11) NOT NULL,
  `cidade_id` int(11) NOT NULL,
  KEY `FKl4njys9fksqduv028a4j3mera` (`cidade_id`),
  KEY `FKgcjw6nyiocwydbhjayj1q0qe2` (`regiao_id`),
  CONSTRAINT `FKgcjw6nyiocwydbhjayj1q0qe2` FOREIGN KEY (`regiao_id`) REFERENCES `Regiao` (`id`),
  CONSTRAINT `FKl4njys9fksqduv028a4j3mera` FOREIGN KEY (`cidade_id`) REFERENCES `Cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regiao_cidades`
--

LOCK TABLES `regiao_cidades` WRITE;
/*!40000 ALTER TABLE `regiao_cidades` DISABLE KEYS */;
INSERT INTO `regiao_cidades` VALUES (1,1951884635),(1,-1674173133),(1,63091029),(1,1386876023),(1,63881304),(1,-982302286),(1,1669100074),(1,215178624),(1,-93790049),(1,1149021320),(1,-1972251336),(1,-1836501561),(1,1841062860),(1,-1956268076),(1,1027141852),(1,-548111402),(1,2101622002),(1,-880559648),(1,-1727579347),(1,639869084),(1,1962406916),(1,713529131),(1,-1486711115),(1,1698070089),(1,1117164662),(1,368938548),(1,379966223),(1,-1856687620),(1,-1536122825),(1,-1411626103),(1,-1925135746),(1,-1707232582),(1,2103479604),(1,-1330591657);
/*!40000 ALTER TABLE `regiao_cidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_grupo`
--

DROP TABLE IF EXISTS `usuario_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_grupo` (
  `grupo_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  UNIQUE KEY `usuarioDuplicado` (`usuario_id`,`grupo_id`),
  KEY `FKeq1sxhjeq2ml8suqspdgh1esk` (`grupo_id`),
  CONSTRAINT `FKeq1sxhjeq2ml8suqspdgh1esk` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`),
  CONSTRAINT `FKr399r2larmugqgxwl0rbtywfi` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_grupo`
--

LOCK TABLES `usuario_grupo` WRITE;
/*!40000 ALTER TABLE `usuario_grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_grupo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-16 21:43:52
