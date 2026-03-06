# 💻 RIF KOMPUTER – Sistem Manajemen Gudang

**RIF KOMPUTER** merupakan aplikasi **desktop berbasis Java** yang dikembangkan menggunakan **NetBeans IDE** untuk membantu pengelolaan **stok barang pada gudang toko komputer**.

Aplikasi ini dirancang untuk mempermudah proses **pengelolaan data barang, pengelolaan karyawan, serta pembuatan laporan stok** secara digital sehingga proses administrasi menjadi lebih cepat, akurat, dan terorganisir.

Sistem ini juga menyediakan fitur **CRUD (Create, Read, Update, Delete)** untuk memudahkan admin dalam mengelola data pada sistem.

Project ini dikembangkan sebagai bagian dari **portfolio pengembangan aplikasi desktop menggunakan Java**.

---

# 🚀 Features

Beberapa fitur utama dalam aplikasi **RIF KOMPUTER** antara lain:

### 📦 Manajemen Stok Barang
Admin dapat mengelola data barang yang tersedia di gudang seperti:

- Nama barang
- Kategori barang
- Harga barang
- Jumlah stok
- Informasi barang

### 👨‍💼 Manajemen Karyawan
Admin dapat menambahkan, mengedit, atau menghapus data karyawan yang bekerja pada toko.

### 📊 Laporan Stok
Sistem dapat menampilkan laporan data stok barang yang tersedia di gudang.

### 🔐 Sistem Login
Aplikasi menyediakan fitur login untuk membatasi akses pengguna.

### ⚙️ CRUD Data
Semua data pada sistem dapat dikelola menggunakan operasi:

- Create (Tambah Data)
- Read (Lihat Data)
- Update (Edit Data)
- Delete (Hapus Data)

### 🖥️ Desktop Application
Aplikasi berjalan pada sistem operasi desktop menggunakan **Java Swing GUI**.

---

# 🛠 Tech Stack

Teknologi yang digunakan dalam pengembangan aplikasi ini:

| Technology | Description |
|-----------|-------------|
| Java | Bahasa pemrograman utama |
| NetBeans IDE | IDE pengembangan aplikasi Java |
| Java Swing | Framework GUI untuk aplikasi desktop |
| MySQL | Database management system |
| JDBC | Koneksi antara Java dan database |

---

# 📂 Project Structure

Struktur folder utama pada project:

```
rif-komputer
│
├── src
│   ├── config
│   │   └── DatabaseConnection.java
│   │
│   ├── model
│   │   ├── Barang.java
│   │   ├── Karyawan.java
│   │
│   ├── view
│   │   ├── LoginForm.java
│   │   ├── Dashboard.java
│   │   ├── BarangForm.java
│   │   ├── KaryawanForm.java
│   │   └── LaporanForm.java
│   │
│   └── controller
│       ├── BarangController.java
│       └── KaryawanController.java
│
├── lib
├── database
│   └── rif_komputer.sql
│
└── README.md
```

---

# ⚙️ Installation

Ikuti langkah berikut untuk menjalankan project secara lokal.

### 1. Clone Repository

```
git clone https://github.com/username/rif-komputer.git
```

### 2. Buka Project di NetBeans

1. Buka **NetBeans IDE**
2. Klik **Open Project**
3. Pilih folder project **rif-komputer**

---

### 3. Import Database

1. Buka **phpMyAdmin** atau MySQL
2. Buat database baru

```
rif_komputer
```

3. Import file database:

```
rif_komputer.sql
```

---

### 4. Konfigurasi Database

Buka file koneksi database pada project.

Contoh konfigurasi JDBC:

```java
String url = "jdbc:mysql://localhost:3306/rif_komputer";
String user = "root";
String password = "";
```

---

### 5. Jalankan Aplikasi

Klik **Run Project** pada NetBeans.

---

# 📸 Application Preview

![alt text](https://github.com/Jimmy-hubb/Aplikasi-Desktop-RIF-KOMPUTER-Semester-1-2/blob/main/Screenshot%202026-03-06%20192431.png?raw=true)

---

# 🎯 Project Goals

Tujuan utama dari pengembangan aplikasi ini:

- Mempermudah pengelolaan stok barang pada gudang toko komputer
- Mengelola data karyawan secara digital
- Membantu pembuatan laporan stok secara cepat
- Mengembangkan keterampilan dalam pengembangan aplikasi desktop menggunakan Java

---
