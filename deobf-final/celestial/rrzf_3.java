package celestial;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Runtime.Version;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessMode;
import java.nio.file.ClosedFileSystemException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.jar.Manifest;
import java.util.jar.Attributes.Name;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzf_3 extends FileSystem {
   public static Object[] class_;
   private static String[] byte_;
   private static short[] protected_;
   private static int[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;
   public Object[] break_;
   private static long[] private_;

   private void byte_(rrzi_3 var1, rrzi_3 var2) {
      rrQr_1 var4 = new rrQr_1();

      while (true) {
         int var5 = native_((byte[])var1.protected_[0]);
         if (var5 <= 1) {
            rrzi_3 var10 = (rrzi_3)var2.protected_[4];
            var1.protected_[5] = var10;
            var2.protected_[4] = var1;
            break;
         }

         var4 = var4.class_((byte[])var1.protected_[0], var5);
         if (((LinkedHashMap)this.break_[25]).containsKey(var4)) {
            rrzi_3 var16 = (rrzi_3)((LinkedHashMap)this.break_[25]).get(var4);
            rrzi_3 var12 = (rrzi_3)var16.protected_[4];
            var1.protected_[5] = var12;
            var16.protected_[4] = var1;
            break;
         }

         rrzi_3 var3 = new rrzi_3(Arrays.copyOf((byte[])var1.protected_[0], var5), true);
         ((LinkedHashMap)this.break_[25]).put(var3, var3);
         rrzi_3 var14 = (rrzi_3)var3.protected_[4];
         var1.protected_[5] = var14;
         var3.protected_[4] = var1;
         var1 = var3;
      }
   }

   private InputStream byte_(rrzY_2 var1) throws IOException {
      Object var2;
      if ((Integer)var1.class_[2] == 2) {
         if ((byte[])var1.class_[0] != null) {
            var2 = new ByteArrayInputStream((byte[])var1.class_[0]);
         } else {
            if ((Path)var1.class_[1] == null) {
               throw new ZipException("update entry data is missing");
            }

            var2 = Files.newInputStream((Path)var1.class_[1]);
         }
      } else {
         if ((Integer)var1.class_[2] == 3) {
            return Files.newInputStream((Path)var1.class_[1]);
         }

         var2 = new rrzo_3(this, var1);
      }

      if ((Integer)var1.class_[6] == 8) {
         long var3 = (Long)var1.class_[12] + 2L;
         if (var3 > 65536L) {
            var3 = 8192L;
         }

         long var5 = (Long)var1.class_[12];
         var2 = new rrzV_2(this, (InputStream)var2, this.native_(), (int)var3, var5);
      } else if ((Integer)var1.class_[6] != 0) {
         throw new ZipException("invalid compression method");
      }

      ((Set)this.break_[17]).add(var2);
      return (InputStream)var2;
   }

   private int byte_(Map<String, ?> var1) {
      byte var2 = class_(var1, "noCompression") ? 0 : catch_[4];
      if (var1.containsKey("compressionMethod")) {
         Object var3 = var1.get("compressionMethod");
         if (var3 == null) {
            throw new IllegalArgumentException(String.format("The value for the %s property must be %s or %s", "compressionMethod", "STORED", "DEFLATED"));
         }

         if (!(var3 instanceof String)) {
            throw new IllegalArgumentException(String.format("The Object type for the %s property must be a String", "compressionMethod"));
         }

         String var4 = ((String)var3).toUpperCase();
         switch (var4) {
            case "STORED":
               var2 = case_[16];
               break;
            case "DEFLATED":
               var2 = catch_[6];
               break;
            default:
               throw new IllegalArgumentException(String.format("The value for the %s property must be %s or %s", "compressionMethod", "STORED", "DEFLATED"));
         }
      }

      return var2;
   }

   public InputStream byte_(byte[] var1) throws IOException {
      this.super_();

      InputStream var3;
      try {
         this.continue_();
         rrzY_2 var2 = this.private_(var1);
         if (var2 == null) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         if (var2.catch_()) {
            throw new FileSystemException(this.throws_(var1), byte_[40], null);
         }

         var3 = this.byte_(var2);
      } finally {
         this.this_();
      }

      return var3;
   }

   public void byte_() {
      Boolean var5 = true;
      this.break_[4] = var5;
   }

   private static void int_() {
      protected_ = new short[]{
         5,
         8,
         11,
         17,
         18,
         19,
         24,
         26,
         27,
         28,
         29,
         30,
         6,
         7,
         9,
         10,
         12,
         12,
         13,
         12,
         14,
         12,
         15,
         12,
         16,
         9,
         4,
         2,
         3,
         20,
         21,
         20,
         0,
         1,
         13,
         13,
         8,
         0,
         19,
         4,
         4,
         4,
         3,
         3,
         3,
         16,
         1,
         1,
         19,
         19,
         17,
         17,
         20,
         29,
         29,
         30,
         30,
         25,
         18,
         18,
         0,
         1,
         3,
         12,
         0,
         2,
         0,
         2,
         5,
         9,
         8,
         7,
         12,
         2,
         2,
         7,
         8,
         9,
         0,
         1,
         2,
         2,
         5,
         4,
         0,
         5,
         12,
         12,
         2,
         2,
         2,
         2,
         0,
         0,
         1,
         1,
         0,
         0,
         0,
         0,
         1,
         1,
         1,
         1,
         2,
         6,
         10,
         9,
         8,
         7,
         12,
         10,
         10,
         12,
         10,
         10,
         12,
         8192,
         12,
         10,
         10,
         2,
         1,
         12,
         4,
         10,
         6,
         1,
         18,
         1,
         25,
         1,
         24,
         24,
         24,
         24,
         2,
         2,
         20,
         20,
         20,
         128,
         20,
         0,
         1,
         2,
         3,
         3,
         3,
         1,
         1,
         2,
         2,
         0,
         0,
         1,
         2,
         0,
         3,
         0,
         4,
         5,
         4,
         0,
         25,
         25,
         4,
         5,
         4,
         0,
         25,
         4,
         5,
         4,
         25,
         27,
         1,
         1,
         25,
         25,
         25,
         27,
         0,
         4,
         5,
         4,
         5,
         5,
         5,
         11,
         4,
         5,
         0,
         0,
         4,
         5,
         0,
         0,
         22,
         22,
         3,
         25,
         23,
         22,
         1,
         22,
         3,
         22,
         3,
         22,
         1,
         22,
         2,
         23,
         23,
         22,
         1,
         22,
         1,
         22,
         0,
         25,
         25,
         2,
         2048,
         0,
         0,
         2,
         2,
         19,
         18,
         25,
         26,
         25,
         2,
         2,
         2,
         25,
         27,
         0,
         4,
         5,
         4,
         26,
         14,
         14,
         4,
         12,
         11,
         11,
         11,
         0,
         1,
         6,
         11,
         10,
         12,
         6,
         11,
         4,
         0,
         0,
         0,
         1,
         2,
         2,
         1,
         1,
         18,
         1,
         26,
         1,
         1,
         25,
         25,
         25,
         2,
         8192,
         14,
         3,
         0,
         0,
         12,
         8192,
         22,
         2,
         22,
         0,
         22,
         22,
         2,
         1,
         22,
         9,
         20,
         1,
         1,
         26,
         25,
         11,
         25,
         1,
         3,
         12,
         4,
         7,
         7,
         6,
         10,
         6,
         4,
         2,
         4,
         2048,
         4,
         7,
         12,
         1,
         1,
         6,
         2,
         0,
         0,
         1,
         1,
         2,
         1,
         6,
         12,
         12,
         6,
         17,
         29,
         29,
         29,
         29,
         29,
         29,
         30,
         30,
         30,
         30,
         30,
         30,
         4,
         2,
         0
      };
   }

   public rrzf_3(rrQB var1, Path var2, Map<String, ?> var3) throws IOException {
      this.catch_();
      Long var12 = System.currentTimeMillis();
      this.break_[5] = var12;
      Integer var13 = 10485760;
      this.break_[8] = var13;
      Function var14 = Function.identity();
      this.break_[11] = var14;
      Set var15 = Collections.synchronizedSet(new HashSet());
      this.break_[17] = var15;
      Set var16 = Collections.synchronizedSet(new HashSet());
      this.break_[18] = var16;
      Boolean var17 = true;
      this.break_[19] = var17;
      ReentrantReadWriteLock var18 = new ReentrantReadWriteLock();
      this.break_[24] = var18;
      Boolean var19 = false;
      this.break_[26] = var19;
      rrzi_3 var20 = new rrzi_3(null, -1);
      this.break_[27] = var20;
      Integer var21 = 20;
      this.break_[28] = var21;
      ArrayList var22 = new ArrayList();
      this.break_[29] = var22;
      ArrayList var23 = new ArrayList();
      this.break_[30] = var23;
      String var4 = var3.containsKey("encoding") ? (String)var3.get("encoding") : byte_[2];
      Boolean var24 = "false".equals(var3.get("zipinfo-time"));
      this.break_[6] = var24;
      Boolean var25 = class_(var3, "useTempFile");
      this.break_[7] = var25;
      Boolean var26 = class_(var3, "forceZIP64End");
      this.break_[9] = var26;
      Integer var27 = this.byte_(var3);
      this.break_[10] = var27;
      Boolean var28 = class_(var3, "enablePosixFileAttributes");
      this.break_[12] = var28;
      UserPrincipal var29 = this.break_[12] ? this.break_(var2, var3) : null;
      this.break_[13] = var29;
      GroupPrincipal var30 = this.break_[12] ? this.class_(var2, var3) : null;
      this.break_[14] = var30;
      Set var31 = this.break_[12] ? this.break_(var3) : null;
      this.break_[15] = var31;
      Set var32 = this.break_[12] ? Set.of("basic", "posix", "zip") : Set.of(byte_[11], "zip");
      this.break_[16] = var32;
      if (Files.notExists(var2)) {
         if (!class_(var3, "create")) {
            throw new NoSuchFileException(var2.toString());
         }

         try (OutputStream var5 = Files.newOutputStream(var2, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE)) {
            new rrzR_2().class_(var5, private_[0], (Boolean)this.break_[protected_[25]]);
         }
      }

      var2.getFileSystem().provider().checkAccess(var2, AccessMode.READ);
      boolean var44 = AccessController.doPrivileged((PrivilegedAction<Boolean>)(() -> Files.isWritable(var2)));
      Boolean var33 = !var44 ? true : case_[8];
      this.break_[4] = var33;
      rrzC_2 var34 = rrzC_2.class_(var4);
      this.break_[2] = var34;
      rrQs_1 var35 = new rrQs_1(this, new byte[]{47});
      this.break_[3] = var35;
      SeekableByteChannel var36 = Files.newByteChannel(var2, StandardOpenOption.READ);
      this.break_[20] = var36;

      try {
         byte[] var37 = this.try_();
         this.break_[protected_[30]] = var37;
      } catch (IOException var42) {
         try {
            ((SeekableByteChannel)this.break_[protected_[31]]).close();
         } catch (IOException var40) {
            var42.addSuppressed(var40);
         }

         throw var42;
      }

      this.break_[0] = var1;
      this.break_[1] = var2;
      this.class_(var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void finalize() throws IOException {
      this.close();
   }

   @Override
   public String toString() {
      return ((Path)this.break_[1]).toString();
   }

   private void this_() {
      ((ReadWriteLock)this.break_[24]).readLock().unlock();
   }

   private static boolean class_(Map<String, ?> var0, String var1) {
      return !"true".equals(var0.get(var1)) && !Boolean.TRUE.equals(var0.get(var1)) ? case_[24] : case_[23];
   }

   public rrQs_1 class_(String var1, String... var2) {
      if (var2.length == 0) {
         return new rrQs_1(this, var1);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append(var1);

         for (String var7 : var2) {
            if (var7.length() > 0) {
               if (var3.length() > 0) {
                  var3.append('/');
               }

               var3.append(var7);
            }
         }

         return new rrQs_1(this, var3.toString());
      }
   }

   public void class_(byte[] var1, FileTime var2, FileTime var3, FileTime var4) throws IOException {
      this.final_();
      this.new_();

      try {
         this.continue_();
         rrzY_2 var5 = this.private_(var1);
         if (var5 == null) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         if ((Integer)var5.class_[protected_[73]] == case_[33]) {
            Integer var11 = Integer.valueOf(catch_[14]);
            var5.class_[protected_[74]] = var11;
         }

         if (var2 != null) {
            Long var12 = var2.toMillis();
            var5.class_[protected_[75]] = var12;
         }

         if (var3 != null) {
            Long var13 = var3.toMillis();
            var5.class_[protected_[76]] = var13;
         }

         if (var4 != null) {
            Long var14 = var4.toMillis();
            var5.class_[protected_[77]] = var14;
         }

         this.class_(var5);
      } finally {
         this.synchronized_();
      }
   }

   public void class_(byte[] var1, FileAttribute<?>... var2) throws IOException {
      this.final_();
      this.new_();

      try {
         this.continue_();
         if (var1.length == 0 || this.case_(var1)) {
            throw new FileAlreadyExistsException(this.throws_(var1));
         }

         this.implements_(var1);
         Object var3 = this.break_[protected_[86]]
            ? new rrQP((byte[])this, (int)var1, (boolean)catch_[17], case_[40], case_[41], var2)
            : new rrzY_2(var1, catch_[18], case_[42], case_[43], var2);
         this.class_((rrzY_2)var3);
      } finally {
         this.synchronized_();
      }
   }

   private long class_(rrzY_2 var1, boolean var2, OutputStream var3, long var4, byte[] var6) throws IOException {
      long var7 = (Long)var1.class_[14];
      Long var16 = var4;
      var1.class_[14] = var16;
      long var9 = 0L;
      if (((Integer)var1.class_[4] & 8) != 0) {
         if ((Long)var1.class_[12] < 4294967295L && (Long)var1.class_[11] < 4294967295L) {
            var9 = private_[20];
         } else {
            var9 = private_[19];
         }
      }

      if (this.class_(var6, 0, 31L, var7) != 31L) {
         throw new ZipException("loc: reading failed");
      } else {
         if (!var2 && (rrzH_2.extends_(var6) <= 0 || var6[30] != 47)) {
            var3.write(var6, 0, 30);
            var7 += 30L;
            var9 += (long)(rrzH_2.extends_(var6) + rrzH_2.volatile_(var6)) + var1.class_[11];
            var4 = 30L + var9;
         } else {
            var7 += (long)(30 + rrzH_2.extends_(var6) + rrzH_2.volatile_(var6));
            var9 += var1.class_[11];
            var4 = (long)var1.break_(var3) + var9;
         }

         int var11;
         while (var9 > 0L && (var11 = (int)this.class_(var6, 0, (long)var6.length, var7)) != -1) {
            if (var9 < (long)var11) {
               var11 = (int)var9;
            }

            var3.write(var6, 0, var11);
            var9 -= (long)var11;
            var7 += (long)var11;
         }

         return var4;
      }
   }

   public void class_(byte[] var1, GroupPrincipal var2) throws IOException {
      this.final_();
      this.new_();

      try {
         this.continue_();
         rrzY_2 var3 = this.private_(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         if (var3 instanceof rrQP) {
            ((rrQP)var3).throws_[protected_[79]] = var2;
            this.class_(var3);
         }
      } finally {
         this.synchronized_();
      }
   }

   private Path class_(Path var1) throws IOException {
      Path var2 = var1.toAbsolutePath().getParent();
      Path var3 = var2 == null ? var1.getFileSystem().getPath(".") : var2;
      Path var4 = Files.createTempFile(var3, "zipfstmp", null);
      ((Set)this.break_[18]).add(var4);
      return var4;
   }

   public void class_(byte[] var1, boolean var2) throws IOException {
      this.final_();
      rrzi_3 var3 = this.extends_(var1);
      if (var3 == null) {
         if (var1 != null && var1.length == 0) {
            throw new ZipException("root directory </> cannot be deleted");
         }

         if (var2) {
            throw new NoSuchFileException(this.throws_(var1));
         }
      } else {
         if (var3.catch_() && (rrzi_3)var3.protected_[4] != null) {
            throw new DirectoryNotEmptyException(this.throws_(var1));
         }

         this.break_(var3);
      }
   }

   public OutputStream class_(byte[] var1, OpenOption... var2) throws IOException {
      this.final_();
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for (OpenOption var10 : var2) {
         if (var10 == StandardOpenOption.READ) {
            throw new IllegalArgumentException("READ not allowed");
         }

         if (var10 == StandardOpenOption.CREATE_NEW) {
            var3 = true;
         }

         if (var10 == StandardOpenOption.CREATE) {
            var4 = true;
         }

         if (var10 == StandardOpenOption.APPEND) {
            var5 = true;
         }

         if (var10 == StandardOpenOption.TRUNCATE_EXISTING) {
            var6 = true;
         }
      }

      if (var5 && var6) {
         throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
      } else {
         this.super_();

         OutputStream var24;
         try {
            this.continue_();
            rrzY_2 var19 = this.private_(var1);
            if (var19 == null) {
               if (!var4 && !var3) {
                  throw new NoSuchFileException(this.throws_(var1));
               }

               this.implements_(var1);
               return this.break_(
                  (rrzY_2)(this.break_[protected_[113]]
                     ? new rrQP((byte[])this, (int)var1, (boolean)catch_[28], case_[64], (Integer)this.break_[protected_[114]])
                     : new rrzY_2(var1, catch_[29], case_[66], (Integer)this.break_[protected_[115]]))
               );
            }

            if (var19.catch_() || var3) {
               throw new FileAlreadyExistsException(this.throws_(var1));
            }

            if (!var5) {
               return this.break_(
                  (rrzY_2)(this.break_[protected_[110]]
                     ? new rrQP(this, (rrQP)var19, catch_[26], (Integer)this.break_[protected_[111]])
                     : new rrzY_2(var19, catch_[27], (Integer)this.break_[protected_[112]]))
               );
            }

            OutputStream var20 = this.break_(new rrzY_2(var19, catch_[25]));

            try (InputStream var23 = this.byte_(var19)) {
               var23.transferTo(var20);
            }

            var24 = var20;
         } finally {
            this.this_();
         }

         return var24;
      }
   }

   private void class_(rrzi_3 var1, Consumer<rrzi_3> var2) {
      if (var1 != null) {
         if (var1.catch_()) {
            this.class_((rrzi_3)var1.protected_[4], var2);
         } else {
            var2.accept(var1);
         }

         this.class_((rrzi_3)var1.protected_[5], var2);
      }
   }

   private TreeMap<Integer, rrzi_3> class_(int var1, rrzi_3 var2) {
      TreeMap var3 = new TreeMap();

      for (rrzi_3 var4 = (rrzi_3)var2.protected_[4]; var4 != null; var4 = (rrzi_3)var4.protected_[5]) {
         Integer var5 = this.break_(var4, var2);
         if (var5 != null && var5 <= var1) {
            var3.put(var5, var4);
         }
      }

      return var3;
   }

   public void class_(byte[] var1) throws IOException {
      this.super_();

      try {
         this.continue_();
         if (this.extends_(var1) == null) {
            throw new NoSuchFileException(this.toString());
         }
      } finally {
         this.this_();
      }
   }

   long class_(ByteBuffer var1, long var2) throws IOException {
      SeekableByteChannel var5 = (SeekableByteChannel)this.break_[20];
      if (var5 instanceof FileChannel var4) {
         return (long)var4.read(var1, var2);
      } else {
         synchronized ((SeekableByteChannel)this.break_[20]) {
            return (long)((SeekableByteChannel)this.break_[protected_[140]]).position(var2).read(var1);
         }
      }
   }

   private long class_(rrzY_2 var1, OutputStream var2) throws IOException {
      if ((byte[])var1.class_[0] == null && (Path)var1.class_[1] == null) {
         return 0L;
      } else {
         long var3 = private_[27];
         if ((Integer)var1.class_[6] == 0 || (Long)var1.class_[11] <= 0L || (Long)var1.class_[10] == 0L && (Long)var1.class_[12] != 0L) {
            try (Object var5 = var1.class_[6] == 0 ? new rrzU_2(this, var1, var2) : new rrze_3(this, var1, var2)) {
               this.break_(var1, (OutputStream)var5);
            }
         } else {
            this.break_(var1, var2);
         }

         var3 += var1.class_[11];
         if (((Integer)var1.class_[4] & 8) != 0) {
            var3 += (long)var1.byte_(var2);
         }

         return var3;
      }
   }

   private void class_(rrzi_3 var1) {
      rrzi_3 var2 = (rrzi_3)((LinkedHashMap)this.break_[25]).get(((rrzi_3)this.break_[27]).class_(catch_((byte[])var1.protected_[0])));
      rrzi_3 var3 = (rrzi_3)var2.protected_[4];
      if (var3.equals(var1)) {
         rrzi_3 var9 = (rrzi_3)var3.protected_[5];
         var2.protected_[4] = var9;
      } else {
         for (rrzi_3 var4 = var3; (var3 = (rrzi_3)var3.protected_[5]) != null; var4 = var3) {
            if (var3.equals(var1)) {
               rrzi_3 var10 = (rrzi_3)var3.protected_[5];
               var4.protected_[5] = var10;
               break;
            }
         }
      }
   }

   public long class_(byte[] var1, int var2, long var3, long var5) throws IOException {
      ByteBuffer var7 = ByteBuffer.wrap(var1);
      var7.position(var2);
      var7.limit((int)((long)var2 + var3));
      return this.class_(var7, var5);
   }

   private void class_(int var1) {
      rrzi_3 var2 = this.extends_(this.class_("/META-INF/versions"));
      if (var2 != null) {
         HashMap var3 = new HashMap();
         this.class_(var1, var2)
            .values()
            .forEach(
               var2x -> this.class_(
                     (rrzi_3)var2x.protected_[4],
                     var3x -> var3.put(this.break_(this.class_(var3x, var2x), (Boolean)var3x.protected_[2]), (byte[])var3x.protected_[0])
                  )
            );
         Function var8 = var1x -> {
            byte[] var2x = (byte[])var3.get(rrzi_3.byte_(var1x));
            return var2x == null ? var1x : var2x;
         };
         this.break_[11] = var8;
      }
   }

   private GroupPrincipal class_(Path var1, Map<String, ?> var2) throws IOException {
      Object var3 = var2.get("defaultGroup");
      if (var3 == null) {
         try {
            PosixFileAttributeView var4 = Files.getFileAttributeView(var1, PosixFileAttributeView.class);
            if (var4 == null) {
               return ((UserPrincipal)this.break_[protected_[34]])::getName;
            } else {
               PrivilegedExceptionAction var5 = () -> var4.readAttributes().group();
               return AccessController.doPrivileged(var5);
            }
         } catch (PrivilegedActionException | UnsupportedOperationException var6) {
            if (!(var6 instanceof UnsupportedOperationException) && !(var6.getCause() instanceof NoSuchFileException)) {
               throw new IOException(var6);
            } else {
               return ((UserPrincipal)this.break_[13])::getName;
            }
         }
      } else if (var3 instanceof String) {
         if (((String)var3).isEmpty()) {
            throw new IllegalArgumentException("Value for property defaultGroup must not be empty.");
         } else {
            return () -> (String)var3;
         }
      } else if (var3 instanceof GroupPrincipal) {
         return (GroupPrincipal)var3;
      } else {
         throw new IllegalArgumentException("Value for property defaultGroup must be of type " + String.class + " or " + GroupPrincipal.class);
      }
   }

   public byte[] class_(String var1) {
      return ((rrzC_2)this.break_[2]).byte_(var1);
   }

   public FileStore class_(rrQs_1 var1) {
      return new rrzw_3(var1);
   }

   public void class_(byte[] var1, UserPrincipal var2) throws IOException {
      this.final_();
      this.new_();

      try {
         this.continue_();
         rrzY_2 var3 = this.private_(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         if (var3 instanceof rrQP) {
            ((rrQP)var3).throws_[protected_[78]] = var2;
            this.class_(var3);
         }
      } finally {
         this.synchronized_();
      }
   }

   private void class_(Map<String, ?> var1) throws IOException {
      Object var2 = var1.containsKey("releaseVersion") ? var1.get("releaseVersion") : var1.get("multi-release");
      if (var2 != null && this.case_()) {
         int var3;
         if (var2 instanceof String var4) {
            if (var4.equals("runtime")) {
               var3 = Runtime.version().feature();
            } else {
               if (!var4.matches("^[1-9][0-9]*$")) {
                  throw new IllegalArgumentException("Invalid runtime version");
               }

               var3 = Version.parse(var4).feature();
            }
         } else if (var2 instanceof Integer) {
            var3 = Version.parse(((Integer)var2).toString()).feature();
         } else {
            if (!(var2 instanceof Version)) {
               throw new IllegalArgumentException("env parameter must be String, Integer, or Version");
            }

            var3 = ((Version)var2).feature();
         }

         this.class_(var3 < 0 ? 0 : var3);
         this.byte_();
      }
   }

   void class_(Inflater var1) {
      synchronized ((List)this.break_[29]) {
         if (((List)this.break_[protected_[336]]).size() < catch_[81]) {
            var1.reset();
            ((List)this.break_[protected_[337]]).add(var1);
         } else {
            var1.end();
         }
      }
   }

   private byte[] class_(rrzi_3 var1, rrzi_3 var2) {
      byte[] var3 = (byte[])var1.protected_[0];
      return Arrays.copyOfRange(var3, ((byte[])var2.protected_[0]).length, var3.length);
   }

   public void class_(boolean var1, byte[] var2, byte[] var3, CopyOption... var4) throws IOException {
      this.final_();
      if (!Arrays.equals(var2, var3)) {
         this.new_();

         try {
            this.continue_();
            rrzY_2 var5 = this.private_(var2);
            if (var5 == null) {
               throw new NoSuchFileException(this.throws_(var2));
            }

            if (!var5.catch_()) {
               boolean var6 = case_[45];
               boolean var7 = case_[46];
               CopyOption[] var8 = var4;
               int var9 = var4.length;

               for (int var10 = case_[47]; var10 < var9; var10++) {
                  CopyOption var11 = var8[var10];
                  if (var11 == StandardCopyOption.REPLACE_EXISTING) {
                     var6 = case_[48];
                  } else if (var11 == StandardCopyOption.COPY_ATTRIBUTES) {
                     var7 = case_[49];
                  }
               }

               rrzY_2 var37 = this.private_(var3);
               if (var37 != null) {
                  if (!var6) {
                     throw new FileAlreadyExistsException(this.throws_(var3));
                  }
               } else {
                  this.implements_(var3);
               }

               Object var38 = this.break_[protected_[87]] ? new rrQP(this, (rrQP)var5, catch_[19]) : new rrzY_2(var5, catch_[20]);
               ((rrzY_2)var38).break_(var3);
               if ((Integer)var5.class_[protected_[88]] != catch_[21] && (Integer)var5.class_[protected_[89]] != catch_[22]) {
                  if ((Integer)var5.class_[protected_[104]] == case_[52] && (Integer)var5.class_[protected_[105]] != (Integer)this.break_[protected_[106]]) {
                     try (InputStream var39 = this.byte_(var2)) {
                        OpenOption[] var41 = new OpenOption[catch_[23]];
                        var41[case_[53]] = StandardOpenOption.CREATE;
                        var41[case_[54]] = StandardOpenOption.TRUNCATE_EXISTING;
                        var41[catch_[24]] = StandardOpenOption.WRITE;

                        try (OutputStream var40 = this.class_(var3, var41)) {
                           var39.transferTo(var40);
                        }
                     }

                     var38 = this.private_(var3);
                  }
               } else {
                  Integer var19 = (Integer)var5.class_[protected_[90]];
                  ((rrzY_2)var38).class_[protected_[91]] = var19;
                  if (var1) {
                     byte[] var20 = (byte[])var5.class_[protected_[92]];
                     ((rrzY_2)var38).class_[protected_[93]] = var20;
                     Path var21 = (Path)var5.class_[protected_[94]];
                     ((rrzY_2)var38).class_[protected_[95]] = var21;
                  } else if ((byte[])var5.class_[protected_[96]] != null) {
                     byte[] var22 = Arrays.copyOf((byte[])var5.class_[protected_[97]], ((byte[])var5.class_[protected_[98]]).length);
                     ((rrzY_2)var38).class_[protected_[99]] = var22;
                  } else if ((Path)var5.class_[protected_[100]] != null) {
                     Path var23 = this.finally_(null);
                     ((rrzY_2)var38).class_[protected_[101]] = var23;
                     Path var10000 = (Path)var5.class_[protected_[102]];
                     Path var10001 = (Path)((rrzY_2)var38).class_[protected_[103]];
                     CopyOption[] var10002 = new CopyOption[case_[50]];
                     var10002[case_[51]] = StandardCopyOption.REPLACE_EXISTING;
                     Files.copy(var10000, var10001, var10002);
                  }
               }

               if (!var7) {
                  long var10004 = System.currentTimeMillis();
                  Long var24 = var10004;
                  ((rrzY_2)var38).class_[protected_[107]] = var24;
                  Long var25 = var10004;
                  ((rrzY_2)var38).class_[protected_[108]] = var25;
                  Long var26 = var10004;
                  ((rrzY_2)var38).class_[protected_[109]] = var26;
               }

               this.class_((rrzY_2)var38);
               if (var1) {
                  this.break_((rrzi_3)var5);
               }

               return;
            }

            this.class_(var3);
         } finally {
            this.synchronized_();
         }
      }
   }

   private void class_(Set<? extends OpenOption> var1) {
      for (OpenOption var3 : var1) {
         if (var3 == null) {
            throw new NullPointerException();
         }

         if (!(var3 instanceof StandardOpenOption)) {
            throw new IllegalArgumentException();
         }
      }

      if (var1.contains(StandardOpenOption.APPEND) && var1.contains(StandardOpenOption.TRUNCATE_EXISTING)) {
         throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
      }
   }

   public void class_(byte[] var1, Set<PosixFilePermission> var2) throws IOException {
      this.final_();
      this.new_();

      try {
         this.continue_();
         rrzY_2 var3 = this.private_(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         if ((Integer)var3.class_[protected_[80]] == case_[34]) {
            Integer var9 = Integer.valueOf(catch_[15]);
            var3.class_[protected_[81]] = var9;
         }

         Integer var10 = var2 == null ? catch_[16] : rrQO.class_(var2);
         var3.class_[protected_[82]] = var10;
         this.class_(var3);
      } finally {
         this.synchronized_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2210819011692631268L;
   }

   public rrQs_1 class_() {
      return (rrQs_1)this.break_[3];
   }

   void class_(Deflater var1) {
      synchronized ((List)this.break_[30]) {
         if (((List)this.break_[protected_[342]]).size() < catch_[83]) {
            var1.reset();
            ((List)this.break_[protected_[343]]).add(var1);
         } else {
            var1.end();
         }
      }
   }

   public Iterator<Path> class_(rrQs_1 var1, Filter<? super Path> var2) throws IOException {
      this.new_();

      Iterator var13;
      try {
         this.continue_();
         byte[] var3 = var1.throws_();
         rrzi_3 var4 = this.extends_(var3);
         if (var4 == null) {
            throw new NotDirectoryException(this.throws_(var3));
         }

         ArrayList var5 = new ArrayList();

         for (rrzi_3 var6 = (rrzi_3)var4.protected_[protected_[83]]; var6 != null; var6 = (rrzi_3)var6.protected_[protected_[85]]) {
            rrQs_1 var7 = new rrQs_1(this, (byte[])var6.protected_[protected_[84]], case_[39]);
            rrQs_1 var8 = var7.implements_();
            rrQs_1 var9 = var1.class_(var8);
            if (var2 == null || var2.accept(var9)) {
               var5.add(var9);
            }
         }

         var13 = var5.iterator();
      } finally {
         this.synchronized_();
      }

      return var13;
   }

   void class_(rrzY_2 var1) {
      this.new_();

      try {
         rrzi_3 var2 = ((LinkedHashMap)this.break_[protected_[233]]).put(var1, var1);
         if (var2 != null) {
            this.class_(var2);
         }

         if ((Integer)var1.class_[protected_[234]] == catch_[59]
            || (Integer)var1.class_[protected_[235]] == catch_[60]
            || (Integer)var1.class_[protected_[236]] == catch_[61]) {
            rrzi_3 var3 = (rrzi_3)((LinkedHashMap)this.break_[protected_[237]])
               .get(((rrzi_3)this.break_[protected_[238]]).class_(catch_((byte[])var1.protected_[protected_[239]])));
            rrzi_3 var9 = (rrzi_3)var3.protected_[protected_[240]];
            var1.protected_[protected_[241]] = var9;
            var3.protected_[protected_[242]] = var1;
         }

         Boolean var11 = case_[104];
         this.break_[protected_[243]] = var11;
      } finally {
         this.synchronized_();
      }
   }

   public FileChannel class_(byte[] var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      this.class_((Set<? extends OpenOption>)var2);
      boolean var4 = !var2.contains(StandardOpenOption.WRITE) && !var2.contains(StandardOpenOption.APPEND) ? case_[73] : case_[72];
      this.super_();

      rrzj_3 var10;
      try {
         this.continue_();
         rrzY_2 var5 = this.private_(var1);
         if (var4) {
            this.final_();
            if (var5 == null) {
               if (!var2.contains(StandardOpenOption.CREATE) && !var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new NoSuchFileException(this.throws_(var1));
               }
            } else {
               if (var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new FileAlreadyExistsException(this.throws_(var1));
               }

               if (var5.catch_()) {
                  throw new FileAlreadyExistsException("directory <" + this.throws_(var1) + "> exists");
               }
            }

            var2 = new HashSet((Collection)var2);
            var2.remove(StandardOpenOption.CREATE_NEW);
         } else if (var5 == null || var5.catch_()) {
            throw new NoSuchFileException(this.throws_(var1));
         }

         boolean var6 = var5 != null && var5.class_[protected_[121]] == catch_[35] ? case_[74] : case_[75];
         Path var7 = var6 ? (Path)var5.class_[protected_[122]] : this.finally_(var1);
         FileChannel var8 = var7.getFileSystem().provider().newFileChannel(var7, (Set<? extends OpenOption>)var2, var3);
         Object var9 = var6
            ? var5
            : (this.break_[protected_[123]] ? new rrQP((byte[])this, var1, (int)var7, catch_[36], var3) : new rrzY_2(var1, var7, catch_[37], var3));
         if (var4) {
            Integer var16 = Integer.valueOf(catch_[38]);
            ((rrzY_2)var9).class_[protected_[124]] = var16;
            Integer var17 = (Integer)this.break_[protected_[125]];
            ((rrzY_2)var9).class_[protected_[126]] = var17;
         }

         var10 = new rrzj_3(this, var8, var4, (rrzY_2)var9, var6, var7);
      } finally {
         this.this_();
      }

      return var10;
   }

   @Override
   public boolean isOpen() {
      return (Boolean)this.break_[19];
   }

   @Override
   public FileSystemProvider provider() {
      return (rrQB)this.break_[0];
   }

   @Override
   public void close() throws IOException {
      this.new_();

      try {
         if (!(Boolean)this.break_[protected_[48]]) {
            return;
         }

         Boolean var13 = case_[30];
         this.break_[protected_[49]] = var13;
      } finally {
         this.synchronized_();
      }

      if (!((Set)this.break_[17]).isEmpty()) {
         for (InputStream var3 : new HashSet((Set)this.break_[17])) {
            var3.close();
         }
      }

      this.new_();

      try {
         AccessController.doPrivileged((PrivilegedExceptionAction<Void>)(() -> {
            this.finally_();
            return null;
         }));
         ((SeekableByteChannel)this.break_[protected_[52]]).close();
      } catch (PrivilegedActionException var40) {
         throw (IOException)var40.getException();
      } finally {
         this.synchronized_();
      }

      synchronized ((List)this.break_[29]) {
         for (Inflater var50 : (List)this.break_[protected_[54]]) {
            var50.end();
         }
      }

      synchronized ((List)this.break_[30]) {
         for (Deflater var51 : (List)this.break_[protected_[56]]) {
            var51.end();
         }
      }

      this.new_();

      try {
         Object var14 = null;
         this.break_[protected_[57]] = var14;
      } finally {
         this.synchronized_();
      }

      IOException var47 = null;
      synchronized ((Set)this.break_[18]) {
         for (Path var4 : (Set)this.break_[protected_[59]]) {
            try {
               AccessController.doPrivileged((PrivilegedExceptionAction<Boolean>)(() -> Files.deleteIfExists(var4)));
            } catch (PrivilegedActionException var42) {
               IOException var6 = (IOException)var42.getException();
               if (var47 == null) {
                  var47 = var6;
               } else {
                  var47.addSuppressed(var6);
               }
            }
         }
      }

      ((rrQB)this.break_[0]).class_((Path)this.break_[1], this);
      if (var47 != null) {
         throw var47;
      }
   }

   @Override
   public boolean isReadOnly() {
      return (Boolean)this.break_[4];
   }

   public Path break_() {
      return (Path)this.break_[1];
   }

   private void break_(rrzY_2 var1, OutputStream var2) throws IOException {
      if ((byte[])var1.class_[0] != null) {
         var2.write((byte[])var1.class_[0], 0, ((byte[])var1.class_[0]).length);
      } else if ((Path)var1.class_[1] != null) {
         if ((Integer)var1.class_[2] == 2 || (Integer)var1.class_[2] == 3) {
            try (InputStream var3 = Files.newInputStream((Path)var1.class_[1])) {
               var3.transferTo(var2);
            }
         }

         Files.delete((Path)var1.class_[1]);
         ((Set)this.break_[18]).remove((Path)var1.class_[1]);
      }
   }

   OutputStream break_(rrzY_2 var1) throws IOException {
      if ((Long)var1.class_[7] == -1L) {
         Long var7 = System.currentTimeMillis();
         var1.class_[7] = var7;
      }

      if ((Integer)var1.class_[6] == -1) {
         Integer var8 = (Integer)this.break_[10];
         var1.class_[6] = var8;
      }

      Integer var9 = 8;
      var1.class_[4] = var9;
      if (((rrzC_2)this.break_[2]).class_()) {
         Integer var10 = (Integer)var1.class_[4] | 2048;
         var1.class_[4] = var10;
      }

      Object var2;
      if (!(Boolean)this.break_[7] && (Long)var1.class_[12] < 10485760L) {
         var2 = new rrza_3(this, var1);
      } else {
         Path var11 = this.finally_(null);
         var1.class_[1] = var11;
         var2 = Files.newOutputStream((Path)var1.class_[1], StandardOpenOption.WRITE);
      }

      return (OutputStream)(var1.class_[6] == 8 ? new ZipStream(this, var1, (OutputStream)var2) : new rrzD_2(this, var1, (OutputStream)var2));
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707862977;
   }

   public rrzt_3 break_(byte[] var1) throws IOException {
      this.super_();

      Object var4;
      try {
         this.continue_();
         rrzi_3 var2 = this.extends_(var1);
         if (var2 == null) {
            return null;
         }

         if (var2 instanceof rrzY_2 var16) {
            return var16;
         }

         if ((Integer)var2.protected_[protected_[62]] != catch_[13]) {
            return (rrzt_3)(this.break_[protected_[72]] ? new rrQP(this, this, var2) : new rrzY_2(this, var2));
         }

         Object var3 = this.break_[protected_[63]]
            ? new rrQP(this, (byte[])var2.protected_[protected_[64]], (Boolean)var2.protected_[protected_[65]], case_[31])
            : new rrzY_2((byte[])var2.protected_[protected_[66]], (Boolean)var2.protected_[protected_[67]], case_[32]);
         long var10004 = (Long)this.break_[protected_[68]];
         Long var10 = var10004;
         ((rrzY_2)var3).class_[protected_[69]] = var10;
         Long var11 = var10004;
         ((rrzY_2)var3).class_[protected_[70]] = var11;
         Long var12 = var10004;
         ((rrzY_2)var3).class_[protected_[71]] = var12;
         var4 = var3;
      } finally {
         this.this_();
      }

      return (rrzt_3)var4;
   }

   private rrzi_3 break_(byte[] var1, boolean var2) {
      rrzi_3 var3 = this.extends_(var1);
      if (var3 != null) {
         return var3;
      } else {
         var3 = new rrzi_3(var1, var2);
         this.new_();

         rrzi_3 var4;
         try {
            this.byte_(
               var3,
               Objects.requireNonNull((rrzi_3)((LinkedHashMap)this.break_[protected_[300]]).get(rrzi_3.byte_((byte[])class_[protected_[301]])), byte_[68])
            );
            var4 = var3;
         } finally {
            this.synchronized_();
         }

         return var4;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, -29, 27, -110, -31, -87, -64, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Set<PosixFilePermission> break_(Map<String, ?> var1) {
      Object var2 = var1.get("defaultPermissions");
      if (var2 == null) {
         return (Set<PosixFilePermission>)class_[8];
      } else if (var2 instanceof String) {
         return PosixFilePermissions.fromString((String)var2);
      } else if (!(var2 instanceof Set)) {
         throw new IllegalArgumentException("Value for property defaultPermissions must be of type " + String.class + " or " + Set.class);
      } else {
         HashSet var3 = new HashSet();

         for (Object var5 : (Set)var2) {
            if (!(var5 instanceof PosixFilePermission)) {
               throw new IllegalArgumentException("defaultPermissions must only contain objects of type " + PosixFilePermission.class);
            }

            var3.add((PosixFilePermission)var5);
         }

         return var3;
      }
   }

   private void break_(rrzi_3 var1) {
      this.new_();

      try {
         this.class_(var1);
         ((LinkedHashMap)this.break_[protected_[231]]).remove(var1);
         Boolean var7 = case_[103];
         this.break_[protected_[232]] = var7;
      } finally {
         this.synchronized_();
      }
   }

   private UserPrincipal break_(Path var1, Map<String, ?> var2) throws IOException {
      Object var3 = var2.get("defaultOwner");
      if (var3 == null) {
         try {
            PrivilegedExceptionAction var4 = () -> Files.getOwner(var1);
            return AccessController.doPrivileged(var4);
         } catch (PrivilegedActionException | UnsupportedOperationException var7) {
            if (!(var7 instanceof UnsupportedOperationException) && !(var7.getCause() instanceof NoSuchFileException)) {
               throw new IOException(var7);
            } else {
               PrivilegedAction var5 = () -> System.getProperty("user.name");
               String var6 = AccessController.doPrivileged(var5);
               return () -> var6;
            }
         }
      } else if (var3 instanceof String) {
         if (((String)var3).isEmpty()) {
            throw new IllegalArgumentException("Value for property defaultOwner must not be empty.");
         } else {
            return () -> (String)var3;
         }
      } else if (var3 instanceof UserPrincipal) {
         return (UserPrincipal)var3;
      } else {
         throw new IllegalArgumentException("Value for property defaultOwner must be of type " + String.class + " or " + UserPrincipal.class);
      }
   }

   private Integer break_(rrzi_3 var1, rrzi_3 var2) {
      try {
         byte[] var3 = (byte[])var1.protected_[protected_[192]];
         return Integer.parseInt(this.throws_(Arrays.copyOfRange(var3, ((byte[])var2.protected_[protected_[193]]).length + case_[95], var3.length)));
      } catch (NumberFormatException var4) {
         return null;
      }
   }

   public SeekableByteChannel break_(byte[] var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      this.class_(var2);
      if (!var2.contains(StandardOpenOption.WRITE) && !var2.contains(StandardOpenOption.APPEND)) {
         this.super_();

         rrzA_2 var34;
         try {
            this.continue_();
            rrzY_2 var30 = this.private_(var1);
            if (var30 == null || var30.catch_()) {
               throw new NoSuchFileException(this.throws_(var1));
            }

            try (InputStream var32 = this.byte_(var30)) {
               var34 = new rrzA_2(var32.readAllBytes(), case_[71]);
            }
         } finally {
            this.this_();
         }

         return var34;
      } else {
         this.final_();
         this.super_();
         this.continue_();

         rrzK_2 var33;
         try {
            rrzY_2 var4 = this.private_(var1);
            if (var4 == null) {
               if (!var2.contains(StandardOpenOption.CREATE) && !var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new NoSuchFileException(this.throws_(var1));
               }

               this.implements_(var1);
               return new rrzK_2(
                  this,
                  (rrzY_2)(this.break_[protected_[118]]
                     ? new rrQP((byte[])this, (int)var1, (boolean)catch_[33], case_[69], (Integer)this.break_[protected_[119]], var3)
                     : new rrzY_2(var1, catch_[34], case_[70], (Integer)this.break_[protected_[120]], var3))
               );
            }

            if (var4.catch_() || var2.contains(StandardOpenOption.CREATE_NEW)) {
               throw new FileAlreadyExistsException(this.throws_(var1));
            }

            rrzK_2 var5 = new rrzK_2(this, (rrzY_2)(this.break_[protected_[116]] ? new rrQP(this, (rrQP)var4, catch_[30]) : new rrzY_2(var4, catch_[31])));
            if (var2.contains(StandardOpenOption.APPEND)) {
               try (InputStream var6 = this.byte_(var4)) {
                  byte[] var7 = new byte[protected_[117]];
                  ByteBuffer var8 = ByteBuffer.wrap(var7);

                  int var9;
                  while ((var9 = var6.read(var7)) != catch_[32]) {
                     var8.position(case_[68]);
                     var8.limit(var9);
                     var5.write(var8);
                  }
               }
            }

            var33 = var5;
         } finally {
            this.this_();
         }

         return var33;
      }
   }

   private static void throws_() {
      catch_ = new byte[]{
         -1,
         20,
         2,
         47,
         8,
         -1,
         8,
         3,
         2,
         3,
         2,
         47,
         58,
         -1,
         4,
         4,
         -1,
         2,
         2,
         4,
         4,
         2,
         3,
         3,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         -1,
         2,
         2,
         3,
         3,
         3,
         8,
         47,
         47,
         22,
         22,
         80,
         75,
         2,
         5,
         3,
         6,
         22,
         20,
         56,
         22,
         10,
         22,
         8,
         46,
         46,
         22,
         2,
         3,
         4,
         8,
         30,
         47,
         30,
         30,
         -1,
         8,
         2,
         3,
         4,
         -1,
         47,
         -1,
         -1,
         8,
         8,
         2,
         3,
         8,
         20,
         -1,
         20,
         47,
         8,
         31,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         12,
         19,
         23,
         26,
         28,
         20,
         14,
         2,
         3,
         4,
         5,
         6,
         7,
         9,
         10,
         11,
         12,
         13
      };
   }

   void throws_(Path var1) throws IOException {
      Files.delete(var1);
      ((Set)this.break_[18]).remove(var1);
   }

   public String throws_(byte[] var1) {
      return ((rrzC_2)this.break_[2]).class_(var1);
   }

   Path finally_(byte[] var1) throws IOException {
      Path var2 = this.class_((Path)this.break_[1]);
      if (var1 != null) {
         rrzY_2 var3 = this.private_(var1);
         if (var3 != null) {
            try (InputStream var4 = this.byte_(var1)) {
               CopyOption[] var10002 = new CopyOption[case_[76]];
               var10002[case_[77]] = StandardCopyOption.REPLACE_EXISTING;
               Files.copy(var4, var2, var10002);
            }
         }
      }

      return var2;
   }

   private void finally_() throws IOException {
      if ((Boolean)this.break_[26]) {
         PosixFileAttributes var1 = this.case_((Path)this.break_[1]);
         Path var2 = this.class_((Path)this.break_[1]);
         BufferedOutputStream var3 = new BufferedOutputStream(Files.newOutputStream(var2, StandardOpenOption.WRITE));

         try {
            ArrayList var4 = new ArrayList(((LinkedHashMap)this.break_[protected_[273]]).size());
            long var5 = private_[31];
            byte[] var7 = null;
            rrzi_3 var9 = (rrzi_3)((LinkedHashMap)this.break_[protected_[274]]).get(rrzi_3.byte_(this.class_(byte_[66])));
            Iterator var10 = ((LinkedHashMap)this.break_[protected_[275]]).values().iterator();
            boolean var11 = case_[113];

            while (var10.hasNext()) {
               rrzi_3 var12;
               if (var9 == null) {
                  var12 = (rrzi_3)var10.next();
               } else if (var11) {
                  var12 = (rrzi_3)var10.next();
                  if (var12 == var9) {
                     continue;
                  }
               } else {
                  var12 = var9;
                  var11 = case_[114];
               }

               if (var12 instanceof rrzY_2 var8) {
                  try {
                     if ((Integer)var8.class_[protected_[276]] == catch_[71]) {
                        if (var7 == null) {
                           var7 = new byte[protected_[277]];
                        }

                        var5 += this.class_(var8, case_[115], var3, var5, var7);
                     } else {
                        Long var18 = var5;
                        var8.class_[protected_[278]] = var18;
                        var5 += (long)var8.break_(var3);
                        var5 += this.class_(var8, var3);
                     }

                     var4.add(var8);
                  } catch (IOException var25) {
                     var25.printStackTrace();
                  }
               } else if ((Integer)var12.protected_[protected_[279]] != catch_[72]
                  && (((byte[])var12.protected_[protected_[280]]).length != case_[116] || ((byte[])var12.protected_[protected_[281]])[case_[117]] != catch_[73])
                  )
                {
                  Object var27 = this.break_[protected_[282]] ? new rrQP(this, this, var12) : new rrzY_2(this, var12);

                  try {
                     if (var7 == null) {
                        var7 = new byte[protected_[283]];
                     }

                     var5 += this.class_((rrzY_2)var27, case_[118], var3, var5, var7);
                     var4.add(var27);
                  } catch (IOException var24) {
                     var24.printStackTrace();
                  }
               }
            }

            rrzR_2 var10000 = (rrzR_2)this.break_[protected_[284]];
            Long var19 = var5;
            var10000.class_[protected_[285]] = var19;

            for (rrzY_2 var13 : var4) {
               var5 += (long)var13.class_(var3);
            }

            var10000 = (rrzR_2)this.break_[protected_[286]];
            Integer var20 = var4.size();
            var10000.class_[protected_[287]] = var20;
            var10000 = (rrzR_2)this.break_[protected_[288]];
            Long var21 = var5 - (Long)((rrzR_2)this.break_[protected_[289]]).class_[protected_[290]];
            var10000.class_[protected_[291]] = var21;
            ((rrzR_2)this.break_[protected_[292]]).class_(var3, var5, (Boolean)this.break_[protected_[293]]);
         } catch (Throwable var26) {
            try {
               var3.close();
            } catch (Throwable var23) {
               var26.addSuppressed(var23);
            }

            throw var26;
         }

         var3.close();
         ((SeekableByteChannel)this.break_[20]).close();
         Files.delete((Path)this.break_[1]);
         if (var1 != null) {
            Files.setPosixFilePermissions(var2, var1.permissions());
         }

         Files.move(var2, (Path)this.break_[1], StandardCopyOption.REPLACE_EXISTING);
         Boolean var22 = false;
         this.break_[26] = var22;
      }
   }

   private static byte[] catch_(byte[] var0) {
      int var1 = native_(var0);
      return var1 <= 1 ? (byte[])class_[1] : Arrays.copyOf(var0, var1);
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[31];
         Object[] var1 = this.break_;
         var1[4] = false;
         var1[5] = 0L;
         var1[6] = false;
         var1[7] = false;
         var1[8] = 10485760;
         var1[9] = false;
         var1[10] = 0;
         var1[12] = false;
         var1[19] = false;
         var1[23] = 0L;
         var1[26] = false;
         var1[28] = 20;
      }
   }

   private rrzi_3 extends_(byte[] var1) {
      return (rrzi_3)((LinkedHashMap)this.break_[25]).get(rrzi_3.byte_(Objects.requireNonNull((byte[])((Function)this.break_[11]).apply(var1), "path")));
   }

   private static void goto_() {
      byte_ = new String[]{
         new String("encoding"),
         new String("encoding"),
         new String("UTF-8"),
         new String("false"),
         new String("zipinfo-time"),
         new String("useTempFile"),
         new String("forceZIP64End"),
         new String("enablePosixFileAttributes"),
         new String("basic"),
         new String("posix"),
         new String("zip"),
         new String("basic"),
         new String("zip"),
         new String("create"),
         new String("noCompression"),
         new String("compressionMethod"),
         new String("compressionMethod"),
         new String("STORED"),
         new String("DEFLATED"),
         new String("The value for the %s property must be %s or %s"),
         new String("compressionMethod"),
         new String("STORED"),
         new String("DEFLATED"),
         new String("The Object type for the %s property must be a String"),
         new String("compressionMethod"),
         new String("The value for the %s property must be %s or %s"),
         new String("compressionMethod"),
         new String("STORED"),
         new String("DEFLATED"),
         new String("true"),
         new String("defaultOwner"),
         new String("Value for property defaultOwner must not be empty."),
         new String("defaultGroup"),
         new String("Value for property defaultGroup must not be empty."),
         new String("defaultPermissions"),
         new String("/"),
         new String("glob"),
         new String("regex"),
         new String("READ not allowed"),
         new String("APPEND + TRUNCATE_EXISTING not allowed"),
         new String("is a directory"),
         new String("APPEND + TRUNCATE_EXISTING not allowed"),
         new String("zip END header not found"),
         new String("zip END header not found"),
         new String("releaseVersion"),
         new String("releaseVersion"),
         new String("multi-release"),
         new String("runtime"),
         new String("^[1-9][0-9]*$"),
         new String("Invalid runtime version"),
         new String("env parameter must be String, Integer, or Version"),
         new String("/META-INF/MANIFEST.MF"),
         new String("true"),
         new String("/META-INF/versions"),
         new String("invalid END header (bad central directory size)"),
         new String("invalid END header (bad central directory offset)"),
         new String("read CEN tables failed"),
         new String("invalid CEN header (bad signature)"),
         new String("invalid CEN header (encrypted entry)"),
         new String("invalid CEN header (bad header size)"),
         new String("invalid CEN header (bad header size)"),
         new String("invalid CEN header (bad entry name)"),
         new String("invalid CEN header (bad entry name)"),
         new String("."),
         new String("zipfstmp"),
         new String("loc: reading failed"),
         new String("/META-INF/MANIFEST.MF"),
         new String("path"),
         new String("no root node found"),
         new String("root directory </> cannot be deleted"),
         new String("update entry data is missing"),
         new String("invalid compression method"),
         new String("user.name"),
         new String("os.name"),
         new String("Windows"),
         new String("rwxrwxrwx"),
         new String("enablePosixFileAttributes"),
         new String("defaultOwner"),
         new String("defaultGroup"),
         new String("defaultPermissions"),
         new String("releaseVersion"),
         new String("multi-release"),
         new String("compressionMethod"),
         new String("DEFLATED"),
         new String("STORED"),
         new String("glob"),
         new String("regex")
      };
   }

   private PosixFileAttributes case_(Path var1) throws IOException {
      try {
         PosixFileAttributeView var2 = Files.getFileAttributeView(var1, PosixFileAttributeView.class);
         return var2 == null ? null : var2.readAttributes();
      } catch (UnsupportedOperationException var3) {
         return null;
      }
   }

   private boolean case_() throws IOException {
      try {
         boolean var3;
         try (InputStream var1 = this.byte_(this.class_(byte_[51]))) {
            String var2 = new Manifest(var1).getMainAttributes().getValue(Name.MULTI_RELEASE);
            var3 = byte_[52].equalsIgnoreCase(var2);
         }

         return var3;
      } catch (NoSuchFileException var6) {
         return false;
      }
   }

   public boolean case_(byte[] var1) {
      this.super_();

      boolean var2;
      try {
         this.continue_();
         var2 = this.extends_(var1) != null ? case_[35] : case_[36];
      } finally {
         this.this_();
      }

      return var2;
   }

   void continue_() {
      if (!(Boolean)this.break_[19]) {
         throw new ClosedFileSystemException();
      }
   }

   private void else_() {
      this.new_();

      try {
         rrzi_3 var1 = (rrzi_3)((LinkedHashMap)this.break_[protected_[174]])
            .remove(((rrzi_3)this.break_[protected_[175]]).class_((byte[])class_[protected_[176]]));
         if (var1 == null) {
            var1 = new rrzi_3((byte[])class_[protected_[177]], case_[90]);
         }

         rrzi_3[] var2 = ((LinkedHashMap)this.break_[protected_[178]]).values().toArray(new rrzi_3[case_[91]]);
         ((LinkedHashMap)this.break_[protected_[179]]).put(var1, var1);
         rrzi_3[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = case_[92]; var5 < var4; var5++) {
            rrzi_3 var6 = var3[var5];
            this.byte_(var6, var1);
         }
      } finally {
         this.synchronized_();
      }
   }

   private void implements_(byte[] var1) throws IOException {
      this.super_();

      try {
         while ((var1 = catch_(var1)) != null && var1 != (byte[])class_[protected_[129]]) {
            if (!((LinkedHashMap)this.break_[protected_[130]]).containsKey(rrzi_3.byte_(var1))) {
               throw new NoSuchFileException(this.throws_(var1));
            }
         }
      } finally {
         this.this_();
      }
   }

   private rrzR_2 implements_() throws IOException {
      byte[] var1 = new byte[128];
      long var2 = ((SeekableByteChannel)this.break_[20]).size();
      long var4 = var2 - 65557L > 0L ? var2 - 65557L : private_[4];
      long var6 = var4 - (long)(var1.length - 22);

      for (long var8 = var2 - (long)var1.length; var8 >= var6; var8 -= (long)(var1.length - 22)) {
         int var10 = 0;
         if (var8 < 0L) {
            var10 = (int)(-var8);
            Arrays.fill(var1, 0, var10, (byte)0);
         }

         int var11 = var1.length - var10;
         if (this.class_(var1, var10, (long)var11, var8 + (long)var10) != (long)var11) {
            throw new ZipException("zip END header not found");
         }

         for (int var12 = var1.length - 22; var12 >= 0; var12--) {
            if (var1[var12] == 80
               && var1[var12 + 1] == 75
               && var1[var12 + 2] == 5
               && var1[var12 + 3] == 6
               && var8 + (long)var12 + 22L + (long)rrzH_2.class_(var1, var12) == var2) {
               var1 = Arrays.copyOfRange(var1, var12, var12 + 22);
               rrzR_2 var13 = new rrzR_2();
               Integer var28 = rrzH_2.this_(var1);
               var13.class_[0] = var28;
               Long var29 = rrzH_2.finally_(var1);
               var13.class_[1] = var29;
               Long var30 = rrzH_2.super_(var1);
               var13.class_[2] = var30;
               Long var31 = var8 + (long)var12;
               var13.class_[3] = var31;
               byte[] var14 = new byte[20];
               if ((Long)var13.class_[3] >= 20L
                  && this.class_(var14, 0, (long)var14.length, (Long)var13.class_[3] - 20L) == (long)var14.length
                  && rrzH_2.package_(var14, 0)) {
                  long var15 = rrzH_2.private_(var14);
                  byte[] var17 = new byte[56];
                  if (this.class_(var17, 0, (long)var17.length, var15) == (long)var17.length && rrzH_2.native_(var17, 0)) {
                     long var18 = rrzH_2.throws_(var17);
                     long var20 = rrzH_2.int_(var17);
                     long var22 = rrzH_2.package_(var17);
                     if ((var18 == (Long)var13.class_[1] || (Long)var13.class_[1] == 4294967295L)
                        && (var20 == (Long)var13.class_[2] || (Long)var13.class_[2] == 4294967295L)
                        && (var22 == (long)((Integer)var13.class_[0]).intValue() || (Integer)var13.class_[0] == 65535)) {
                        Long var32 = var18;
                        var13.class_[1] = var32;
                        Long var33 = var20;
                        var13.class_[2] = var33;
                        Integer var34 = (int)var22;
                        var13.class_[0] = var34;
                        Long var35 = var15;
                        var13.class_[3] = var35;
                        return var13;
                     }

                     return var13;
                  }

                  return var13;
               }

               return var13;
            }
         }
      }

      throw new ZipException("zip END header not found");
   }

   private void new_() {
      ((ReadWriteLock)this.break_[24]).writeLock().lock();
   }

   private static void return_() {
      private_ = new long[]{
         0L,
         65557L,
         0L,
         65557L,
         0L,
         0L,
         22L,
         20L,
         20L,
         4294967295L,
         4294967295L,
         0L,
         0L,
         0L,
         22L,
         22L,
         0L,
         4294967295L,
         4294967295L,
         24L,
         16L,
         31L,
         31L,
         30L,
         30L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L,
         -1L,
         10485760L,
         2L,
         65536L,
         8192L,
         0L,
         0L
      };
   }

   private void super_() {
      ((ReadWriteLock)this.break_[24]).readLock().lock();
   }

   private byte[] try_() throws IOException {
      rrzR_2 var16 = this.implements_();
      this.break_[22] = var16;
      if ((Long)((rrzR_2)this.break_[22]).class_[3] == 0L) {
         LinkedHashMap var17 = new LinkedHashMap(10);
         this.break_[25] = var17;
         Long var18 = 0L;
         this.break_[23] = var18;
         this.else_();
         return null;
      } else if ((Long)((rrzR_2)this.break_[22]).class_[1] > (Long)((rrzR_2)this.break_[22]).class_[3]) {
         throw new ZipException("invalid END header (bad central directory size)");
      } else {
         long var1 = (Long)((rrzR_2)this.break_[22]).class_[3] - (Long)((rrzR_2)this.break_[22]).class_[1];
         Long var19 = var1 - (Long)((rrzR_2)this.break_[22]).class_[2];
         this.break_[23] = var19;
         if ((Long)this.break_[23] < 0L) {
            throw new ZipException("invalid END header (bad central directory offset)");
         } else {
            byte[] var3 = new byte[(int)(((rrzR_2)this.break_[22]).class_[1] + 22L)];
            if (this.class_(var3, 0, (long)var3.length, var1) != (Long)((rrzR_2)this.break_[22]).class_[1] + 22L) {
               throw new ZipException("read CEN tables failed");
            } else {
               LinkedHashMap var20 = new LinkedHashMap((Integer)((rrzR_2)this.break_[22]).class_[0] + 1);
               this.break_[25] = var20;
               int var4 = 0;
               int var5 = var3.length - 22;

               while (var4 < var5) {
                  if (!rrzH_2.break_(var3, var4)) {
                     throw new ZipException("invalid CEN header (bad signature)");
                  }

                  int var6 = rrzH_2.synchronized_(var3, var4);
                  int var7 = rrzH_2.super_(var3, var4);
                  int var8 = rrzH_2.instanceof_(var3, var4);
                  int var9 = rrzH_2.implements_(var3, var4);
                  int var10 = rrzH_2.else_(var3, var4);
                  if ((var10 & 1) != 0) {
                     throw new ZipException("invalid CEN header (encrypted entry)");
                  }

                  if (var6 != 0 && var6 != 8) {
                     throw new ZipException("invalid CEN header (unsupported compression method: " + var6 + ")");
                  }

                  if (var4 + 46 + var7 > var5) {
                     throw new ZipException("invalid CEN header (bad header size)");
                  }

                  rrzi_3 var11 = new rrzi_3(var3, var4, var7);
                  if (var11.protected_()) {
                     throw new ZipException(
                        "ZIP file can't be opened as a file system because entry \"" + var11.private_() + "\" has a '.' or '..' element in its name"
                     );
                  }

                  ((LinkedHashMap)this.break_[25]).put(var11, var11);
                  if (!((rrzC_2)this.break_[2]).class_() && (var10 & 2048) == 0) {
                     this.final_((byte[])var11.protected_[0]);
                  } else {
                     this.volatile_((byte[])var11.protected_[0]);
                  }

                  var4 += 46 + var7 + var8 + var9;
               }

               if (var4 + 22 != var3.length) {
                  throw new ZipException("invalid CEN header (bad header size)");
               } else {
                  this.else_();
                  return var3;
               }
            }
         }
      }
   }

   Deflater while_() {
      synchronized ((List)this.break_[30]) {
         int var2 = ((List)this.break_[protected_[339]]).size();
         return var2 > 0 ? (Deflater)((List)this.break_[protected_[340]]).remove(var2 - case_[129]) : new Deflater(catch_[82], case_[130]);
      }
   }

   private static void protected_() {
      throws_ = new int[]{10485760, 65535, 10485760};
   }

   public boolean protected_(byte[] var1) {
      this.super_();

      boolean var3;
      try {
         rrzi_3 var2 = this.extends_(var1);
         var3 = var2 != null && var2.catch_() ? case_[37] : case_[38];
      } finally {
         this.this_();
      }

      return var3;
   }

   private static void private_() {
      case_ = new boolean[]{
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   rrzY_2 private_(byte[] var1) throws IOException {
      rrzi_3 var2 = this.extends_(var1);
      if (var2 instanceof rrzY_2) {
         return (rrzY_2)var2;
      } else if (var2 != null && (Integer)var2.protected_[3] != -1) {
         return (rrzY_2)(this.break_[12] ? new rrQP(this, this, var2) : new rrzY_2(this, var2));
      } else {
         return null;
      }
   }

   private void final_() {
      if ((Boolean)this.break_[4]) {
         throw new ReadOnlyFileSystemException();
      }
   }

   private final void final_(byte[] var1) throws ZipException {
      try {
         ((rrzC_2)this.break_[protected_[228]]).class_(var1);
      } catch (Exception var3) {
         throw new ZipException("invalid CEN header (bad entry name)");
      }
   }

   private final void volatile_(byte[] var1) throws ZipException {
      try {
         int var2 = var1.length;

         for (int var3 = case_[100]; var3 < var2; var3++) {
            if (var1[var3] < 0) {
               ((rrzC_2)this.break_[protected_[227]]).class_(Arrays.copyOfRange(var1, var3, var1.length));
               break;
            }
         }
      } catch (Exception var4) {
         throw new ZipException("invalid CEN header (bad entry name)");
      }
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{
         true,
         new byte[]{47},
         "enablePosixFileAttributes",
         "defaultOwner",
         "defaultGroup",
         "defaultPermissions",
         "releaseVersion",
         "multi-release",
         PosixFilePermissions.fromString("rwxrwxrwx"),
         "compressionMethod",
         "DEFLATED",
         "STORED",
         "glob",
         "regex"
      };
      class_ = var0;
   }

   private void synchronized_() {
      ((ReadWriteLock)this.break_[24]).writeLock().unlock();
   }

   private Inflater native_() {
      synchronized ((List)this.break_[29]) {
         int var2 = ((List)this.break_[protected_[333]]).size();
         return var2 > 0 ? (Inflater)((List)this.break_[protected_[334]]).remove(var2 - case_[127]) : new Inflater(case_[128]);
      }
   }

   private static int native_(byte[] var0) {
      int var1 = var0.length - 1;
      if (var1 > 0 && var0[var1] == 47) {
         var1--;
      }

      while (var1 > 0 && var0[var1] != 47) {
         var1--;
      }

      return var1;
   }

   @Override
   public Set<String> supportedFileAttributeViews() {
      return (Set<String>)this.break_[16];
   }

   @Override
   public Iterable<Path> getRootDirectories() {
      return List.of((rrQs_1)this.break_[3]);
   }

   @Override
   public Iterable<FileStore> getFileStores() {
      return List.of(new rrzw_3((rrQs_1)this.break_[3]));
   }

   @Override
   public UserPrincipalLookupService getUserPrincipalLookupService() {
      throw new UnsupportedOperationException();
   }

   @Override
   public PathMatcher getPathMatcher(String var1) {
      int var2 = var1.indexOf(58);
      if (var2 > 0 && var2 != var1.length()) {
         String var3 = var1.substring(0, var2);
         String var4 = var1.substring(var2 + 1);
         String var5;
         if (var3.equalsIgnoreCase("glob")) {
            var5 = rrQO.class_(var4);
         } else {
            if (!var3.equalsIgnoreCase("regex")) {
               throw new UnsupportedOperationException("Syntax '" + var3 + "' not recognized");
            }

            var5 = var4;
         }

         Pattern var6 = Pattern.compile(var5);
         return var1x -> var6.matcher(var1x.toString()).matches();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public WatchService newWatchService() {
      throw new UnsupportedOperationException();
   }

   @Override
   public String getSeparator() {
      return "/";
   }
}
