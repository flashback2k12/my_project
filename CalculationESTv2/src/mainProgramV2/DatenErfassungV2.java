package mainProgramV2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DatenErfassungV2 {

	private JFrame frame;
	private JTextField txt_vorname;
	private JTextField txt_nachname;
	private JTextField txt_strasse;
	private JTextField txt_plz;
	private JTextField txt_ort;
	private JLabel label;
	private JLabel lblBruttolohnMonat;
	private JTextField txt_lohn;
	private JLabel lblArbeitsmonate;
	private JTextField txt_kv;
	private JLabel lblKvMonat;
	private JTextField txt_pv;
	private JLabel lblPvMonat;
	private JLabel lblRvMonat;
	private JLabel lblAvMonat;
	private JTextField txt_rv;
	private JTextField txt_av;
	private JTextField txt_lst;
	private JLabel label_1;
	private JLabel lblArbeitssttte;
	private JLabel lblKmeinfacheStrecke;
	private JTextField txt_arbOrt;
	private JTextField txt_kmArb;
	private JLabel lblArbeitstage;
	private JTextField txt_arbTage;
	private JLabel lblKrankheitskosten;
	private JTextField txt_krankheit;
	private JLabel lblSpenden;
	private JTextField txt_spendenGezahlt;
	private JLabel lblLohnsteuerMonat;
	private JLabel lblSolizMonat;
	private JTextField txt_solz;
	private JTextField txt_monate;
	private JLabel lblBruttojahreslohn;
	private JTextField txt_jahreslohn;
	private JButton btnBerechneJahresKennzahlen;
	private JButton btnBerechneNettoMonatslohn;
	private JButton btnBerechneWerbungsKosten;
	private JLabel lblJahr;
	private JTextField txt_jahr;
	private JLabel lblLohnsteuergesamt;
	private JTextField txt_lstJahr;
	private JLabel lblSolizgesamt;
	private JTextField txt_solzJahr;
	private JLabel lblKvgesamt;
	private JLabel lblPvgesamt;
	private JLabel lblRvgesamt;
	private JLabel lblAvgesamt;
	private JTextField txt_kvJahr;
	private JTextField txt_pvJahr;
	private JTextField txt_rvJahr;
	private JTextField txt_avJahr;
	private JTextField txt_werbungsKosten;
	private JTextField txt_nettoLohnMonat;
	private JTextField txt_berechneteEST;
	private JTextField txt_ergebnisEST;
	private JTextField txt_provision;
	private JButton btnBerechneEST;
	private JButton btnBerechneErgebnis;
	private JButton btnBerechneProv;
	private JButton btnCreateTextFile;
	//protected String gesEinkunft;
	//protected String vorsorgeAufwand;
	//protected String spenden;
	//protected String agB;
	//protected String zuVerstEinkommen;
	private JLabel lblWorkaround;
	private JLabel lblVorsorgeaufwendungen;
	private JTextField txt_sumEin;
	private JLabel lblAuergewhnlicheBelaszungen;
	private JTextField txt_vorsorge;
	private JTextField txt_agb;
	private JTextField txt_zvE;
	private JLabel lblSummeEinknfte;
	private JLabel lblZuVersteuerndesEinkommen;
	private JTextField txt_spenden;
	private JLabel lblWerbungskosten_1;
	private JTextField txt_wkPrüfung;
	private JTextField txt_CreateFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatenErfassungV2 window = new DatenErfassungV2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DatenErfassungV2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/*
		final String JAHR = txt_jahr.getText();
		final String VORNAME = txt_vorname.getText(); 
		final String NACHNAME = txt_nachname.getText();
		final String STRASSE = txt_strasse.getText();
		final String PLZ = txt_plz.getText();
		final String WOHNORT = txt_ort.getText();
		*/
				
		frame = new JFrame();
		frame.setBounds(100, 100, 970, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBerechnungDerEinkommensteuerbelastung = new JLabel("Berechnung der Einkommensteuerbelastung ");
		lblBerechnungDerEinkommensteuerbelastung.setHorizontalAlignment(SwingConstants.LEFT);
		lblBerechnungDerEinkommensteuerbelastung.setVerticalAlignment(SwingConstants.TOP);
		lblBerechnungDerEinkommensteuerbelastung.setFont(new Font("OCR A Extended", Font.PLAIN, 23));
		lblBerechnungDerEinkommensteuerbelastung.setBounds(21, 11, 560, 33);
		frame.getContentPane().add(lblBerechnungDerEinkommensteuerbelastung);
		
		JLabel lblName = new JLabel("Vorname:");
		lblName.setBounds(21, 63, 72, 14);
		frame.getContentPane().add(lblName);
		
		txt_vorname = new JTextField();
		txt_vorname.setBounds(167, 60, 123, 20);
		frame.getContentPane().add(txt_vorname);
		txt_vorname.setColumns(10);
		
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(21, 88, 72, 14);
		frame.getContentPane().add(lblNachname);
		
		txt_nachname = new JTextField();
		txt_nachname.setBounds(167, 85, 123, 20);
		frame.getContentPane().add(txt_nachname);
		txt_nachname.setColumns(10);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe:");
		lblStrae.setBounds(21, 113, 46, 14);
		frame.getContentPane().add(lblStrae);
		
		txt_strasse = new JTextField();
		txt_strasse.setBounds(167, 110, 123, 20);
		frame.getContentPane().add(txt_strasse);
		txt_strasse.setColumns(10);
		
		txt_plz = new JTextField();
		txt_plz.setBounds(167, 136, 123, 20);
		frame.getContentPane().add(txt_plz);
		txt_plz.setColumns(10);
		
		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(21, 139, 46, 14);
		frame.getContentPane().add(lblPlz);
		
		JLabel lblWohnort = new JLabel("Wohnort:");
		lblWohnort.setBounds(21, 164, 72, 14);
		frame.getContentPane().add(lblWohnort);
		
		txt_ort = new JTextField();
		txt_ort.setBounds(167, 161, 123, 20);
		frame.getContentPane().add(txt_ort);
		txt_ort.setColumns(10);
		
		label = new JLabel("------------------------------------------------------------------");
		label.setBounds(22, 189, 268, 14);
		frame.getContentPane().add(label);
		
		lblBruttolohnMonat = new JLabel("Bruttolohn / Monat:");
		lblBruttolohnMonat.setBounds(21, 220, 107, 14);
		frame.getContentPane().add(lblBruttolohnMonat);
		
		txt_lohn = new JTextField();
		txt_lohn.setBounds(168, 217, 122, 20);
		frame.getContentPane().add(txt_lohn);
		txt_lohn.setColumns(10);
		
		lblArbeitsmonate = new JLabel("Arbeitsmonate:");
		lblArbeitsmonate.setBounds(21, 389, 107, 14);
		frame.getContentPane().add(lblArbeitsmonate);
		
		txt_kv = new JTextField();
		txt_kv.setBounds(167, 242, 123, 20);
		frame.getContentPane().add(txt_kv);
		txt_kv.setColumns(10);
		
		lblKvMonat = new JLabel("KV / Monat:");
		lblKvMonat.setBounds(21, 245, 107, 14);
		frame.getContentPane().add(lblKvMonat);
		
		txt_pv = new JTextField();
		txt_pv.setBounds(167, 267, 123, 20);
		frame.getContentPane().add(txt_pv);
		txt_pv.setColumns(10);
		
		lblPvMonat = new JLabel("PV / Monat:");
		lblPvMonat.setBounds(21, 270, 107, 14);
		frame.getContentPane().add(lblPvMonat);
		
		lblRvMonat = new JLabel("RV / Monat:");
		lblRvMonat.setBounds(21, 295, 107, 14);
		frame.getContentPane().add(lblRvMonat);
		
		lblAvMonat = new JLabel("AV / Monat:");
		lblAvMonat.setBounds(21, 319, 107, 14);
		frame.getContentPane().add(lblAvMonat);
		
		txt_rv = new JTextField();
		txt_rv.setBounds(167, 292, 123, 20);
		frame.getContentPane().add(txt_rv);
		txt_rv.setColumns(10);
		
		txt_av = new JTextField();
		txt_av.setBounds(167, 316, 123, 20);
		frame.getContentPane().add(txt_av);
		txt_av.setColumns(10);
		
		txt_lst = new JTextField();
		txt_lst.setBounds(167, 339, 123, 20);
		frame.getContentPane().add(txt_lst);
		txt_lst.setColumns(10);
		
		label_1 = new JLabel("------------------------------------------------------------------");
		label_1.setBounds(21, 414, 268, 14);
		frame.getContentPane().add(label_1);
		
		lblArbeitssttte = new JLabel("Arbeitsst\u00E4tte:");
		lblArbeitssttte.setBounds(21, 439, 107, 14);
		frame.getContentPane().add(lblArbeitssttte);
		
		lblKmeinfacheStrecke = new JLabel("KM (einfache Strecke):");
		lblKmeinfacheStrecke.setBounds(21, 464, 114, 14);
		frame.getContentPane().add(lblKmeinfacheStrecke);
		
		txt_arbOrt = new JTextField();
		txt_arbOrt.setBounds(167, 433, 123, 20);
		frame.getContentPane().add(txt_arbOrt);
		txt_arbOrt.setColumns(10);
		
		txt_kmArb = new JTextField();
		txt_kmArb.setBounds(167, 458, 123, 20);
		frame.getContentPane().add(txt_kmArb);
		txt_kmArb.setColumns(10);
		
		lblArbeitstage = new JLabel("Arbeitstage:");
		lblArbeitstage.setBounds(21, 489, 114, 14);
		frame.getContentPane().add(lblArbeitstage);
		
		txt_arbTage = new JTextField();
		txt_arbTage.setBounds(167, 483, 123, 20);
		frame.getContentPane().add(txt_arbTage);
		txt_arbTage.setColumns(10);
		
		lblKrankheitskosten = new JLabel("Krankheitskosten:");
		lblKrankheitskosten.setBounds(21, 514, 95, 14);
		frame.getContentPane().add(lblKrankheitskosten);
		
		txt_krankheit = new JTextField();
		txt_krankheit.setBounds(167, 508, 123, 20);
		frame.getContentPane().add(txt_krankheit);
		txt_krankheit.setColumns(10);
		
		lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(21, 536, 95, 14);
		frame.getContentPane().add(lblSpenden);
		
		txt_spendenGezahlt = new JTextField();
		txt_spendenGezahlt.setBounds(167, 533, 123, 20);
		frame.getContentPane().add(txt_spendenGezahlt);
		txt_spendenGezahlt.setColumns(10);
		
		lblLohnsteuerMonat = new JLabel("Lohnsteuer / Monat:");
		lblLohnsteuerMonat.setBounds(21, 342, 107, 14);
		frame.getContentPane().add(lblLohnsteuerMonat);
		
		lblSolizMonat = new JLabel("SoliZ / Monat:");
		lblSolizMonat.setBounds(21, 364, 107, 14);
		frame.getContentPane().add(lblSolizMonat);
		
		txt_solz = new JTextField();
		txt_solz.setBounds(167, 361, 123, 20);
		frame.getContentPane().add(txt_solz);
		txt_solz.setColumns(10);
		
		txt_monate = new JTextField();
		txt_monate.setBounds(167, 386, 123, 20);
		frame.getContentPane().add(txt_monate);
		txt_monate.setColumns(10);
		
		lblBruttojahreslohn = new JLabel("Bruttojahreslohn:");
		lblBruttojahreslohn.setBounds(352, 63, 141, 14);
		frame.getContentPane().add(lblBruttojahreslohn);
		
		txt_jahreslohn = new JTextField();
		txt_jahreslohn.setBounds(519, 60, 164, 20);
		frame.getContentPane().add(txt_jahreslohn);
		txt_jahreslohn.setColumns(10);
		
		btnBerechneJahresKennzahlen = new JButton("Berechne Jahreswerte");
		btnBerechneJahresKennzahlen.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneJahresKennzahlen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Initialiserung Variablen
				 */
				
				int arbeitsMonate = 0;
				
				double bruttoMonatsLohn = 0;
				double bruttoJahresLohn = 0;
				double lohnSteuerMonat = 0;
				double lohnSteuerJahr = 0;
				double solzMonat = 0;
				double solzJahr = 0;
				double kvMonat = 0;
				double kvJahr = 0;
				double pvMonat = 0;
				double pvJahr = 0;
				double rvMonat = 0;
				double rvJahr = 0;
				double avMonat = 0;
				double avJahr = 0;
				
				/*
				 * Berechne JahresbruttoLohn
				 */
				
				try {
					bruttoMonatsLohn = Double.parseDouble(txt_lohn.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "BruttoLohn ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					arbeitsMonate = Integer.parseInt(txt_monate.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Arbeitsmonate ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				bruttoJahresLohn = Math.round((bruttoMonatsLohn * arbeitsMonate)*100)/100.00;
				
				txt_jahreslohn.setText("" + '\t' + bruttoJahresLohn); 
				
				/*
				 * Berechne Jahreslohnsteuer
				 */
				
				try {
					lohnSteuerMonat = Double.parseDouble(txt_lst.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "LohnSteuerMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				lohnSteuerJahr = Math.round((lohnSteuerMonat * arbeitsMonate)*100)/100.00;
				
				txt_lstJahr.setText("" + '\t' + lohnSteuerJahr);
				
				/*
				 * Berechne JahresSolZ
				 */
				
				try {
					solzMonat = Double.parseDouble(txt_solz.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "SolzMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				solzJahr = Math.round((solzMonat * arbeitsMonate)*100)/100.00;
				
				txt_solzJahr.setText("" + '\t' + solzJahr);
				
				/*
				 * Berechne JahresKrankenversicherung
				 */
				
				try {
					kvMonat = Double.parseDouble(txt_kv.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "kvMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				kvJahr = Math.round((kvMonat * arbeitsMonate)*100)/100.00;
				
				txt_kvJahr.setText("" + '\t' + kvJahr);
				
				/*
				 * Berechne JahresPflegeversicherung
				 */
				
				try {
					pvMonat = Double.parseDouble(txt_pv.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "pvMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				pvJahr = Math.round((pvMonat * arbeitsMonate)*100)/100.00;
				
				txt_pvJahr.setText("" + '\t' + pvJahr);
				
				/*
				 * Berechne JahresRentenversicherung
				 */
				
				try {
					rvMonat = Double.parseDouble(txt_rv.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "rvMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				rvJahr = Math.round((rvMonat * arbeitsMonate)*100)/100.00;
				
				txt_rvJahr.setText("" + '\t' + rvJahr);
				
				/*
				 * Berechne JahresArbeitslosenversicherung
				 */
				
				try {
					avMonat = Double.parseDouble(txt_av.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "avMonat ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				avJahr = Math.round((avMonat * arbeitsMonate)*100)/100.00;
				
				txt_avJahr.setText("" + '\t' + avJahr);
				
			}
		
		});
		btnBerechneJahresKennzahlen.setBounds(519, 245, 141, 19);
		frame.getContentPane().add(btnBerechneJahresKennzahlen);
		
		btnBerechneNettoMonatslohn = new JButton("Berechne Nettolohn");
		btnBerechneNettoMonatslohn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Berechne NettoMonatsLohn
				 */
								
				double monatsLohn = 0;
				double lohnSteuer = 0;
				double solz = 0;
				double kv = 0;
				double pv = 0;
				double rv = 0;
				double av = 0;
				double nettoMonatsLohn = 0;
				
				monatsLohn = Double.parseDouble(txt_lohn.getText());
				lohnSteuer = Double.parseDouble(txt_lst.getText());
				solz = Double.parseDouble(txt_solz.getText());
				kv = Double.parseDouble(txt_kv.getText());
				pv = Double.parseDouble(txt_pv.getText());
				rv = Double.parseDouble(txt_rv.getText());
				av = Double.parseDouble(txt_av.getText());
				
				nettoMonatsLohn = monatsLohn - lohnSteuer - solz - kv - pv - rv - av; 
				
				txt_nettoLohnMonat.setText("" + '\t' + nettoMonatsLohn);
				
			}
		});
		btnBerechneNettoMonatslohn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneNettoMonatslohn.setBounds(639, 617, 141, 19);
		frame.getContentPane().add(btnBerechneNettoMonatslohn);
		
		btnBerechneWerbungsKosten = new JButton("Berechne Werbungskosten");
		btnBerechneWerbungsKosten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int KONTO = 16;
				int TELEFON = 240;
				int ARBEITSMITTEL = 110;
				double KMPREIS = 0.3;
				int arbTage = 0;
				double arbKM = 0;
				double werbungsKosten = 0;
				
				/*
				 * Berechne Werbungskosten
				 */
				
				try {
					arbKM = Double.parseDouble(txt_kmArb.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "kmArb ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					arbTage = Integer.parseInt(txt_arbTage.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "arbTage ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
					
				werbungsKosten = Math.round(((arbKM*arbTage*KMPREIS)+ARBEITSMITTEL+KONTO+TELEFON)*100)/100.00;
				
				txt_wkPrüfung.setText("" + '\t' + werbungsKosten); 
				
				/*
				 * Vergleiche WK mit Pauschale
				 */
				
				if (werbungsKosten >= 1000)
				{
					txt_werbungsKosten.setText("" + '\t' + werbungsKosten);
				} 
				else
				{
					txt_werbungsKosten.setText("" + '\t' + 1000);
				}
								
			}
		});
		btnBerechneWerbungsKosten.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneWerbungsKosten.setBounds(742, 326, 141, 19);
		frame.getContentPane().add(btnBerechneWerbungsKosten);
		
		lblJahr = new JLabel("Jahr:");
		lblJahr.setBounds(579, 20, 46, 14);
		frame.getContentPane().add(lblJahr);
		
		txt_jahr = new JTextField();
		txt_jahr.setBounds(615, 17, 86, 20);
		frame.getContentPane().add(txt_jahr);
		txt_jahr.setColumns(10);
		
		lblLohnsteuergesamt = new JLabel("Lohnsteuer (Gesamt):");
		lblLohnsteuergesamt.setBounds(352, 88, 141, 14);
		frame.getContentPane().add(lblLohnsteuergesamt);
		
		txt_lstJahr = new JTextField();
		txt_lstJahr.setBounds(519, 85, 164, 20);
		frame.getContentPane().add(txt_lstJahr);
		txt_lstJahr.setColumns(10);
		
		lblSolizgesamt = new JLabel("SoliZ (Gesamt):");
		lblSolizgesamt.setBounds(352, 113, 141, 14);
		frame.getContentPane().add(lblSolizgesamt);
		
		txt_solzJahr = new JTextField();
		txt_solzJahr.setBounds(519, 110, 164, 20);
		frame.getContentPane().add(txt_solzJahr);
		txt_solzJahr.setColumns(10);
		
		lblKvgesamt = new JLabel("KV (Gesamt):");
		lblKvgesamt.setBounds(352, 139, 141, 14);
		frame.getContentPane().add(lblKvgesamt);
		
		lblPvgesamt = new JLabel("PV (Gesamt):");
		lblPvgesamt.setBounds(352, 164, 141, 14);
		frame.getContentPane().add(lblPvgesamt);
		
		lblRvgesamt = new JLabel("RV (Gesamt): ");
		lblRvgesamt.setBounds(352, 189, 141, 14);
		frame.getContentPane().add(lblRvgesamt);
		
		lblAvgesamt = new JLabel("AV (Gesamt):");
		lblAvgesamt.setBounds(352, 214, 141, 14);
		frame.getContentPane().add(lblAvgesamt);
		
		txt_kvJahr = new JTextField();
		txt_kvJahr.setBounds(519, 136, 164, 20);
		frame.getContentPane().add(txt_kvJahr);
		txt_kvJahr.setColumns(10);
		
		txt_pvJahr = new JTextField();
		txt_pvJahr.setBounds(519, 161, 164, 20);
		frame.getContentPane().add(txt_pvJahr);
		txt_pvJahr.setColumns(10);
		
		txt_rvJahr = new JTextField();
		txt_rvJahr.setBounds(519, 186, 164, 20);
		frame.getContentPane().add(txt_rvJahr);
		txt_rvJahr.setColumns(10);
		
		txt_avJahr = new JTextField();
		txt_avJahr.setBounds(519, 211, 164, 20);
		frame.getContentPane().add(txt_avJahr);
		txt_avJahr.setColumns(10);
		
		JLabel lblNettolohnMonat = new JLabel("Nettolohn / Monat:");
		lblNettolohnMonat.setBounds(340, 619, 141, 14);
		frame.getContentPane().add(lblNettolohnMonat);
		
		JLabel lblWerbungskosten = new JLabel("Werbungskosten:");
		lblWerbungskosten.setBounds(352, 328, 141, 14);
		frame.getContentPane().add(lblWerbungskosten);
		
		txt_werbungsKosten = new JTextField();
		txt_werbungsKosten.setBounds(539, 326, 164, 20);
		frame.getContentPane().add(txt_werbungsKosten);
		txt_werbungsKosten.setColumns(10);
		
		txt_nettoLohnMonat = new JTextField();
		txt_nettoLohnMonat.setBounds(456, 616, 164, 20);
		frame.getContentPane().add(txt_nettoLohnMonat);
		txt_nettoLohnMonat.setColumns(10);
		
		JLabel lblBerechneteEinkommensteuer = new JLabel("berechnete Einkommensteuer:");
		lblBerechneteEinkommensteuer.setBounds(355, 389, 172, 14);
		frame.getContentPane().add(lblBerechneteEinkommensteuer);
		
		txt_berechneteEST = new JTextField();
		txt_berechneteEST.setBounds(539, 386, 184, 20);
		frame.getContentPane().add(txt_berechneteEST);
		txt_berechneteEST.setColumns(10);
		
		JLabel lblErstattungNachzahlung = new JLabel("Erstattung / Nachzahlung:");
		lblErstattungNachzahlung.setBounds(352, 439, 162, 14);
		frame.getContentPane().add(lblErstattungNachzahlung);
		
		txt_ergebnisEST = new JTextField();
		txt_ergebnisEST.setBounds(539, 433, 184, 20);
		frame.getContentPane().add(txt_ergebnisEST);
		txt_ergebnisEST.setColumns(10);
		
		txt_provision = new JTextField();
		txt_provision.setBounds(21, 616, 184, 20);
		frame.getContentPane().add(txt_provision);
		txt_provision.setColumns(10);
		
		btnBerechneEST = new JButton("Berechnung ESt.");
		btnBerechneEST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Initialisierung Input
				 */
				double TMP = 0;
				
				double bruttoJahresLohn = 0;
				double werbungsKosten = 0;
				
				int steuerJahr = 0;
				double rvJahresBeitrag = 0;
				double kvJahresBeitrag = 0;
				double pvJahresBeitrag = 0;
				
				double spendenGezahlt = 0; 
				double spenden = 0;
				double krankheitsKosten = 0;
				
				double faktor = 0;
								
				/*
				 * Initialisierung Output
				 */
				
				double sumEinkunft = 0;
				double gesEinkunft = 0;
				
				double vorsorgeAufwand = 0; 
				
				int agB = 0; 
				
				double zuVerstEinkommen = 0;
				
				double einkommenSteuer = 0;
				
				/*
				 * Berechnung Summe / Gesamtbetrag Einkünfte
				 */
				
				try {
					bruttoJahresLohn = Double.parseDouble(txt_jahreslohn.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "jahresLohn ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					werbungsKosten = Double.parseDouble(txt_werbungsKosten.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "werbungsKosten ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				sumEinkunft = Math.round((bruttoJahresLohn - werbungsKosten)*100)/100.00;
				
				/**
				 * ACHTUNG ERFORDERLICHE CODE OPTIMIERUNG --> ALLEINERZIEHENDEN BETRAG; ALTERSBETRAG; L+F FB BERÜCKSICHTIGEN
				 */
				
				gesEinkunft = sumEinkunft;
				
				txt_sumEin.setText("" + '\t' + gesEinkunft); 
				
				/*
				 * Berechnung VorsorgeAufwand 
				 */
				
				try {
					rvJahresBeitrag = Double.parseDouble(txt_rvJahr.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "rvJahr ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					kvJahresBeitrag = Double.parseDouble(txt_kvJahr.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "kvJahr ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				try {
					pvJahresBeitrag = Double.parseDouble(txt_pvJahr.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "pvJahr ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				

				/**
				 * ACHTUNG CODE OPTIMIERUNG ERFORDERLICH
				 * 
				 * 0.74 ist nur für 2012 --> Vergleichabfrage schreiben für den Zeitraum von 2010 - 2015 --> fixed
				 */
				
				try {
				
					steuerJahr = Integer.parseInt(txt_jahr.getText()); 
				
				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "steuerJahr ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				
				switch (steuerJahr) {
				case 2010:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.70 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
									
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;

				case 2011:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.72 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
									
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;
					
				case 2012:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.74 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
								
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;
					
				case 2013:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.76 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
								
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;
					
				case 2014:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.78 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
							
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;
					
				case 2015:
					
					{
					vorsorgeAufwand = ((rvJahresBeitrag + rvJahresBeitrag)*0.80 - rvJahresBeitrag + (kvJahresBeitrag - (kvJahresBeitrag*0.04) + pvJahresBeitrag));
					TMP = vorsorgeAufwand;
					vorsorgeAufwand = Math.round(TMP*100)/100.00;
							
					txt_vorsorge.setText("" + '\t' + vorsorgeAufwand); 
					}
					break;
					
				default:
					break;
				}
						
				
				/*
				 * Berechnumg zumutbare Belastung
				 */
				/**
				 * ACHTUNG ERFORDERLICHE CODE OPTIMIERUNG --> ABGLEICH HÖCHSTBETRÄGE --> fixed
				 */
				
				try {
					krankheitsKosten = Double.parseDouble(txt_krankheit.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "krankheit ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				double zumutbareBelastung = 0;
				
				if ((gesEinkunft == 0) & (gesEinkunft <= 15340))
					{
					zumutbareBelastung = 0.05;
					} 
				else if ((gesEinkunft >= 15340) & (gesEinkunft <= 51130))
					{
					zumutbareBelastung = 0.06;
					}
				else
					{
					zumutbareBelastung = 0.07;
					}
							
				
				agB = (int) (Math.round((krankheitsKosten - (gesEinkunft * zumutbareBelastung))*100)/100.00);
				
				/*
				 * Vergleiche AGB --> Wenn AGB in das Negative geht --> 0 ausgeben
				 */
				
				if (agB <= 0)
					{
					txt_agb.setText("" + '\t' + 0);
					}
				else
					{
					txt_agb.setText("" + '\t' + agB); 
					}
				
				/*
				 * Einlesen des Spendenbetrages
				 */
				
				try {
					spendenGezahlt = Double.parseDouble(txt_spendenGezahlt.getText());
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "spenden ist keine Zahl", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				/*
				 * Vergleich gezahlte Spenden mit Pauschale
				 */
				/**
				 * ACHTUNG ERFORDERLICHE CODE OPTIMIERUNG --> ABGLEICH HÖCHSTBETRÄGE --> fixed
				 */
				
				double maxSpenden = 0;
				maxSpenden = gesEinkunft*20/100;
				
				
				if ((spendenGezahlt >= 36) & (spendenGezahlt <= maxSpenden))
					{
					spenden = spendenGezahlt;
					txt_spenden.setText("" + '\t' + spenden);
					}
				else if ((spendenGezahlt >= 36) & (spendenGezahlt >= maxSpenden))
					{
					spenden = maxSpenden;
					txt_spenden.setText("" + '\t' + spenden);
					}
				else
					{
					spenden = 36;
					txt_spenden.setText("" + '\t' + spenden);
					}
				
				
				/*
				 * Berechnung zu versteuerndes Einkommen
				 */
				
				zuVerstEinkommen = Math.round((gesEinkunft - vorsorgeAufwand - spenden - agB)*100)/100.00; 
				
				txt_zvE.setText("" + '\t' + zuVerstEinkommen);
				
				/*
				 * Berechnung Einkommensteuer (Grundtarif - ohne Schnickschnack)
				 */
				/**
				 * ACHTUNG ERFORDERLICHE CODE OPTIMIERUNG --> VERWEIS AUF §32 EStG
				 * 
				 * VERGLEICH ABFRAGE
				 */
				
				if ((zuVerstEinkommen == 0) & (zuVerstEinkommen <= 8004)) 
					{
					einkommenSteuer = 0.0;
					
					txt_berechneteEST.setText("" + '\t' + einkommenSteuer);
					}
				else if ((zuVerstEinkommen >= 8005) & (zuVerstEinkommen <= 13469))
					{
					faktor = (zuVerstEinkommen - 8004)*0.0001;
					
					einkommenSteuer = Math.round((((912.17 * faktor + 1400) * faktor))*100)/100.00; 
					
					txt_berechneteEST.setText("" + '\t' + einkommenSteuer);
					}
				else if ((zuVerstEinkommen >= 13470) & (zuVerstEinkommen <= 52881))
					{
					faktor = (zuVerstEinkommen - 13469)*0.0001;
					
					einkommenSteuer = Math.round((((228.74 * faktor + 2397) * faktor) + 1038)*100)/100.00; 
					
					txt_berechneteEST.setText("" + '\t' + einkommenSteuer);
					}
				else if ((zuVerstEinkommen >= 52882) & (zuVerstEinkommen <= 250730))
					{
					faktor = (int) zuVerstEinkommen;
					
					einkommenSteuer = Math.round((0.42 * faktor - 8172)*100)/100.00; 
					
					txt_berechneteEST.setText("" + '\t' + einkommenSteuer);
					}
				else
					{
					faktor = (int) zuVerstEinkommen;
					
					einkommenSteuer = Math.round((0.45 * faktor - 15694)*100)/100.00; 
					
					txt_berechneteEST.setText("" + '\t' + einkommenSteuer);
					}
				
			}
		});
		btnBerechneEST.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneEST.setBounds(750, 387, 113, 19);
		frame.getContentPane().add(btnBerechneEST);
		
		btnBerechneErgebnis = new JButton("Berechne Ergebnis");
		btnBerechneErgebnis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Berechnung Erstattungsbetrag bzw. Nachzahlungsbetrag
				 */
				
				double est = 0;
				double lst = 0;
				double ergebnis = 0;
				
				est = Double.parseDouble(txt_berechneteEST.getText());
				lst = Double.parseDouble(txt_lstJahr.getText());
				
				ergebnis = Math.round((est - lst)*100)/100.00;
				
				txt_ergebnisEST.setText("" + '\t' + ergebnis);
							
			}
		});
		btnBerechneErgebnis.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneErgebnis.setBounds(750, 434, 113, 19);
		frame.getContentPane().add(btnBerechneErgebnis);
		
		btnBerechneProv = new JButton("Click Me!");
		btnBerechneProv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Spendenaufforderung :-)
				 */
								
				txt_provision.setText("Support my work, NOW! :-)");
				
			}
		});
		btnBerechneProv.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBerechneProv.setBounds(215, 617, 113, 19);
		frame.getContentPane().add(btnBerechneProv);
		
		btnCreateTextFile = new JButton("Create Text File");
		btnCreateTextFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Generierung Auswertungsblatt 
				 */
				/**
				 * ACHTUNG ERFORDERLICHE CODE OPTIMIERUNG --> ENTFERNUNG Prüfungs - TEXTFIELDS OHNE BEDEUTSAMEN NUTZEN
				 */
				
				String targetFile = txt_CreateFile.getText(); 
				
				
				File target = new File(targetFile);
				//File target = new File("N:/Steuerberechnung/ESt-Berechnung.txt");
				
				String Separator = "\n------------------------------------------------------";
				String Jahr = "\n Steuerjahr: " + '\t' + '\t' + txt_jahr.getText();
				String Name = "\n Vorname: "+ '\t' + '\t' + txt_vorname.getText();
				String Nachname = "\n Nachname: "+ '\t' + '\t' + txt_nachname.getText(); 
				String Straße = "\n Straße: "+ '\t' + '\t' + txt_strasse.getText();
				String PLZ = "\n PLZ: "+ '\t' + '\t' + txt_plz.getText();
				String Wohnort = "\n Wohnort: "+ '\t' + '\t' + txt_ort.getText(); 
				String Arbeit = "\n Arbeitsplatz: "+ '\t' + '\t' + txt_arbOrt.getText(); 
				String BruttoLohnJahr = "\n BruttoJahresLohn: "+ '\t' + '\t' + txt_jahreslohn.getText();
				String WerbungsKosten = "\n ./. Werbungskosten: "+ '\t' + '\t' + txt_werbungsKosten.getText();
				String SummeEinkunft = "\n = Summe der Einkuenfte: "+ '\t' + '\t' + txt_sumEin.getText();
				String Vorsorge = "\n ./. Vorsorgeaufwendungen: "+ '\t' + '\t' + txt_vorsorge.getText();	
				String Spenden = "\n ./. Spenden: "+ '\t' + '\t' + txt_spenden.getText();
				String AGB = "\n ./. aussergewöhnliche Belastungen: "+ '\t' + '\t' + txt_agb.getText(); 
				String ZuVerEinkommen = "\n = zu versteuerndes Einkommen: "+ '\t' + '\t' + txt_zvE.getText(); 
				String EST = "\n = tarifliche Einkommensteuer: "+ '\t' + '\t' + txt_berechneteEST.getText(); 
				String LST = "\n ./. gezahlter Lohnsteuer: "+ '\t' + '\t' + txt_lstJahr.getText();
				String ERGEBNIS = "\n = (+) Nachzahlung / (-) Erstattung: "+ '\t' + '\t' + txt_ergebnisEST.getText();
				
				FileWriter writer = null;
				try {
					
					writer = new FileWriter(target, false);
					writer.write(Separator);
					writer.write(Jahr);
					writer.write(Name);
					writer.write(Nachname);
					writer.write(Straße);
					writer.write(PLZ);
					writer.write(Wohnort);
					writer.write(Arbeit);
					writer.write(Separator);
					writer.write(BruttoLohnJahr); 
					writer.write(WerbungsKosten);
					writer.write(Separator);
					writer.write(SummeEinkunft);
					writer.write(Separator);
					writer.write(Vorsorge);
					writer.write(Spenden);
					writer.write(AGB);
					writer.write(Separator);
					writer.write(ZuVerEinkommen);
					writer.write(Separator);
					writer.write(EST);
					writer.write(LST);
					writer.write(Separator);
					writer.write(ERGEBNIS);
					writer.write(Separator);
					
					
				} catch (IOException ex) {
					
					Logger.getLogger(DatenErfassungV2.class.getName()).log(Level.SEVERE, null, ex);
					
				} finally {
					
					if (writer != null) {
						
						try {
							writer.close();
						} catch (IOException ex) {
							
							Logger.getLogger(DatenErfassungV2.class.getName()).log(Level.SEVERE, null, ex);
						}
					} 
				}
				
				
			}
		});
		btnCreateTextFile.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCreateTextFile.setBounds(21, 647, 131, 19);
		frame.getContentPane().add(btnCreateTextFile);
		
		JLabel lblErstelleEineUnterordner = new JLabel("beschrifte mich: C:/Steuerberechnung/ESt-Berechnung.txt");
		lblErstelleEineUnterordner.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblErstelleEineUnterordner.setBounds(167, 669, 332, 14);
		frame.getContentPane().add(lblErstelleEineUnterordner);
		
		JLabel label_3 = new JLabel("------------------------------------------------------------------");
		label_3.setBounds(21, 591, 268, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("------------------------------------------------------------------");
		label_4.setBounds(321, 591, 268, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("------------------------------------------------------------------");
		label_5.setBounds(615, 591, 268, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("------------------------------------------------------------------");
		label_6.setBounds(321, 464, 268, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("------------------------------------------------------------------");
		label_7.setBounds(617, 464, 268, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("------------------------------------------------------------------");
		label_8.setBounds(321, 414, 268, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("------------------------------------------------------------------");
		label_9.setBounds(617, 414, 268, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("------------------------------------------------------------------");
		label_10.setBounds(321, 361, 268, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("------------------------------------------------------------------");
		label_11.setBounds(615, 361, 268, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("------------------------------------------------------------------");
		label_12.setBounds(321, 291, 268, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("------------------------------------------------------------------");
		label_13.setBounds(615, 292, 268, 14);
		frame.getContentPane().add(label_13);
		
		lblWorkaround = new JLabel("Pr\u00FCfung Rechenschritte:");
		lblWorkaround.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblWorkaround.setBounds(321, 479, 133, 10);
		frame.getContentPane().add(lblWorkaround);
		
		lblVorsorgeaufwendungen = new JLabel("Vorsorgeaufwendungen: ");
		lblVorsorgeaufwendungen.setBounds(386, 518, 141, 14);
		frame.getContentPane().add(lblVorsorgeaufwendungen);
		
		txt_sumEin = new JTextField();
		txt_sumEin.setBounds(579, 486, 144, 20);
		frame.getContentPane().add(txt_sumEin);
		txt_sumEin.setColumns(10);
		
		lblAuergewhnlicheBelaszungen = new JLabel("Au\u00DFergew\u00F6hnliche Belaszungen: ");
		lblAuergewhnlicheBelaszungen.setBounds(386, 545, 195, 14);
		frame.getContentPane().add(lblAuergewhnlicheBelaszungen);
		
		txt_vorsorge = new JTextField();
		txt_vorsorge.setBounds(579, 514, 145, 20);
		frame.getContentPane().add(txt_vorsorge);
		txt_vorsorge.setColumns(10);
		
		txt_agb = new JTextField();
		txt_agb.setBounds(579, 540, 144, 20);
		frame.getContentPane().add(txt_agb);
		txt_agb.setColumns(10);
		
		txt_zvE = new JTextField();
		txt_zvE.setBounds(579, 569, 144, 20);
		frame.getContentPane().add(txt_zvE);
		txt_zvE.setColumns(10);
		
		lblSummeEinknfte = new JLabel("Summe Eink\u00FCnfte:");
		lblSummeEinknfte.setBounds(386, 493, 133, 14);
		frame.getContentPane().add(lblSummeEinknfte);
		
		lblZuVersteuerndesEinkommen = new JLabel("zu versteuerndes Einkommen: ");
		lblZuVersteuerndesEinkommen.setBounds(386, 572, 164, 14);
		frame.getContentPane().add(lblZuVersteuerndesEinkommen);
		
		JLabel lblSpenden_1 = new JLabel("Spenden:");
		lblSpenden_1.setBounds(765, 492, 72, 14);
		frame.getContentPane().add(lblSpenden_1);
		
		txt_spenden = new JTextField();
		txt_spenden.setBounds(765, 511, 144, 20);
		frame.getContentPane().add(txt_spenden);
		txt_spenden.setColumns(10);
		
		lblWerbungskosten_1 = new JLabel("Werbungskosten:");
		lblWerbungskosten_1.setBounds(765, 536, 118, 14);
		frame.getContentPane().add(lblWerbungskosten_1);
		
		txt_wkPrüfung = new JTextField();
		txt_wkPrüfung.setBounds(765, 560, 144, 20);
		frame.getContentPane().add(txt_wkPrüfung);
		txt_wkPrüfung.setColumns(10);
		
		txt_CreateFile = new JTextField();
		txt_CreateFile.setBounds(168, 647, 184, 20);
		frame.getContentPane().add(txt_CreateFile);
		txt_CreateFile.setColumns(10);
	}
}