
import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class Catalogo extends JFrame{
	
	public String Usuario1;
	public String Contrasena1;
	public JLabel lbDisponible,lbTitulo,lbValor, imagen;
	public JTextArea lbSinopsis;
	
	public Catalogo() {
	
	setTitle("videoClub-Baka");
	setSize(550,464);
	setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
	
	JButton bt300 = new JButton();
    bt300.setIcon(new javax.swing.ImageIcon(getClass().getResource("300.B.png")));
    bt300.setPreferredSize(new Dimension(70, 104));
    bt300.addActionListener(new accion300());
    
    JButton bt2012 = new JButton();
    bt2012.setIcon(new javax.swing.ImageIcon(getClass().getResource("2012.B.png")));
    bt2012.setPreferredSize(new Dimension(70, 104));
    bt2012.addActionListener(new accion2012());
       
    JButton btAlicia = new JButton();
    btAlicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("Alicia.B.png")));
    btAlicia.setPreferredSize(new Dimension(70, 104));
    btAlicia.addActionListener(new accionAlicia());
    
    JButton btAvatar = new JButton();
    btAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("Avatar.B.png")));
    btAvatar.setPreferredSize(new Dimension(70, 104));
    btAvatar.addActionListener(new accionAvatar());
    
    JButton btCastillo = new JButton();
    btCastillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Castillo.B.png")));
    btCastillo.setPreferredSize(new Dimension(70, 104));
    btCastillo.addActionListener(new accionCastillo());
    
    JButton btChihiro = new JButton();
    btChihiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("Chihiro.B.png")));
    btChihiro.setPreferredSize(new Dimension(70, 104));
    btChihiro.addActionListener(new accionChihiro());
    
    JButton btClick = new JButton();
    btClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("Click.B.png")));
    btClick.setPreferredSize(new Dimension(70, 104));
    btClick.addActionListener(new accionClick());
    
    JButton btComoNinos = new JButton();
    btComoNinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("ComoNi�os.B.png")));
    btComoNinos.setPreferredSize(new Dimension(70, 104));
    btComoNinos.addActionListener(new accionComoNinos());
    
    JButton btEvil = new JButton();
    btEvil.setIcon(new javax.swing.ImageIcon(getClass().getResource("Evil.B.png")));
    btEvil.setPreferredSize(new Dimension(70, 104));
    btEvil.addActionListener(new accionEvil());
    
    JButton btFranken = new JButton();
    btFranken.setIcon(new javax.swing.ImageIcon(getClass().getResource("Franken.B.png")));
    btFranken.setPreferredSize(new Dimension(70, 104));
    btFranken.addActionListener(new accionFranken());
    
    JButton btHombreNegro = new JButton();
    btHombreNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("HombreNegro.B.png")));
    btHombreNegro.setPreferredSize(new Dimension(70, 104));
    btHombreNegro.addActionListener(new accionHombreNegro());
    
    JButton btHotelTran = new JButton();
    btHotelTran.setIcon(new javax.swing.ImageIcon(getClass().getResource("HotelTran.B.png")));
    btHotelTran.setPreferredSize(new Dimension(70, 104));
    btHotelTran.addActionListener(new accionHotelTran());
    
    JButton btHuevos = new JButton();
    btHuevos.setIcon(new javax.swing.ImageIcon(getClass().getResource("Huevos.B.png")));
    btHuevos.setPreferredSize(new Dimension(70, 104));
    btHuevos.addActionListener(new accionHuevos());
    
    JButton btMegaMente = new JButton();
    btMegaMente.setIcon(new javax.swing.ImageIcon(getClass().getResource("MegaMente.B.png")));
    btMegaMente.setPreferredSize(new Dimension(70, 104));
    btMegaMente.addActionListener(new accionMegaMente());
    
    JButton btNoviaMuerta = new JButton();
    btNoviaMuerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("NoviaMuerta.B.png")));
    btNoviaMuerta.setPreferredSize(new Dimension(70, 104));
    btNoviaMuerta.addActionListener(new accionNovia());
    
    JButton btPersia = new JButton();
    btPersia.setIcon(new javax.swing.ImageIcon(getClass().getResource("Persia.B.png")));
    btPersia.setPreferredSize(new Dimension(70, 104));
    btPersia.addActionListener(new accionPersia());
    
    JButton btPirata = new JButton();
    btPirata.setIcon(new javax.swing.ImageIcon(getClass().getResource("Piratas.B.png")));
    btPirata.setPreferredSize(new Dimension(70, 104));
    btPirata.addActionListener(new accionPirata());
    
    JButton btPitufos = new JButton();
    btPitufos.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pitufos.B.png")));
    btPitufos.setPreferredSize(new Dimension(70, 104));
    btPitufos.addActionListener(new accionPitufos());
    
    JButton btQuePasoAnoche = new JButton();
    btQuePasoAnoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("QuePasoAnoche.B.png")));
    btQuePasoAnoche.setPreferredSize(new Dimension(70, 104));
    btQuePasoAnoche.addActionListener(new accionQ1());
    
    JButton btQuePasoAnoche2 = new JButton();
    btQuePasoAnoche2.setIcon(new javax.swing.ImageIcon(getClass().getResource("QuePasoAnoche2.B.png")));
    btQuePasoAnoche2.setPreferredSize(new Dimension(70, 104));
    btQuePasoAnoche2.addActionListener(new accionQ2());
    
    JButton btRegalo = new JButton();
    btRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Regalo.B.png")));
    btRegalo.setPreferredSize(new Dimension(70, 104));
    btRegalo.addActionListener(new accionRegalo());
    
    JButton btSiguemeRollo = new JButton();
    btSiguemeRollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("SiguemeRollo.B.png")));
    btSiguemeRollo.setPreferredSize(new Dimension(70, 104));
    btSiguemeRollo.addActionListener(new accionSigueme());
    
    JButton btSimpson = new JButton();
    btSimpson.setIcon(new javax.swing.ImageIcon(getClass().getResource("Simpson.B.png")));
    btSimpson.setPreferredSize(new Dimension(70, 104));
    btSimpson.addActionListener(new accionsimpson());
    
    JButton btSpiderman = new JButton();
    btSpiderman.setIcon(new javax.swing.ImageIcon(getClass().getResource("Spiderman.B.png")));
    btSpiderman.setPreferredSize(new Dimension(70, 104));
    btSpiderman.addActionListener(new accionSpiderman());
    
    JButton btTed = new JButton();
    btTed.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ted.B.png")));
    btTed.setPreferredSize(new Dimension(70, 104));
    btTed.addActionListener(new accionTed());
    
    JButton btTitans = new JButton();
    btTitans.setIcon(new javax.swing.ImageIcon(getClass().getResource("Titans.B.png")));
    btTitans.setPreferredSize(new Dimension(70, 104));
    btTitans.addActionListener(new accionTitans());
  
    JButton btTotoro= new JButton();
    btTotoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("Totoro.B.png")));
    btTotoro.setPreferredSize(new Dimension(70, 104));
    btTotoro.addActionListener(new accionToToro());
    
    JButton btTransformer = new JButton();
    btTransformer.setIcon(new javax.swing.ImageIcon(getClass().getResource("Transformer.B.png")));
    btTransformer.setPreferredSize(new Dimension(70, 104));
    btTransformer.addActionListener(new accionTrans());
    
    JButton btUp = new JButton();
    btUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("UP.B.png")));
    btUp.setPreferredSize(new Dimension(70, 104));
    btUp.addActionListener(new accionUp());
    
    JButton btValiente = new JButton();
    btValiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("Valiente.B.png")));
    btValiente.setPreferredSize(new Dimension(70, 104));
    btValiente.addActionListener(new accionValiente());
    
    JPanel panel=new JPanel(); 
    
    panel.add(bt300);
	panel.add(bt2012);
    panel.add(btAlicia);
    panel.add(btAvatar);
    panel.add(btCastillo);
    panel.add(btChihiro);
    panel.add(btClick);
    panel.add(btComoNinos);
    panel.add(btEvil);
    panel.add(btFranken);
    panel.add(btHombreNegro);
    panel.add(btHotelTran);
    panel.add(btHuevos);
    panel.add(btMegaMente);
    panel.add(btNoviaMuerta);
    panel.add(btPersia);
    panel.add(btPirata);
    panel.add(btPitufos);
    panel.add(btQuePasoAnoche);
    panel.add(btQuePasoAnoche2);
    panel.add(btRegalo);
    panel.add(btSiguemeRollo);
    panel.add(btSimpson);
    panel.add(btSpiderman);
    panel.add(btTed);
    panel.add(btTitans);
    panel.add(btTotoro);
    panel.add(btTransformer);
    panel.add(btUp);
    panel.add(btValiente);
		
    this.getContentPane().setLayout (new GridBagLayout());
	GridBagConstraints constraints = new GridBagConstraints();
	
	JScrollPane scrollBar=new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	constraints.gridx = 0;
	constraints.gridy = 5; 
	constraints.gridwidth = 2;
	constraints.gridheight = 1;
	constraints.fill = GridBagConstraints.BOTH;
	constraints.weighty = 1.0;
	constraints.weightx = 1.0;
	this.getContentPane().add (scrollBar, constraints);
	constraints.weighty = 0.0;
	constraints.fill = GridBagConstraints.NONE;
	
	imagen = new JLabel();
	imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("PerfilPelicula.png")));
	imagen.setSize(200,296);
	constraints.gridx = 0;
	constraints.gridy = 0; 
	constraints.gridwidth = 1;
	constraints.gridheight = 5;
	this.getContentPane().add (imagen, constraints);
	
    lbTitulo = new JLabel("Bienvendios");
    lbTitulo.setFont(new java.awt.Font("Andalus", 0, 22));
    constraints.gridx = 1;
	constraints.gridy = 0; 
	constraints.gridwidth = 1;
	constraints.gridheight = 1;
	this.getContentPane().add (lbTitulo, constraints);
	
	lbDisponible = new JLabel("<html><br>Disponible</html>");
	constraints.gridx = 1;
    constraints.gridy = 2; 
	constraints.gridwidth = 1;
	constraints.gridheight = 1;
	this.getContentPane().add (lbDisponible, constraints);
		
	lbValor = new JLabel("<html><br><br>Valor:</html>");
	constraints.gridx = 1;
	constraints.gridy = 3; 
	constraints.gridwidth = 1;
	constraints.gridheight = 1;
	constraints.weightx = 1.0; 
	this.getContentPane().add (lbValor, constraints);
	constraints.weightx = 0.0; 
	
	lbSinopsis = new JTextArea("\nTe Damos La bienvenida a nuestro catalogo de peliculas. \nAqui puedes revizar la disponibilidad de nuestras peliculas, \ny si se es posible alquilarlas,podras revisar el genero,\nsinopsis y clasificacion de las peliculas \nque poseesmos en el ViedClub-Baka");
    lbSinopsis.setOpaque(false);
	lbSinopsis.setEditable(false);
	lbSinopsis.setSize(350,100);
    constraints.gridx = 1;
	constraints.gridy = 1; 
	constraints.gridwidth = 1;
	constraints.gridheight = 1;
	this.getContentPane().add (lbSinopsis, constraints);
	
	JButton btAlquilar = new JButton("Alquilar");
	constraints.anchor = GridBagConstraints.CENTER;
    constraints.gridx = 1;
	constraints.gridy = 4; 
	constraints.gridwidth = 1;
	constraints.gridheight = 1;
	this.getContentPane().add (btAlquilar, constraints);
    btAlquilar.addActionListener(new accionAlquilar()); }

  public class accionAlquilar implements ActionListener{

	@Override
	
	public void actionPerformed(ActionEvent e) {
		
		lbDisponible.setText("Alquilada");
		String Codigo;
		Codigo = JOptionPane.showInputDialog(null,"Si Usted es Cliente Porfavor Acerquese \n a nuestros empleados ellos \n le ayudaran con el alquiler. \n Ingrese el codigo");
		
		if(Codigo.equals("BakaGorroFeo")){
			
			RegistrarPelicula pelicula = new RegistrarPelicula();
			pelicula.setVisible(true);}}}
  
  public class accion300 implements ActionListener {

	@Override
	
	public void actionPerformed(ActionEvent e) {
		
		lbTitulo.setText("300");
		lbValor.setText("Valor:  $2000");
		imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("300.I.png")));
		lbSinopsis.setText("Genero: Acci�n, Epica, Hist�rica, Fantas�a\nClasificacion: Buena\nSinopsis:\nBasada en la �pica novela gr�fica de Frank Miller,\n300 narra la antigua Batalla de Term�pilas,en la\nque el rey Le�nidas, junto con 300 espartanos,\nluch� a muerte contra el Emperador Jerjes y su gran\nej�rcito persa. Haciendo frent na insuperables adversidades,\nel valor y sacrificio de estos hombres inspir� a toda\nGrecia para unirse contra el enemigo persa,\ny as� decir basta a esa situaci�n en favor de la democracia.");}}
  
  public class accion2012 implements ActionListener {

	@Override
	
	public void actionPerformed(ActionEvent e) {
		
		lbTitulo.setText("2012");
		lbValor.setText("Valor:  $2000");
		imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("2012.I.png")));
		lbSinopsis.setText("Genero: Drama, Cat�strofe.\nClasificacion: Buena\nSinopsis:\nSiglos atr�s, los mayas nos dejaron un calendario,\ncon una fecha que predec�a claramente el final y todo\nlo que ello conlleva. Desde entonces, los astr�logos\nla han descubierto, los numer�logos han encontrado\nlas pautas que la predicen, los ge�logos dicen que\nla tierra tiene los d�as contados; incluso los cient�ficos\nde los gobiernos no pueden negar el cataclismo de\nproporciones �picas que espera a la tierra en 2012.\nUna profec�a que comenz� con los mayas ha sido\nahora contada, discutida, desglosada y examinada.\nEn el a�o 2012 lo sabremos, hemos sido prevenidos.");}}
  
  public class accionAlicia implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Alicia En El Pais De Las Maravillas (2010)");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Alicia.I.png")));
			lbSinopsis.setText("Genero: Fantasia, Aventura\nClasificacion: Buena\nSinopsis:\nInspirada en la obra hom�nima de Lewis Carroll. Alicia, una\njoven de 19 a�os, acude a una mansi�n victoriana para\nasistir a una fiesta de la alta sociedad. Cuando est� a punto\nde recibir p�blicamente una propuesta de matrimonio, sale\ncorriendo tras un conejo blanco y va a parar al Pa�s de las\nMaravillas, un lugar que hab�a visitado diez a�os antes, aunque\nya no lo recuerda. Ese pa�s era un reino pac�fico hasta que la\nReina Roja derroc� a su hermana, la Reina Blanca, pero las\ncriaturas que viven en �l, est�n dispuestas a rebelarse\ny esperan contar con la ayuda de Alicia, a la que ayudan\na recordar su primera visita al fant�stico reino.");}}
  
  public class accionAvatar implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Avatar");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Avatar.I.png")));
			lbSinopsis.setText("Genero: Ciencia Ficcion, Accion.\nCalificacion: Buena\nSinopsis:\nHistoria de un ex-Marine que se ver� envuelto en\nuna guerra entre fuerzas alien�genas en un\nplaneta lleno de ex�ticas formas de vida.\nComo un Avatar, una mente humana en un cuerpo\nextraterrestre, se encuentra dividido entre dos mundos,\nen una lucha desesperada por su propia supervivencia y\npor la del pueblo ind�gena.");}}
  
  public class accionCastillo implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("El Castillo Ambulante");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Castillo.I.png")));
			lbSinopsis.setText("Genero: Animacion, Aventura\nClaificacion: Buena\nSinopsis:\nLa peque�a Sophie trabaja d�a con d�a haciendo sombreros\nen la tienda que le hered� su padre al morir. En un paseo,\nSophie se encuentra con un hechicero llamado Howl.\nEl hechicero es muy elegante y tremendamente guapo\nPero una malvada bruja interpreta equivocadamente esta\nrelaci�n, y en un ataque de celos hace caer una maldici�n\nsobre Sophie, transform�ndola en una viejecilla de noventa\na�os. Desesperada, Sophie abandona su casa y vaga triste\nsin rumbo fijo, cuando de pronto se encuentra con el Incre�ble\nCastillo Vagabundo de Howl, el hechicero. Escondiendo\nsu verdadera identidad, entra al castillo como ama de llaves.");}}
  
  public class accionChihiro implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("El Viaje De Chihiro");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Chihiro.I.png")));
			lbSinopsis.setText("Genero: Animacion, Aventura, Fantasia.\nClasificacion: Buena\nSinopsis:\nChihiro es una ni�a de diez a�os que viaja\nen coche con sus padres. Despu�s de atravesar\nun t�nel, llegan a un mundo fant�stico, en el\nque no hay lugar para los seres humanos,\ns�lo para los dioses de primera y segunda clase.\nCuando descubre que sus padres han sido convertidos en\ncerdos, Chihiro se siente muy sola y asustada.");}}
  
  public class accionClick implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Click");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Click.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nAdam Sandler es un arquitecto adicto al trabajo, concentrado\nen lograr que lo nombren socio de la empresa donde labora\ny, en consecuencia, dedica poco tiempo a su familia. En la\ntienda a donde va a comprar un control remoto universal un\nvendedor le ofrece uno que, m�s all� del 'home theatre', le\npermitir� manejar su vida como si fuera una pel�cula en\nun reproductorde video. Inicialmente funciona de maravilla\npero, como era de esperarse, sus manipulaciones no\ntardan en producir serias complicaciones. ");}}
  
  public class accionComoNinos implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Son Como Ni�os");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("ComoNi�os.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena.\nSinopsis:\nDespu�s de treinta a�os, cinco amigos vuelven a verse para\nasistir al funeral de su entrenador de baloncesto de la infancia.\nCon sus esposas e hijos a cuestas, deciden pasar el fin de\nsemana del 4 de julio en una casa cerca de un lago, en\nla que muchos a�os antes hab�an celebrado la conquista de\nun campeonato. Curiosamente, esos d�as de convivencia les\nhar�n comprender que, a pesar de que ya son personas\nadultas, en realidad no han madurado. ");}}
  
  public class accionEvil implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Residen Evil Afterlife");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Evil.I.png")));
			lbSinopsis.setText("Genero: Accion,Terror,Ciencia Ficcion.\nClasificacion: Buena\nSinopsis:\nEn un mundo arrasado por un virus que transforma\na sus v�ctimas en no muertos, Alice contin�a\nsu viaje en busca de supervivientes para conducirlos\nhacia un lugar seguro. Su batalla sin fin contra\nla Corporaci�n Umbrella alcanza nuevas alturas, pero Alice\nrecibe ayuda inesperada de un viejo amigo;\nun nuevo l�der que promete un refugio seguro contra los\nzombis que los gu�a hacia Los �ngeles; pero al llegar,\nla ciudad se encuentra poblada de hordas de muertos\nvivientes, y Alice y sus camaradas estar�n a\nun paso de una trampa mortal.");}}
  
  public class accionFranken implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Frankenweenie");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Franken.I.png")));
			lbSinopsis.setText("Genero: Animacion, Ciencia Ficcion, Comedia.\nClasificacion: Buena.\nSinopsis:\nPel�cula basada en el cortometraje hom�nimo\nque el propio Burton realiz� en 1984. El experimento\ncient�fico que lleva a cabo el peque�o Victor para\nhacer resucitar su adorado perro Sparky, lo obligar�\na afrontar terribles situaciones cuyas consecuencias\nson imprevisibles.");}}
  
  public class accionHombreNegro implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Hombres De Negro 3");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("HombreNegro.I.png")));
			lbSinopsis.setText("Genero: Ciencia Ficcion, Comedia.\nClasificacion: Buena\nSinopsis:\nCuando el MIB recibe la informaci�n de que el Agente K\npodr�a morir a manos de un alien�gena, lo que\ncambiar�a la historia para siempre, el Agente J\nes enviado a los a�os 60 para evitarlo.\nTercera entrega de la popular saga Hombres de Negro.");}}
  
  public class accionHotelTran implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Hotel Transylvania");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("HotelTran.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia De Terror.\nClasificacion\n Buena.\nSinopsis:\nDesde su nacimiento, Mavis vive en el lujoso hotel\nTransylvania, que fue creado para proteger a los monstruos\nde la amenaza de los seres humanos. Cuando Mavis est� a\npunto de cumplir la mayor�a de edad (118 a�os), su padre,\nel conde Dr�cula, le prepara una fiesta a la que acuden\nlos mejores amigos de la familia: desde Frankenstein\nal Hombre Invisible o la Momia; pero tambi�n\nasiste a la celebraci�n un hombre que se enamora\nde Mavis. ");}}
  
  public class accionHuevos implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Una Pelicula De Huevos");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Huevos.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena.\nSinopsis:\nToto es un huevito sagaz y simp�tico que no quiere\nconvertirse en un simple desayuno sino que sue�a\ncon transformarse en un gran pollo de granja. As� que,\njunto con su compa�ero Willy y un Tocino de muy baja\ninteligencia, emprende una emocionante aventura para\nllegar a 'las granjas el poll�n'. Toto y Willy, ayudados de la\nvaliente huevita Bibi y otros amigos, tendr�n que\nsortear un par de comadrejas hambrientas, atravesar\nvalientemente la casa de los fen�menos, enfrentar\na una pandilla de huevos de reptil y amaestrar p�jaros\npara lograr su cometido");}}
  
  public class accionMegaMente implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("MegaMente");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("MegaMente.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nMegamind es el supervillano m�s brillante que el mundo haya\nconocido. Y el que menos �xito tiene. Durante a�os, ha estado\nintentando conquistar Metro City por todos los medios posibles.\nCada intento constituye un fracaso, por culpa de Metro Man,\nun h�roe invencible hasta que Megamind consigue matarlo.\nDe repente, la vida de Megamind carece de sentido.\n�Qu� puede hacer un supervillano sin un superh�roe con\nel que enfrentarse?. Crear a Tit�n, un nuevo h�roe m�s fuerte\nque Metro Man. Pero Tit�n empieza a pensar que es mucho\nm�s divertido ser malo que ser bueno. Adem�s, Tit�n no\nse propone conquistar el mundo, sino destruirlo.\n�Podr� derrotar Megamind a su diab�lica criatura?");}}
  
  public class accionNovia implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("El Cadaver De La Novia");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("NoviaMuerta.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nUn hombre pone en el dedo de una mujer muerta,\ncomo broma, un anillo de compromiso. Pero lo que no\nsabe el pobre mortal es que la muerta reclamar� sus\nderechos como 'prometida'.");}}
  
  public class accionPersia implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("El Principe De Persia");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Persia.I.png")));
			lbSinopsis.setText("Genero: Aventuras, Fantasia.\nClasificacion: Buena\nSinopsis:\nPersia medieval. Un pr�ncipe persa se al�a con la\nprincesa de un reino vecino para proteger el secreto\nde las Arenas del Tiempo y capturar al asesino\ndel rey de Persia, el cual pretende retroceder en\nel tiempo para cambiar una serie de acontecimientos.\nAdaptaci�n al cine de los videojuegos del mismo nombre.");}}
  
  public class accionPirata implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Piratas Del Caribe: El Fin Del Mundo");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Piratas.I.png")));
			lbSinopsis.setText("Genero: Aventura, Accion, Fantasia, Comedia.\nClasificacion: Buena\nSinopsis:\nSiguiendo la estela de lo sucedido en\n�Piratas del Caribe: el cofre del hombre muerto�,\nnuestros h�roes, Will Turner y Elizabeth Swann,\nse han aliado con el capit�n Barbossa para buscar y liberar\nal capit�n Jack Sparrow del poder de Davy Jones.\nMientras el Holand�s Errante y la Compa��a de las\nIndias Orientales causan estragos a lo largo\nde los Siete Mares, Will y Elizabeth navegan hacia Singapur,\ndonde deben enfrentarse al astuto pirata chino\nSao Feng. Ahora, en los mism�simos confines de la tierra,\ntodos ellos deben elegir un bando en la batalla final, ya que\nno s�lo sus vidas y fortunas, sino tambi�n el futuro de\n la pirater�a cl�sica, pende de un hilo.");}}
  
  public class accionPitufos implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Los Pitufos La Pelicula");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Pitufos.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nGargamel descubre la aldea m�gica de los Pitufos y\nprovoca con sus malas artes que la abandonen y se\ndispersen por el bosque. Por desgracia,\nTont�n se equivoca de camino y, junto con otros pitufos,\nentrar� en una ruta prohibida. La luna azul\ny un portal m�gico los transportar�n a Central Park,\nen Nueva York. Sin embargo, Gargamel sigue\npersigui�ndolos, por lo que los Pitufos buscar�n refugio\nen casa de un matrimonio.");}}
  
  public class accionQ1 implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("�Que Paso Ayer?");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("QuePasoAnoche.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nEs la historia de una desmadrada despedida de\nsoltero en la que el futuro novio y sus tres amigos,\ndos d�as antes de la boda, se montan la juerga\npadre en Las Vegas. Doug viaja a la ciudad del juego\ncon sus mejores amigos Phil y Stu, as� como\nsu futuro cu�ado Alan. La juerga es de campeonato y,\ncomo era de esperar, a la ma�ana siguiente tienen una\nresaca monumental. El problema es que, siendo incapaces\nde recordar nada de lo ocurrido durante la noche anterior,\nse encuentran con que el prometido ha desaparecido,\ntop�ndose en su lugar con otras dos sorpresas en\nla suite del hotel:un tigre y un beb�.");}}
  
  public class accionQ2 implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("�Que Paso Ayer? 2");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("QuePasoAnoche2.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nAlan, Stu y Phil vuelven a\ndespertarse en otra habitaci�n de otro hotel, y para no\nperder la costumbre en esta ocasi�n tampoco recuerdan\nnada.Esta vez s�lo saben que est�n en Tailandia, adonde\nhan viajado, junto a Doug, para asistir a la boda de Stu. ");}}
  
  public class accionRegalo implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("El Regalo Prometido");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Regalo.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nHoward Langston es un atareado hombre de\nnegocios que llega tarde a la clase de karate de su hijo\nJamie. Para que le perdone le promete que le regalar�\nlo que le pida por navidad: Jamie le pide un\nmu�eco Turboman. El problema es que el juguete\nes el m�s popular y est� agotado en todas las\njugueter�as. Con s�lo unas pocas horas para Navidad,\nHowie inicia una c�mica odisea por toda la ciudad a la\ncaza y captura del preciado objeto.");}}
  
  public class accionSigueme implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Una Esposa De Mentiras");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("SiguemeRollo.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nDanny Maccabee es un cirujano pl�stico que\nsiempre finge estar casado para no comprometerse con\nninguna mujer. Pero un d�a conoce a la despampanante\nPalmer, una joven con la que quiere algo m�s serio. El\nproblema es que cuando Palmer descubre su anillo de\ncasado piensa que lo est�, as� que Danny decide contratar\na su ayudante Katherin, una madre soltera con hijos,\npara que finjan ser su familia. Su intenci�n\nes demostrarle a Palmer que su amor por ella es tan\ngrande que est� a punto de divorciarse de su mujer.");}}
  
  public class accionsimpson implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Los Simpson La Pelicula");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Simpson.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nHomero debe salvar al mundo de una cat�strofe que �l\nmismo ha provocado. Todo comienza con Homero, su nueva\nmascota, un cerdo, y un silo lleno de excrementos\nque tiene una fuga, una combinaci�n que desencadena un\ndesastre distinto a todo lo que Springfield haya\nexperimentado jam�s. Mientras Marge est� indignada por la\nmonumental metedura de pata de su pat�n marido, una\nturba vengativa cae sobre el hogar de los Simpson.");}}
  
  public class accionSpiderman implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Spiderman 3");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Spiderman.I.png")));
			lbSinopsis.setText("Genero: Accion.\nClasificacion: Buena\nSinopsis:\nTercera entrega de las aventuras del joven Peter Parke.\nParece que Parker ha conseguido por fin el equilibrio\nentre su devoci�n por Mary Jane y sus deberes\ncomo superh�roe. Pero, de repente, su traje se vuelve\nnegro y adquiere nuevos poderes; tambi�n �l se transforma,\nmostrando el lado m�s oscuro y vengativo de su personalidad.\nBajo la influencia del nuevo traje, Peter se convierte\nen un ser ego�sta que s�lo se preocupa por s� mismo.\nTiene, pues, que afrontar un dilema: disfrutar de sus nuevos\npoderes o seguir siendo un h�roe compasivo. Mientras\ntanto, sobre �l se cierne la amenaza de dos temibles\nenemigos: Venom y el Hombre de Arena.");}}
  
  public class accionTed implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Ted");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ted.I.png")));
			lbSinopsis.setText("Genero: Comedia.\nClasificacion: Buena\nSinopsis:\nCuando John Bennett era peque�o, deseaba que\nsu osito de peluche Ted fuera un oso de verdad\ny, por desgracia, su sue�o se hizo realidad. M�s de\nveinte a�os despu�s, Ted sigue con John y\nsaca de quicio a su novia Lori, que empieza a\nperder la paciencia. Para colmo, a John no parece\npreocuparle su futuro profesional y se\npasa la vida fumando porros con Ted. A\npesar de ello, John intenta alcanzar\nla madurez, pero parece que para conseguirlo le\nresulta indispensable la ayuda de Ted.");}}
  
  public class accionTitans implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Furia De Titanes");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Titans.I.png")));
			lbSinopsis.setText("Genero: Accion,ventura.\nClasificacion: Buena\nSinopsis:\nAdaptaci�n libre del mito de Perseo, hijo de Zeus,\nel padre de los dioses griegos. Perseo y su madre D�nae,\nson encerrados en un cofre por Acrisio, su abuelo,\ny arrojados al mar. Arrastrados por la corriente,\nllegan a la isla de S�rifos, donde Perseo alcanza la madurez.\nCuando sepa cu�l es la misi�n que le ha sido encomendada\npor el Destino, emprender� un dur�smo viaje, en el\nque tendr� que ir superando diversas pruebas. Remake del\ncl�sico de Desmond Davis de 1981");}}
  
  public class accionToToro implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Totoro");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Totoro.I.png")));
			lbSinopsis.setText("Genero: Animacion.\nClasificacion: Buena\nSinopsis:\nEn los a�os 50, una familia japonesa se traslada\nal campo. Las dos hijas, Satsuki y Mei, entablan\namistad con Totoro, un esp�ritu del bosque. El padre es\nun profesor universitario que estimula la imaginaci�n\nde sus hijas relat�ndoles f�bulas e historias\nm�gicas sobre duendes, fantasmas y esp�ritus protectores\nde los hogares, mientras lamadre se encuentra\nenferma en el hospital.");}}
  
  public class accionTrans implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Transformer");
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Trnsformer.I.png")));
			lbSinopsis.setText("Genero: Accion, Ciencia Ficcion.\nClasificacion: Buena\nSinopsis:\nDos razas de robots extraterrestres transformables\n(los villanos 'decepticons' y los amistosos 'autobots') llegan\na la Tierra en busca de una misteriosa fuente de poder.\nEn la guerra que estalla entre las dos razas, los hombres\ntoman partido por los 'autobots'. Sam Witwicky, un avispado\nadolescente, que s�lo desea conquistar a la bella Mikaela,\nse convierte en la clave de una guerra que\npuede destruir a la humanidad. ");}}
  
  public class accionUp implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Up Una Avnetura De Altura");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Up.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nCarl Fredricksen es un viudo vendedor de globos de 78 a�os\nque, finalmente, consigue llevar a cabo el sue�o de su vida:\nenganchar miles de globos a su casa y salir volando rumbo\na Am�rica del Sur. Pero ya estando en el aire y sin\nposibilidad de retornar Carl descubre que viaja\nacompa�ado de Russell, un explorador que tiene ocho a�os\ny un optimismo a prueba de bomba");}}
  
  public class accionValiente implements ActionListener {

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			lbTitulo.setText("Valiente");
			
			lbValor.setText("Valor:  $2000");
			imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Valiente.I.png")));
			lbSinopsis.setText("Genero: Animacion, Comedia.\nClasificacion: Buena\nSinopsis:\nMerida, la ind�mita hija del Rey Fergus y de\nla Reina Elinor, es una h�bil arquera que decide\nromper con una antigua costumbre, que es sagrada\npara los se�ores de la tierra: el gigantesco\nLord MacGuffin, el malhumorado Lord Macintosh y el\ncascarrabias Lord Dingwall. Las acciones de Merida\ndesencadenanel caos y la furia en el reino. Adem�s, pide\nayuda a una sabia anciana que le concede un deseo muy\ndesafortunado. La muchacha tendr� que afrontar grandes\npeligros antes de aprender qu� es la aut�ntica valent�a.");}}}
