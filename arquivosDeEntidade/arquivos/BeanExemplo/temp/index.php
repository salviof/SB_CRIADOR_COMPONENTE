
	<!--Aplicativo Para Smartphone
	Autor: Jurandir Hora
	-->

	<html>
	<head>
	<!--icone da aplicação-->
	<link rel="shortcut icon" href="img/Icone.ico">
	<!--Título da aplicação-->
	<title>Exsergia-House</title> 
	<!--estilo css-->
<link href="css\estilo.css" rel="stylesheet" type="text/css" media="all" />
	</head>
	<body>

	<!--Alinhar ao centro da tela-->
	  <div align="center">
	  <?php
	  
	$sock = socket_create(AF_INET, SOCK_STREAM, SOL_TCP);
	// Se conecta ao IP e Porta:
	//Para acessar Internamente o Arduino pelo programa em PHP rodando no servidor WEB
	socket_connect($sock,"192.168.0.30", 8080);
	//Para acessar externamente o Arduino pelo programa em PHP rodando no servidor WEB
	//socket_connect($sock,"187.15.6.131", 7171);
	 
	// Executa a ação correspondente ao botão apertado.
	  if(isset($_POST['bits'])) {
	  $msg = $_POST['bits'];
	  if(isset($_POST['LP1'   ])){ if($msg[0]=='1') { $msg[0]='0'; } else { $msg[0]='1'; }}
	  if(isset($_POST['LP2'])){ if($msg[1]=='1') { $msg[1]='0'; } else { $msg[1]='1'; }}
	  if(isset($_POST['LP3'])){ if($msg[2]=='1') { $msg[2]='0'; } else { $msg[2]='1'; }}
	  if(isset($_POST['LP4'   ])){ if($msg[3]=='1') { $msg[3]='0'; } else { $msg[3]='1'; }}
	  //-----------------------------------------------------------------------------------
	  
	  if(isset($_POST['LP5'   ])){ if($msg[4]=='1') { $msg[4]='0'; } else { $msg[4]='1'; }}
	  
	  //-----------------------------------------------------------------------------------
	  if(isset($_POST['PORTAO1'])){ $msg = 'P#'; }
	  if(isset($_POST['PORTAO2' ])){ $msg = 'G#'; }
	  socket_write($sock,$msg,strlen($msg));
	}
	 
	socket_write($sock,'R#',2); //Requisita o status do sistema.
	 
	// Espera e lê o status e define a cor dos botões de acordo.
	$status = socket_read($sock,6);
	//Pula uma linha
	  echo "$var <br>";

	//Se a variável status no array 4 recebeu 'L' então status no array 5 = #
	if (($status[4]=='L')&&($status[5]=='#')) {
	  if ($status[0]=='0') $cor1 = SteelBlue;
		else $cor1 = SkyBlue;
	  if ($status[1]=='0') $cor2 = SteelBlue;
		else $cor2 = SkyBlue;
	  if ($status[2]=='0') $cor3 = SteelBlue;
		else $cor3 = SkyBlue;
	  if ($status[3]=='0') $cor4 = SteelBlue;
		else $cor4 = SkyBlue;
	   
	 // Define o tipo de cabeçalho para exibir a imagem corretamente
	//Abrir Imagem na pasta do projeto
	// Define o tipo de cabeçalho para exibir a imagem corretamente


	if($a == ""){
	echo "<img src='img\logo1.png' width='950' height='150' alt='JSH' />";



	}
	//Escreve "grupo Atomos após img 
	  echo "<p><font face=\"Verdana\" color=\"#808080\">Grupo Atomos Smart, tecnologia ao alcance das mãos</font></p>";
	 
	//Apresenta o valor de status de retorno na tela retirando os 2 últimos caracteres
	$mensagem = substr($status,0,-2);
	echo "<h1>Status de retorno: $mensagem</h1>"; 
	  
	  //Pula uma linha
	  echo "$var <br>";
	  
	  //Pula uma linha
	  echo "$var <br>";
	  
	  echo "<form method =\"post\" action=\"index.php\">";
	  
	  echo "<input type=\"hidden\" name=\"bits\" value=\"$status\">";
	  //Botão com nome e estilo
	  echo "<button style=\"width:966; height:150; color:#FF8040; background-color: $cor1 ;font: bold 50px Arial\" type = \"Submit\" Name = \"LP1\">LED VERMELHO</button></br></br>";
	  
	  echo "<button style=\"width:966; height:150; color:#FF8040; background-color: $cor2 ;font: bold 50px Arial\" type = \"Submit\" Name = \"LP2\">LED VERDE</button></br></br>";
	  
	  echo "<button style=\"width:966; height:150; color:#FF8040; background-color: $cor3 ;font: bold 50px Arial\" type = \"Submit\" Name = \"LP3\">LED AZUL</button></br></br>";
	  
	  echo "<button style=\"width:966; height:150; color:#FF8040; background-color: $cor4 ;font: bold 50px Arial\" type = \"Submit\" Name = \"LP4\">LED AMARELO</button></br></br>";
	  //-----------------------------
	  echo "<button style=\"width:966; height:150; color:#FF8040; background-color: $cor5 ;font: bold 50px Arial\" type = \"Submit\" Name = \"LP5\">JSH</button></br></br>";
	  //-----------------------------
	  echo "<button style=\"width:966; height:150; color:#FF8040;font: bold 50px Arial\" type = \"Submit\" Name = \"PORTAO1\">TEMPORIZA AMARELO</button></br></br>";
	  
	  echo "<button style=\"width:966; height:150; color:#FF8040;font: bold 50px Arial\" type = \"Submit\" Name = \"PORTAO2\">TEMPORIZA VERDE</button></br></br>";
	  
	  echo "</form>";
	}
	// Caso ele não receba o status corretamente, avisa erro.
	else { echo "Falha ao receber status da empresa."; }
	socket_close($sock);
	?>
<?Php 
echo "<a href='http://grupoatomos.no-ip.info/projetoatomos/cam/' target='_blank'><h3>Abrir Câmera</h3></a>" 
?>
	  
	  </div>
	<p align="center">&nbsp; </p>
	</body>
	</html> 