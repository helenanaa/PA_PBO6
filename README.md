# PA_PBO6
USWATUN KHASANAH (2209116010)
HELEN AMALIA DENGEN (22009116009)


## 1. Nama Project

SISTEM PERKEBUNAN PROBADI

## 2. Deskripsi Project

###Program SISTEM PERKEBUNAN PRIBADI dibuat untuk memberikan kemudahan dalam manajemen efisien dan pemantauan jarak jauh terhadap aspek-aspek penting dalam perkebunan pribadi, termasuk penjadwalan penanaman, pemeliharaan tanaman, pengelolaan sumber daya, dan analisis data produksi. Dengan fokus pada pengoptimalan produksi, pengelolaan efisien sumber daya, dan analisis mendalam terhadap kinerja perkebunan, program ini diharapkan dapat membantu pemilik perkebunan untuk meningkatkan efisiensi keuangan, mengoptimalkan hasil panen, dan mengelola perkebunan secara lebih efektif secara keseluruhan.

###Karena program ini merupakan program sistem perkebunan pribadi maka di dalam program ini, terdapat dua role login yang dapat dipilih oleh user. Role pertama yaitu role login sebagai owner. Disini owner dapat memantau segala update data yang mungkin saja terlewat dalam pencatatan manual. Disini, owner dapat melihat data produk yang dihasilkan oleh perkebunanya. Selain itu, owner dimudahkan karena mudah dalam me record, mengakses data yang terkait dengan perkebunanya.

###Sudah di sounding bahwa, ini sistem perkebunan sederhana. Maka yang kedua adalah role login admin. Admin bertanggung jawab atas pengelolaan data-data perkebunan. Oleh karena itu, admmin juga dimudahkan dengan sistem ini, sebab di dalam sistem ini, ada aspek penting yang dapat mengefesiensikan kinerja admin. Diantaranya yaitu, dapat mengedit data, menambah data, menghapus data, mengaupdate data secara mudah, dan lebih canggih. Data tersebut akan disimpan ke dalam database, sehingga pencatatan datanya lebih teroganisir dengan baik.

###Dalam singkat deskripsinya, kami membuat sistem perkebunan ini untuk mendukung para petani lokal untuk dapat merupah pola berfikir menjadi lebih canggih. Sehingga tidak ada lagi para petani yang mengeluhkan tentang pencatatan data, hasil, ataupun keluaran produk mereka yang belum terorganisir dengan baik.

## 3. Flowchart

![flowchart_PA_PBO6fix drawio](https://github.com/helenanaa/PA_PBO6/assets/115265157/a32237ef-f0e0-428a-8cce-f189f0630906)


## 4. ERD (Entity Relationship Diagram)
### Logical
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/96ccd109-2858-4821-bcf4-8aa789906d72)

### Relational
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/a04a5f82-7c6d-44c6-8c75-681cae035bb3)

### Relasi phpmyadmin
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/08167343-ac68-4a6a-b837-884cb74eb087)

## 5. Hirarki Kelas

![struktur_perkebunan drawio (2)](https://github.com/helenanaa/PA_PBO6/assets/115265157/365a5459-ab86-4a68-a508-e46178bb3e99)


## 6. Screenshot Kodingan
### Pola Desain ORM
###Kelas Dataproduk ini mengimplementasikan fungsionalitas dasar CRUD (Create, Read, Update, Delete) yang umum digunakan dalam pola desain ORM. Fungsi-fungsi seperti create(), find(), update(), dan delete() berinteraksi dengan database untuk membuat, membaca, memperbarui, dan menghapus data.

### Best Practice untuk Variabel Final, Property, Method, dan Class
###Variabel final: Metode create() dan find() dinyatakan sebagai final, yang menunjukkan bahwa metode-metode ini tidak dapat di-override oleh subclass.
###Property: Variabel ID_Produk, Nama_Produk, Jenis_Produk, Tanggal_Panen, Stok_Kg, dan ADMIN_ID_USER dideklarasikan sebagai properti kelas.
###Method: Terdapat penggunaan method create(), find(), update(), dan delete() yang sesuai dengan fungsionalitas CRUD.

### Inheritance, Encapsulation, Polymorphism, Abstraction
###Kelas Dataproduk mewarisi fungsionalitas dari kelas Database, sehingga mengikuti prinsip Inheritance. Penggunaan modifikasi akses pada variabel properti (seperti ID_Produk, Nama_Produk, dsb.) dan metode memastikan Encapsulation.

### Susunan Direktori
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/dbff070c-f5ec-4c50-90db-2dcd480369fd)

### Codingan
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/28ff4efb-fd36-46ff-8fc8-9c44ade22c6d)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/9221c8ee-ee1a-4bd2-8e5b-027e80e2b20b)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/ac8d7bfc-8bba-420b-b069-7555d8afa303)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/1507e56e-dfd3-4a95-81d4-9d39dbd50f74)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/052ef99f-00c6-48a4-8290-4c7ad432c4d8)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/3313be6f-050a-4c3d-8631-80fc957eccbe)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/fda6b0f5-171e-48a3-89a3-97ac1e2c0788)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/ac8141de-46f3-411c-b1be-b708bb53187e)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/85831db0-08c0-4241-a88d-200c4577662a)

## 7. Screenshot Output
### Role Login
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/ee4f9df8-c478-4581-b55a-4ec5181f11a4)

### Login Owner
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/a42fb75f-adae-426e-9179-00f3324186dd)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/781954b8-ea7c-4c3b-8337-eb8e40cd25be)

### Menu Owner
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/6e1f7608-36cb-4ceb-b577-7e1f557a1ac5)

### Informasi Data Produk
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/2800aa06-9551-4f21-a865-15ca8ee98b82)

### Login Admin
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/480a3abe-831c-4ce0-aea2-d814dc85536b)

### Menu Admin
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/d6ce3e7b-dc8f-43c3-a467-6cf34f5b0a6a)

### Kelola Data Produk
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/252a5647-c404-439e-b32c-6841415ce087)

### Tambah Data Produk
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/18dc175e-5180-452e-97c0-12b39b3a1317)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/55728775-9554-47e6-9185-fcb153e004f4)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/52435c26-0ae5-45a7-bf03-69d361a50d2e)

### Hapus Data Produk
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/535ae250-a121-4a79-8dac-fff1ca49b41b)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/a9c10972-5e0b-4e64-ad58-94e1ea176537)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/959c957c-f220-49db-9359-cb14adbfa924)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/dcc445bf-4f44-49e9-afe2-21bae8f5b276)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/7b1e4854-5240-4441-b275-5c0edfb04ec5)

### Edit Data Produk
![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/30ddf4e6-a49f-4c42-adb1-137fbd05e94f)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/73581a3f-71f6-487b-9dbd-65821b172772)

![image](https://github.com/helenanaa/PA_PBO6/assets/115265157/a6c43614-7181-462f-b461-886093b6a1ed)


















