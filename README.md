**Gunshop Management System**

**Deskripsi Proyek**

Gunshop Management System adalah aplikasi berbasis Java yang dirancang untuk mengelola penjualan senjata secara efisien. Proyek ini dikembangkan sebagai bagian dari tugas Ujian Akhir Semester (UAS) Mata Kuliah Pemrograman Berbasis Objek oleh Kelompok 2. Sistem ini mengimplementasikan berbagai konsep Object-Oriented Programming (OOP) seperti class, object, encapsulation, inheritance, dan polymorphism dalam arsitektur berbasis MVC (Model-View-Controller).

**Fitur Utama**

1. Manajemen Stok Senjata
  - Menampilkan daftar senjata lengkap dengan nama, jenis, harga, dan stok dalam format tabel yang rapi.
  - Memperbarui stok secara otomatis saat senjata dibeli.

2. Metode Pembayaran
  - Mendukung pembayaran melalui tunai dan kartu kredit.

3. Diskon Otomatis
  - Memberikan diskon otomatis untuk pembelian dalam jumlah tertentu.

4. Validasi Stok
  - Tidak memungkinkan pembelian jika stok senjata sudah habis.

5. Riwayat Pembelian
  - Menampilkan daftar senjata yang telah dibeli oleh pelanggan di akhir program.

6. UI Teks yang Menarik
  - Antarmuka berbasis teks yang terstruktur untuk kemudahan penggunaan.

**Teknologi yang Digunakan**

- Bahasa Pemrograman: Java
- Paradigma Pemrograman: Object-Oriented Programming (OOP)
- Struktur Proyek: MVC (Model-View-Controller)

**Konsep OOP yang Diterapkan**

- Encapsulation
Atribut pada setiap kelas (seperti harga, stok, dan nama senjata) hanya dapat diakses melalui metode getter dan setter.
Menjaga data tetap aman dan mengurangi ketergantungan antar kelas.

- Inheritance
Kelas Pistol dan Rifle mewarisi kelas abstrak Weapon.
Setiap turunan memiliki atribut dan metode khusus, seperti informasi tambahan tentang jenis senjata.

- Polymorphism
Metode abstrak getType() dan getAdditionalInfo() didefinisikan secara berbeda pada masing-masing turunan Weapon.
Polimorfisme juga diterapkan pada kelas PaymentMethod dengan implementasi khusus di Cash dan CreditCard.

- Class & Object
Program ini terdiri dari banyak kelas, seperti Store, Weapon, Customer, dan lainnya.
Objek dibuat berdasarkan kelas untuk menyimpan data spesifik dan menjalankan fungsi tertentu.


