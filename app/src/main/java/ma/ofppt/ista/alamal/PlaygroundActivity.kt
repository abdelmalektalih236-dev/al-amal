package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

//        val img= findViewById<ImageView>(R.id.imgLogo)
//        val txt= findViewById<TextView>(R.id.txtInfo)
//
//        img.setOnClickListener {
//            txt.text ="8 postes,Imprimante et scanner"
//        }

//        val img= findViewById<ImageView>(R.id.imgLogo)
//        val txt= findViewById<TextView>(R.id.txtInfo)
//
//        img.setOnClickListener {
//            txt.text ="8 postes,Imprimante et scanner"
//        }


        //    var numcom=1
//    var prix=0
//    fun commanderCafe(v: View) {
//
//            numcom++
//            prix+=5
//            val txtCommande = findViewById<TextView>(R.id.txtCommande)
//            txtCommande.text = "Cafe Commander n°$numcom ($prix DH)"
//
//    }


//        val btnImprimer = findViewById<Button>(R.id.btnImprimer)
//        val txtPages = findViewById<TextView>(R.id.txtPages)
//        var prix =0
//        var numpage=0
//        btnImprimer.setOnClickListener {
//            prix+=2
//            numpage++
//            txtPages.text = "$numpage pages(s): $prix DH"
//        }
//        var numclient=0
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            numclient++
//            txtClients.text=" clients present :$numclient"
//    }
//        val btnEntrer = findViewById<Button>(R.id.btnEntrer)
//        val txtSalut = findViewById<TextView>(R.id.txtSalut)
//        val edtPrenom = findViewById<TextView>(R.id.edtPrenom)
//        btnEntrer.setOnClickListener {
//            if (edtPrenom.text.toString().isNotEmpty())  {
//                txtSalut.text="Bienvenue ${edtPrenom.text}"
//
//
//            }else{
//                edtPrenom.error="Entrer votre prenom"
//            }
//
//
//        }
//        val fabNouveau = findViewById<View>(R.id.fabNouveau)
//        fabNouveau.setOnClickListener {
//
//            txtSalut.text=""
//            edtPrenom.text=null
//            edtPrenom.error=null
//        }
//        val imp = findViewById<CheckBox>(R.id.chkImpression)
//        val cas = findViewById<CheckBox>(R.id.chkCasque)
//        val scan = findViewById<CheckBox>(R.id.chkScanner)
//        val btn = findViewById<Button>(R.id.btnTotal)
//        val txtTotale = findViewById<TextView>(R.id.txtTotal)
//
//        btn.setOnClickListener {
//            var prix = 0
//            var option = 0
//        if (imp.isChecked) {
//            prix+=2
//            option++
//        }
//        if (cas.isChecked) {
//            prix +=2
//            option++
//        }
//        if (scan.isChecked) {
//            prix +=2
//            option++
//        }
//            txtTotale.text = "$option option(s) : $prix DH"
//        }
//        val tglClim = findViewById<ToggleButton>(R.id.tglClim)
//        val swSilence = findViewById<MaterialSwitch>(R.id.swSilence)
//        val txtEtat = findViewById<TextView>(R.id.txtEtat)
//
//        tglClim.setOnCheckedChangeListener { _, estActif ->
//            if (estActif) {
//                txtEtat.text = "Climatisation On"
//            } else {
//                txtEtat.text = "Climatisation Off"
//            }
//        }
//
//        swSilence.setOnCheckedChangeListener { _, estActif ->
//            if (estActif) {
//                txtEtat.text = "Mode silencieux : On"
//            } else {
//                txtEtat.text = "Mode silencieux Off"
//            }
//        }
        val sp01 = findViewById<Spinner>(R.id.spPosteCode)
        val txtPos = findViewById<TextView>(R.id.txtPoste)

        sp01.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val tempText = parent?.getItemAtPosition(position).toString()
                txtPos.text = "vous avez choisi :$tempText"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
//        //00 acceder au element par id
//        val sp02 = findViewById<Spinner>(R.id.spPosteCode)
//        val txtPost2 = findViewById<TextView>(R.id.txtPosteCode)
//        //01 liste des choix
//        val postes = mutableListOf("Poste1", "Poste2", "Poste3")
//        val lstPosteFromRessources = resources.getStringArray(R.array.s02_postes).toList()
//        //02 declarer un adapteur ey adapter la liste
//        val adapteur1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, postes)
//        val adapteur2 = ArrayAdapter(
//            this,
//            android.R.layout.simple_spinner_dropdown_item,
//            lstPosteFromRessources
//        )
//        //03 utiliser l'adapteur dans le spinner
//        sp02.adapter = adapteur1
//        //04 on click listener dans la button vider la liste
//
//        //05 on click listener dans le spinner
//        sp02.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txtPost2.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                txtPost2.text = "aucun poste selectionne"
//            }
//        }
//        val btnVider = findViewById<Button>(R.id.btnVider)
//        btnVider.setOnClickListener {
//            adapteur1.clear()
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.s02_menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val t = findViewById<TextView>(R.id.txtMenu)
        when (item.itemId) {
            R.id.menu_tarifs -> t.text = "Vvoilaa les tarifs !!!"
            R.id.menu_aide -> t.text = "appelez 098764565 aide"
            R.id.menu_apropos -> t.text = "nous somme cybercafe"

        }
        return true
    }
}
