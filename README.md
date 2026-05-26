# StructLab Manager — Modular Data Structure Practice System

StructLab Manager adalah versi refactor dari tugas Struktur Data lama berbasis Java CLI. Proyek ini tetap sederhana, ringan, dan fokus pada latihan penggunaan `ArrayList` serta operasi `removeAll()`.

## Fitur Utama

- Menu utama berbasis terminal.
- Menampilkan data hewan awal.
- Menampilkan daftar hewan yang akan dihapus.
- Menjalankan proses penghapusan data menggunakan `ArrayList.removeAll()`.
- Validasi input agar program tidak mudah error.
- Output terminal yang lebih rapi dan mudah dibaca.

## Struktur Folder

```text
StructLab-Manager/
├── README.md
├── src/
│   └── StructLabManager.java
├── docs/
│   └── explanation.md
└── examples/
    └── sample-output.txt
```

## Bahasa Pemrograman

- Java

## Struktur Data yang Dipakai

- `ArrayList<String>`
- Operasi utama: `add()`, `removeAll()`, `isEmpty()`, `size()`, dan akses elemen berdasarkan indeks.

## Cara Menjalankan

Pastikan Java sudah terpasang, lalu jalankan dari terminal pada folder `StructLab-Manager`.

### Compile

```bash
javac src/StructLabManager.java
```

### Run

```bash
java -cp src StructLabManager
```

## Alur Program

1. Program menampilkan menu utama.
2. Pengguna memilih aksi.
3. Program menampilkan data hewan awal atau daftar penghapusan.
4. Saat opsi penghapusan dijalankan, program memakai `removeAll()` untuk menghapus data yang cocok.
5. Hasil akhir ditampilkan di terminal.

## Contoh Input dan Output

Contoh interaksi lengkap tersedia di `examples/sample-output.txt`.

## Catatan Refactor

Versi ini mempertahankan logika inti dari program lama: daftar hewan disimpan dalam `ArrayList`, lalu beberapa data dihapus menggunakan `removeAll()`. Perubahan utama hanya pada struktur kode, validasi input, dan format tampilan agar lebih cocok sebagai project portfolio pembelajaran.
