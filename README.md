5.2
1. Pada algoritma Divide and Conquer, bagian if digunakan sebagai base case atau kondisi berhenti dari rekursi. Jika kondisi tersebut terpenuhi, maka program langsung mengembalikan nilai tanpa memanggil fungsi kembali. Sedangkan bagian else digunakan untuk proses rekursif, yaitu membagi masalah menjadi bagian yang lebih kecil dan memanggil method yang sama dengan parameter yang lebih kecil
2. Bisa. Perulangan dapat menggunakan while atau do while
contoh 
int faktorialBF(int n){
    int fakto = 1;
    int i = 1;

    while(i <= n){
        fakto *= i;
        i++;
    }

    return fakto;
}
3. fakto *= i; Digunakan pada algoritma Brute Force (iteratif).
Nilai faktorial dihitung dengan perulangan. int fakto = n * faktorialDC(n-1);
Digunakan pada algoritma Divide and Conquer (rekursif).
Nilai faktorial dihitung dengan pemanggilan fungsi berulang (rekursi).
4. faktorialBF()

Menggunakan perulangan (loop)

Prosesnya iteratif

Tidak menggunakan rekursi

Lebih mudah dipahami

faktorialDC()

Menggunakan rekursi

Memecah masalah menjadi sub masalah

Menggunakan konsep Divide and Conquer

Biasanya lebih elegan secara algoritma

5.3.3
1. pangkatBF()

Menggunakan perulangan

Mengalikan angka secara berulang

pangkatDC()

Menggunakan rekursi

Membagi masalah menjadi lebih kecil

2. Ya, ada.

Tahap combine terjadi ketika hasil rekursi digabungkan kembali.

Contoh:
return pangkatDC(a, n/2) * pangkatDC(a, n/2);

3. Sebenarnya tidak wajib jika nilai sudah ada pada atribut class

4. pangkatBF()

Menggunakan perulangan

Mengalikan angka secara berulang sampai pangkat tercapai

pangkatDC()

Menggunakan rekursi

Memecah pangkat menjadi bagian lebih kecil

Kemudian menggabungkan hasilnya

5.4.3
1. Variabel mid digunakan untuk membagi array menjadi dua bagian

2. Statement tersebut digunakan untuk menghitung total bagian kiri dan kanan array secara terpisah

3. Karena total keseluruhan array merupakan penjumlahan dari bagian kiri dan kanan

4. if(l == r){
    return arr[l];
}

5. Cara kerja algoritma totalDC():

Array dibagi menjadi dua bagian (divide)

Setiap bagian dihitung secara rekursif (conquer)

Hasil dari kedua bagian dijumlahkan kembali (combine)

Sehingga total nilai array dapat diperoleh dengan metode Divide and Conquer