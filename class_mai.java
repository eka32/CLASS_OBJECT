
public class class_mai {

	public static void main(String[] args) {
kotak kotakHitam = new kotak();
		
		kotakHitam.setpanjang(20);
		kotakHitam.setLebar(10);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungKeliling();
	
		System.out.println("Panjang : " + kotakHitam.getPanjang());
		System.out.println("Lebar : " + kotakHitam.getLebar());
		System.out.println("Luas Kotak : " + kotakHitam.getLuas());
		System.out.println("Keliling Kotak " + kotakHitam.getkeliling());
		System.out.println("----------------------------------------------");
	
		
		{
			
			mahasiswa mhs1 = new mahasiswa();
			mhs1.setNama("Shadwika Madani Putri");
			mhs1.setNim("D0217307");
			mhs1.setAlamat("Sendana");
			mhs1.setGolonganDarah("o");
			mhs1.setStatus("Mahasiswa");
			mhs1.setTinggiBadan(155);
			mhs1.setBeratBadan(50);
			
			System.out.println("Nama : " + mhs1.getNama());
			System.out.println("Nim : " + mhs1.getNim());
			System.out.println("Alamat : " + mhs1.getAlamat());
			System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
			System.out.println("Status : " + mhs1.getStatus());
			System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
			System.out.println("BeratBadan : " + mhs1.getBeratBadan());
			System.out.println("---------------------------------------------");
		}

		
		//membuat objek kelas dari kelas Node
				node Node = new node ();
				
			//method setter Node
				Node.Label = "Izaura";
				Node.value = 1;
				
			// method getter Node
				System.out.println("Nama Label : " + Node.getLabel());
				System.out.println("Jumlah Value : " + Node.getvalue());
				System.out.println("--------------------------------------------");
				
				
				
			//membuat objek dari kelas Stack
				Stack Stack = new Stack();
				
				Stack.value[0] = "Karmila";
				Stack.value[1] = "ina";
				Stack.value[2] = "karamel";
				Stack.value[3] = "Mizhel Zidhuit";
				Stack.value[4] = "georgino";
				Stack.value[5] = "Nina ratuliu";
				Stack.value[6] = "Resky aditia";
				Stack.value[7] = "Natasha wilona";
				Stack.value[8] = "Reni Ramli";
				Stack.value[9] = "M.Rifai";
				Stack.value[10] = "Juliana";
				Stack.value[11] = "Muh.Afif";
				Stack.value[12] = "Sudarmin";
				Stack.value[13] = "Nurmila";
				Stack.value[14] = "Sudarmin";
				Stack.value[15] = "Nurmila";
				Stack.value[16] = "Rezkyanti";
				Stack.value[17] = "Sudarmin";
				Stack.value[18] = "Andika Saputra";
				Stack.value[19] = "Muhammad Anggi setiawan";
				Stack.value[20] = "Shatdwika";
				Stack.value[21] = "Madani";
				Stack.value[22] = "putri";
				Stack.value[23] = "ismail";
				Stack.value[24] = "umar";
				Stack.value[25] = "nur";
				Stack.value[26] = "lismawati";
				Stack.value[26] = "wati";
				Stack.value[27] = "rival";
				Stack.value[28] = "herni";
				Stack.value[29] = "mushaebi";
				Stack.value[30] = "ashar";
				Stack.value[31] = "abrar";
				Stack.value[32] = "akbar";
				Stack.value[33] = "farham";
				Stack.value[34] = "yudhi";
				Stack.value[35] = "dermawan";
				Stack.value[36] = "indah";
				Stack.value[37] = "sari";
				Stack.value[38] = "bulan";
				Stack.value[39] = "muhammad";
				Stack.value[40] = "ikram";
				Stack.value[41] = "bakri";
				Stack.value[42] = "puput";
				Stack.value[43] = "widya";
				Stack.value[44] = "fitri";
				Stack.value[45] = "ika";
				Stack.value[46] = "eka";
				Stack.value[47] = "anti";
				Stack.value[48] = "mita";
				Stack.value[49] = "juljul";
				Stack.value[50] = "amir";
				Stack.value[51] = "mira";
				Stack.value[52] = "zera";
				Stack.value[53] = "edi";
				Stack.value[54] = "andi";
				Stack.value[55] = "ifdal";
				Stack.value[56] = "sarwan";
				Stack.value[57] = "lisa";
				Stack.value[58] = "nisa";
				Stack.value[59] = "afdal";
				Stack.value[60] = "nini";
				Stack.value[61] = "nunu";
				Stack.value[62] = "siska";
				Stack.value[63] = "cika";
				Stack.value[64] = "mila";
				Stack.value[65] = "sisi";
				Stack.value[66] = "cici";
				Stack.value[67] = "uma";
				Stack.value[68] = "ayu";
				Stack.value[69] = "sasa";
				Stack.value[70] = "nini";
				Stack.value[71] = "ega";
				Stack.value[72] = "egi";
				Stack.value[73] = "andi";
				Stack.value[74] = "tiar";
				Stack.value[75] = "naja";
				Stack.value[76] = "vivi";
				Stack.value[77] = "fifit";
				Stack.value[78] = "viona";
				Stack.value[79] = "ina";
				Stack.value[80] = "ani";
				Stack.value[81] = "ona";
				Stack.value[82] = "marhumah";
				Stack.value[83] = "ana";
				Stack.value[84] = "mirna";
				Stack.value[85] = "dirman";
				Stack.value[86] = "rapiah";
				Stack.value[87] = "kiki";
				Stack.value[88] = "saskia";
				Stack.value[89] = "riska";
				Stack.value[90] = "pendi";
				Stack.value[91] = "reski";
				Stack.value[92] = "fajar";
				Stack.value[93] = "darliani";
				Stack.value[94] = "hasyim";
				Stack.value[95] = "nagif";
				Stack.value[96] = "aldi";
				Stack.value[97] = "icham";
				Stack.value[98] = "Yuyun Aprilia";
				Stack.value[99] = "lisa";
				


				Stack.setvalueAt(5, "ShatDwika Madani putri");
				
				for (int i=0;i<Stack.value.length;i++){System.out.println(Stack.value[i]);};

	}
}

