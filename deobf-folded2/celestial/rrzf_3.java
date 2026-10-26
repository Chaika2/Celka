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
   public static Object[] id_class;
   private static String[] id_byte;
   private static short[] id_protected;
   private static int[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;
   public Object[] id_break;
   private static long[] id_private;

   private void id_byte(rrzi_3 var1, rrzi_3 var2) {
      rrQr_1 var4 = new rrQr_1();

      while (true) {
         int var5 = id_native((byte[])var1.id_protected[0]);
         if (var5 <= 1) {
            rrzi_3 var10 = (rrzi_3)var2.id_protected[4];
            var1.id_protected[5] = var10;
            var2.id_protected[4] = var1;
            break;
         }

         var4 = var4.id_class((byte[])var1.id_protected[0], var5);
         if (((LinkedHashMap)this.id_break[25]).containsKey(var4)) {
            rrzi_3 var16 = (rrzi_3)((LinkedHashMap)this.id_break[25]).get(var4);
            rrzi_3 var12 = (rrzi_3)var16.id_protected[4];
            var1.id_protected[5] = var12;
            var16.id_protected[4] = var1;
            break;
         }

         rrzi_3 var3 = new rrzi_3(Arrays.copyOf((byte[])var1.id_protected[0], var5), true);
         ((LinkedHashMap)this.id_break[25]).put(var3, var3);
         rrzi_3 var14 = (rrzi_3)var3.id_protected[4];
         var1.id_protected[5] = var14;
         var3.id_protected[4] = var1;
         var1 = var3;
      }
   }

   private InputStream id_byte(rrzY_2 var1) throws IOException {
      Object var2;
      if ((Integer)var1.id_class[2] == 2) {
         if ((byte[])var1.id_class[0] != null) {
            var2 = new ByteArrayInputStream((byte[])var1.id_class[0]);
         } else {
            if ((Path)var1.id_class[1] == null) {
               throw new ZipException("update entry data is missing");
            }

            var2 = Files.newInputStream((Path)var1.id_class[1]);
         }
      } else {
         if ((Integer)var1.id_class[2] == 3) {
            return Files.newInputStream((Path)var1.id_class[1]);
         }

         var2 = new rrzo_3(this, var1);
      }

      if ((Integer)var1.id_class[6] == 8) {
         long var3 = (Long)var1.id_class[12] + 2L;
         if (var3 > 65536L) {
            var3 = 8192L;
         }

         long var5 = (Long)var1.id_class[12];
         var2 = new rrzV_2(this, (InputStream)var2, this.id_native(), (int)var3, var5);
      } else if ((Integer)var1.id_class[6] != 0) {
         throw new ZipException("invalid compression method");
      }

      ((Set)this.id_break[17]).add(var2);
      return (InputStream)var2;
   }

   private int id_byte(Map<String, ?> var1) {
      byte var2 = id_class(var1, "noCompression") ? 0 : id_catch[4];
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
               var2 = id_case[16];
               break;
            case "DEFLATED":
               var2 = id_catch[6];
               break;
            default:
               throw new IllegalArgumentException(String.format("The value for the %s property must be %s or %s", "compressionMethod", "STORED", "DEFLATED"));
         }
      }

      return var2;
   }

   public InputStream id_byte(byte[] var1) throws IOException {
      this.id_super();

      InputStream var3;
      try {
         this.id_continue();
         rrzY_2 var2 = this.id_private(var1);
         if (var2 == null) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         if (var2.id_catch()) {
            throw new FileSystemException(this.id_throws(var1), id_byte[40], null);
         }

         var3 = this.id_byte(var2);
      } finally {
         this.id_this();
      }

      return var3;
   }

   public void id_byte() {
      Boolean var5 = true;
      this.id_break[4] = var5;
   }

   private static void id_int() {
      id_protected = new short[]{
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
      this.id_catch();
      Long var12 = System.currentTimeMillis();
      this.id_break[5] = var12;
      Integer var13 = 10485760;
      this.id_break[8] = var13;
      Function var14 = Function.identity();
      this.id_break[11] = var14;
      Set var15 = Collections.synchronizedSet(new HashSet());
      this.id_break[17] = var15;
      Set var16 = Collections.synchronizedSet(new HashSet());
      this.id_break[18] = var16;
      Boolean var17 = true;
      this.id_break[19] = var17;
      ReentrantReadWriteLock var18 = new ReentrantReadWriteLock();
      this.id_break[24] = var18;
      Boolean var19 = false;
      this.id_break[26] = var19;
      rrzi_3 var20 = new rrzi_3(null, -1);
      this.id_break[27] = var20;
      Integer var21 = 20;
      this.id_break[28] = var21;
      ArrayList var22 = new ArrayList();
      this.id_break[29] = var22;
      ArrayList var23 = new ArrayList();
      this.id_break[30] = var23;
      String var4 = var3.containsKey("encoding") ? (String)var3.get("encoding") : id_byte[2];
      Boolean var24 = "false".equals(var3.get("zipinfo-time"));
      this.id_break[6] = var24;
      Boolean var25 = id_class(var3, "useTempFile");
      this.id_break[7] = var25;
      Boolean var26 = id_class(var3, "forceZIP64End");
      this.id_break[9] = var26;
      Integer var27 = this.id_byte(var3);
      this.id_break[10] = var27;
      Boolean var28 = id_class(var3, "enablePosixFileAttributes");
      this.id_break[12] = var28;
      UserPrincipal var29 = this.id_break[12] ? this.id_break(var2, var3) : null;
      this.id_break[13] = var29;
      GroupPrincipal var30 = this.id_break[12] ? this.id_class(var2, var3) : null;
      this.id_break[14] = var30;
      Set var31 = this.id_break[12] ? this.id_break(var3) : null;
      this.id_break[15] = var31;
      Set var32 = this.id_break[12] ? Set.of("basic", "posix", "zip") : Set.of(id_byte[11], "zip");
      this.id_break[16] = var32;
      if (Files.notExists(var2)) {
         if (!id_class(var3, "create")) {
            throw new NoSuchFileException(var2.toString());
         }

         try (OutputStream var5 = Files.newOutputStream(var2, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE)) {
            new rrzR_2().id_class(var5, id_private[0], (Boolean)this.id_break[id_protected[25]]);
         }
      }

      var2.getFileSystem().provider().checkAccess(var2, AccessMode.READ);
      boolean var44 = AccessController.doPrivileged((PrivilegedAction<Boolean>)(() -> Files.isWritable(var2)));
      Boolean var33 = !var44 ? true : id_case[8];
      this.id_break[4] = var33;
      rrzC_2 var34 = rrzC_2.id_class(var4);
      this.id_break[2] = var34;
      rrQs_1 var35 = new rrQs_1(this, new byte[]{47});
      this.id_break[3] = var35;
      SeekableByteChannel var36 = Files.newByteChannel(var2, StandardOpenOption.READ);
      this.id_break[20] = var36;

      try {
         byte[] var37 = this.id_try();
         this.id_break[id_protected[30]] = var37;
      } catch (IOException var42) {
         try {
            ((SeekableByteChannel)this.id_break[id_protected[31]]).close();
         } catch (IOException var40) {
            var42.addSuppressed(var40);
         }

         throw var42;
      }

      this.id_break[0] = var1;
      this.id_break[1] = var2;
      this.id_class(var3);
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
      return ((Path)this.id_break[1]).toString();
   }

   private void id_this() {
      ((ReadWriteLock)this.id_break[24]).readLock().unlock();
   }

   private static boolean id_class(Map<String, ?> var0, String var1) {
      return !"true".equals(var0.get(var1)) && !Boolean.TRUE.equals(var0.get(var1)) ? id_case[24] : id_case[23];
   }

   public rrQs_1 id_class(String var1, String... var2) {
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

   public void id_class(byte[] var1, FileTime var2, FileTime var3, FileTime var4) throws IOException {
      this.id_final();
      this.id_new();

      try {
         this.id_continue();
         rrzY_2 var5 = this.id_private(var1);
         if (var5 == null) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         if ((Integer)var5.id_class[id_protected[73]] == id_case[33]) {
            Integer var11 = Integer.valueOf(id_catch[14]);
            var5.id_class[id_protected[74]] = var11;
         }

         if (var2 != null) {
            Long var12 = var2.toMillis();
            var5.id_class[id_protected[75]] = var12;
         }

         if (var3 != null) {
            Long var13 = var3.toMillis();
            var5.id_class[id_protected[76]] = var13;
         }

         if (var4 != null) {
            Long var14 = var4.toMillis();
            var5.id_class[id_protected[77]] = var14;
         }

         this.id_class(var5);
      } finally {
         this.id_synchronized();
      }
   }

   public void id_class(byte[] var1, FileAttribute<?>... var2) throws IOException {
      this.id_final();
      this.id_new();

      try {
         this.id_continue();
         if (var1.length == 0 || this.id_case(var1)) {
            throw new FileAlreadyExistsException(this.id_throws(var1));
         }

         this.id_implements(var1);
         Object var3 = this.id_break[id_protected[86]]
            ? new rrQP((byte[])this, (int)var1, (boolean)id_catch[17], id_case[40], id_case[41], var2)
            : new rrzY_2(var1, id_catch[18], id_case[42], id_case[43], var2);
         this.id_class((rrzY_2)var3);
      } finally {
         this.id_synchronized();
      }
   }

   private long id_class(rrzY_2 var1, boolean var2, OutputStream var3, long var4, byte[] var6) throws IOException {
      long var7 = (Long)var1.id_class[14];
      Long var16 = var4;
      var1.id_class[14] = var16;
      long var9 = 0L;
      if (((Integer)var1.id_class[4] & 8) != 0) {
         if ((Long)var1.id_class[12] < 4294967295L && (Long)var1.id_class[11] < 4294967295L) {
            var9 = id_private[20];
         } else {
            var9 = id_private[19];
         }
      }

      if (this.id_class(var6, 0, 31L, var7) != 31L) {
         throw new ZipException("loc: reading failed");
      } else {
         if (!var2 && (rrzH_2.id_extends(var6) <= 0 || var6[30] != 47)) {
            var3.write(var6, 0, 30);
            var7 += 30L;
            var9 += (long)(rrzH_2.id_extends(var6) + rrzH_2.id_volatile(var6)) + var1.id_class[11];
            var4 = 30L + var9;
         } else {
            var7 += (long)(30 + rrzH_2.id_extends(var6) + rrzH_2.id_volatile(var6));
            var9 += var1.id_class[11];
            var4 = (long)var1.id_break(var3) + var9;
         }

         int var11;
         while (var9 > 0L && (var11 = (int)this.id_class(var6, 0, (long)var6.length, var7)) != -1) {
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

   public void id_class(byte[] var1, GroupPrincipal var2) throws IOException {
      this.id_final();
      this.id_new();

      try {
         this.id_continue();
         rrzY_2 var3 = this.id_private(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         if (var3 instanceof rrQP) {
            ((rrQP)var3).id_throws[id_protected[79]] = var2;
            this.id_class(var3);
         }
      } finally {
         this.id_synchronized();
      }
   }

   private Path id_class(Path var1) throws IOException {
      Path var2 = var1.toAbsolutePath().getParent();
      Path var3 = var2 == null ? var1.getFileSystem().getPath(".") : var2;
      Path var4 = Files.createTempFile(var3, "zipfstmp", null);
      ((Set)this.id_break[18]).add(var4);
      return var4;
   }

   public void id_class(byte[] var1, boolean var2) throws IOException {
      this.id_final();
      rrzi_3 var3 = this.id_extends(var1);
      if (var3 == null) {
         if (var1 != null && var1.length == 0) {
            throw new ZipException("root directory </> cannot be deleted");
         }

         if (var2) {
            throw new NoSuchFileException(this.id_throws(var1));
         }
      } else {
         if (var3.id_catch() && (rrzi_3)var3.id_protected[4] != null) {
            throw new DirectoryNotEmptyException(this.id_throws(var1));
         }

         this.id_break(var3);
      }
   }

   public OutputStream id_class(byte[] var1, OpenOption... var2) throws IOException {
      this.id_final();
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
         this.id_super();

         OutputStream var24;
         try {
            this.id_continue();
            rrzY_2 var19 = this.id_private(var1);
            if (var19 == null) {
               if (!var4 && !var3) {
                  throw new NoSuchFileException(this.id_throws(var1));
               }

               this.id_implements(var1);
               return this.id_break(
                  (rrzY_2)(this.id_break[id_protected[113]]
                     ? new rrQP((byte[])this, (int)var1, (boolean)id_catch[28], id_case[64], (Integer)this.id_break[id_protected[114]])
                     : new rrzY_2(var1, id_catch[29], id_case[66], (Integer)this.id_break[id_protected[115]]))
               );
            }

            if (var19.id_catch() || var3) {
               throw new FileAlreadyExistsException(this.id_throws(var1));
            }

            if (!var5) {
               return this.id_break(
                  (rrzY_2)(this.id_break[id_protected[110]]
                     ? new rrQP(this, (rrQP)var19, id_catch[26], (Integer)this.id_break[id_protected[111]])
                     : new rrzY_2(var19, id_catch[27], (Integer)this.id_break[id_protected[112]]))
               );
            }

            OutputStream var20 = this.id_break(new rrzY_2(var19, id_catch[25]));

            try (InputStream var23 = this.id_byte(var19)) {
               var23.transferTo(var20);
            }

            var24 = var20;
         } finally {
            this.id_this();
         }

         return var24;
      }
   }

   private void id_class(rrzi_3 var1, Consumer<rrzi_3> var2) {
      if (var1 != null) {
         if (var1.id_catch()) {
            this.id_class((rrzi_3)var1.id_protected[4], var2);
         } else {
            var2.accept(var1);
         }

         this.id_class((rrzi_3)var1.id_protected[5], var2);
      }
   }

   private TreeMap<Integer, rrzi_3> id_class(int var1, rrzi_3 var2) {
      TreeMap var3 = new TreeMap();

      for (rrzi_3 var4 = (rrzi_3)var2.id_protected[4]; var4 != null; var4 = (rrzi_3)var4.id_protected[5]) {
         Integer var5 = this.id_break(var4, var2);
         if (var5 != null && var5 <= var1) {
            var3.put(var5, var4);
         }
      }

      return var3;
   }

   public void id_class(byte[] var1) throws IOException {
      this.id_super();

      try {
         this.id_continue();
         if (this.id_extends(var1) == null) {
            throw new NoSuchFileException(this.toString());
         }
      } finally {
         this.id_this();
      }
   }

   long id_class(ByteBuffer var1, long var2) throws IOException {
      SeekableByteChannel var5 = (SeekableByteChannel)this.id_break[20];
      if (var5 instanceof FileChannel var4) {
         return (long)var4.read(var1, var2);
      } else {
         synchronized ((SeekableByteChannel)this.id_break[20]) {
            return (long)((SeekableByteChannel)this.id_break[id_protected[140]]).position(var2).read(var1);
         }
      }
   }

   private long id_class(rrzY_2 var1, OutputStream var2) throws IOException {
      if ((byte[])var1.id_class[0] == null && (Path)var1.id_class[1] == null) {
         return 0L;
      } else {
         long var3 = id_private[27];
         if ((Integer)var1.id_class[6] == 0 || (Long)var1.id_class[11] <= 0L || (Long)var1.id_class[10] == 0L && (Long)var1.id_class[12] != 0L) {
            try (Object var5 = var1.id_class[6] == 0 ? new rrzU_2(this, var1, var2) : new rrze_3(this, var1, var2)) {
               this.id_break(var1, (OutputStream)var5);
            }
         } else {
            this.id_break(var1, var2);
         }

         var3 += var1.id_class[11];
         if (((Integer)var1.id_class[4] & 8) != 0) {
            var3 += (long)var1.id_byte(var2);
         }

         return var3;
      }
   }

   private void id_class(rrzi_3 var1) {
      rrzi_3 var2 = (rrzi_3)((LinkedHashMap)this.id_break[25]).get(((rrzi_3)this.id_break[27]).id_class(id_catch((byte[])var1.id_protected[0])));
      rrzi_3 var3 = (rrzi_3)var2.id_protected[4];
      if (var3.equals(var1)) {
         rrzi_3 var9 = (rrzi_3)var3.id_protected[5];
         var2.id_protected[4] = var9;
      } else {
         for (rrzi_3 var4 = var3; (var3 = (rrzi_3)var3.id_protected[5]) != null; var4 = var3) {
            if (var3.equals(var1)) {
               rrzi_3 var10 = (rrzi_3)var3.id_protected[5];
               var4.id_protected[5] = var10;
               break;
            }
         }
      }
   }

   public long id_class(byte[] var1, int var2, long var3, long var5) throws IOException {
      ByteBuffer var7 = ByteBuffer.wrap(var1);
      var7.position(var2);
      var7.limit((int)((long)var2 + var3));
      return this.id_class(var7, var5);
   }

   private void id_class(int var1) {
      rrzi_3 var2 = this.id_extends(this.id_class("/META-INF/versions"));
      if (var2 != null) {
         HashMap var3 = new HashMap();
         this.id_class(var1, var2)
            .values()
            .forEach(
               var2x -> this.id_class(
                     (rrzi_3)var2x.id_protected[4],
                     var3x -> var3.put(this.id_break(this.id_class(var3x, var2x), (Boolean)var3x.id_protected[2]), (byte[])var3x.id_protected[0])
                  )
            );
         Function var8 = var1x -> {
            byte[] var2x = (byte[])var3.get(rrzi_3.id_byte(var1x));
            return var2x == null ? var1x : var2x;
         };
         this.id_break[11] = var8;
      }
   }

   private GroupPrincipal id_class(Path var1, Map<String, ?> var2) throws IOException {
      Object var3 = var2.get("defaultGroup");
      if (var3 == null) {
         try {
            PosixFileAttributeView var4 = Files.getFileAttributeView(var1, PosixFileAttributeView.class);
            if (var4 == null) {
               return ((UserPrincipal)this.id_break[id_protected[34]])::getName;
            } else {
               PrivilegedExceptionAction var5 = () -> var4.readAttributes().group();
               return AccessController.doPrivileged(var5);
            }
         } catch (PrivilegedActionException | UnsupportedOperationException var6) {
            if (!(var6 instanceof UnsupportedOperationException) && !(var6.getCause() instanceof NoSuchFileException)) {
               throw new IOException(var6);
            } else {
               return ((UserPrincipal)this.id_break[13])::getName;
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

   public byte[] id_class(String var1) {
      return ((rrzC_2)this.id_break[2]).id_byte(var1);
   }

   public FileStore id_class(rrQs_1 var1) {
      return new rrzw_3(var1);
   }

   public void id_class(byte[] var1, UserPrincipal var2) throws IOException {
      this.id_final();
      this.id_new();

      try {
         this.id_continue();
         rrzY_2 var3 = this.id_private(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         if (var3 instanceof rrQP) {
            ((rrQP)var3).id_throws[id_protected[78]] = var2;
            this.id_class(var3);
         }
      } finally {
         this.id_synchronized();
      }
   }

   private void id_class(Map<String, ?> var1) throws IOException {
      Object var2 = var1.containsKey("releaseVersion") ? var1.get("releaseVersion") : var1.get("multi-release");
      if (var2 != null && this.id_case()) {
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

         this.id_class(var3 < 0 ? 0 : var3);
         this.id_byte();
      }
   }

   void id_class(Inflater var1) {
      synchronized ((List)this.id_break[29]) {
         if (((List)this.id_break[id_protected[336]]).size() < id_catch[81]) {
            var1.reset();
            ((List)this.id_break[id_protected[337]]).add(var1);
         } else {
            var1.end();
         }
      }
   }

   private byte[] id_class(rrzi_3 var1, rrzi_3 var2) {
      byte[] var3 = (byte[])var1.id_protected[0];
      return Arrays.copyOfRange(var3, ((byte[])var2.id_protected[0]).length, var3.length);
   }

   public void id_class(boolean var1, byte[] var2, byte[] var3, CopyOption... var4) throws IOException {
      this.id_final();
      if (!Arrays.equals(var2, var3)) {
         this.id_new();

         try {
            this.id_continue();
            rrzY_2 var5 = this.id_private(var2);
            if (var5 == null) {
               throw new NoSuchFileException(this.id_throws(var2));
            }

            if (!var5.id_catch()) {
               boolean var6 = id_case[45];
               boolean var7 = id_case[46];
               CopyOption[] var8 = var4;
               int var9 = var4.length;

               for (int var10 = id_case[47]; var10 < var9; var10++) {
                  CopyOption var11 = var8[var10];
                  if (var11 == StandardCopyOption.REPLACE_EXISTING) {
                     var6 = id_case[48];
                  } else if (var11 == StandardCopyOption.COPY_ATTRIBUTES) {
                     var7 = id_case[49];
                  }
               }

               rrzY_2 var37 = this.id_private(var3);
               if (var37 != null) {
                  if (!var6) {
                     throw new FileAlreadyExistsException(this.id_throws(var3));
                  }
               } else {
                  this.id_implements(var3);
               }

               Object var38 = this.id_break[id_protected[87]] ? new rrQP(this, (rrQP)var5, id_catch[19]) : new rrzY_2(var5, id_catch[20]);
               ((rrzY_2)var38).id_break(var3);
               if ((Integer)var5.id_class[id_protected[88]] != id_catch[21] && (Integer)var5.id_class[id_protected[89]] != id_catch[22]) {
                  if ((Integer)var5.id_class[id_protected[104]] == id_case[52]
                     && (Integer)var5.id_class[id_protected[105]] != (Integer)this.id_break[id_protected[106]]) {
                     try (InputStream var39 = this.id_byte(var2)) {
                        OpenOption[] var41 = new OpenOption[id_catch[23]];
                        var41[id_case[53]] = StandardOpenOption.CREATE;
                        var41[id_case[54]] = StandardOpenOption.TRUNCATE_EXISTING;
                        var41[id_catch[24]] = StandardOpenOption.WRITE;

                        try (OutputStream var40 = this.id_class(var3, var41)) {
                           var39.transferTo(var40);
                        }
                     }

                     var38 = this.id_private(var3);
                  }
               } else {
                  Integer var19 = (Integer)var5.id_class[id_protected[90]];
                  ((rrzY_2)var38).id_class[id_protected[91]] = var19;
                  if (var1) {
                     byte[] var20 = (byte[])var5.id_class[id_protected[92]];
                     ((rrzY_2)var38).id_class[id_protected[93]] = var20;
                     Path var21 = (Path)var5.id_class[id_protected[94]];
                     ((rrzY_2)var38).id_class[id_protected[95]] = var21;
                  } else if ((byte[])var5.id_class[id_protected[96]] != null) {
                     byte[] var22 = Arrays.copyOf((byte[])var5.id_class[id_protected[97]], ((byte[])var5.id_class[id_protected[98]]).length);
                     ((rrzY_2)var38).id_class[id_protected[99]] = var22;
                  } else if ((Path)var5.id_class[id_protected[100]] != null) {
                     Path var23 = this.id_finally(null);
                     ((rrzY_2)var38).id_class[id_protected[101]] = var23;
                     Path var10000 = (Path)var5.id_class[id_protected[102]];
                     Path var10001 = (Path)((rrzY_2)var38).id_class[id_protected[103]];
                     CopyOption[] var10002 = new CopyOption[id_case[50]];
                     var10002[id_case[51]] = StandardCopyOption.REPLACE_EXISTING;
                     Files.copy(var10000, var10001, var10002);
                  }
               }

               if (!var7) {
                  long var10004 = System.currentTimeMillis();
                  Long var24 = var10004;
                  ((rrzY_2)var38).id_class[id_protected[107]] = var24;
                  Long var25 = var10004;
                  ((rrzY_2)var38).id_class[id_protected[108]] = var25;
                  Long var26 = var10004;
                  ((rrzY_2)var38).id_class[id_protected[109]] = var26;
               }

               this.id_class((rrzY_2)var38);
               if (var1) {
                  this.id_break((rrzi_3)var5);
               }

               return;
            }

            this.id_class(var3);
         } finally {
            this.id_synchronized();
         }
      }
   }

   private void id_class(Set<? extends OpenOption> var1) {
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

   public void id_class(byte[] var1, Set<PosixFilePermission> var2) throws IOException {
      this.id_final();
      this.id_new();

      try {
         this.id_continue();
         rrzY_2 var3 = this.id_private(var1);
         if (var3 == null) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         if ((Integer)var3.id_class[id_protected[80]] == id_case[34]) {
            Integer var9 = Integer.valueOf(id_catch[15]);
            var3.id_class[id_protected[81]] = var9;
         }

         Integer var10 = var2 == null ? id_catch[16] : rrQO.id_class(var2);
         var3.id_class[id_protected[82]] = var10;
         this.id_class(var3);
      } finally {
         this.id_synchronized();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2210819011692631268L;
   }

   public rrQs_1 id_class() {
      return (rrQs_1)this.id_break[3];
   }

   void id_class(Deflater var1) {
      synchronized ((List)this.id_break[30]) {
         if (((List)this.id_break[id_protected[342]]).size() < id_catch[83]) {
            var1.reset();
            ((List)this.id_break[id_protected[343]]).add(var1);
         } else {
            var1.end();
         }
      }
   }

   public Iterator<Path> id_class(rrQs_1 var1, Filter<? super Path> var2) throws IOException {
      this.id_new();

      Iterator var13;
      try {
         this.id_continue();
         byte[] var3 = var1.id_throws();
         rrzi_3 var4 = this.id_extends(var3);
         if (var4 == null) {
            throw new NotDirectoryException(this.id_throws(var3));
         }

         ArrayList var5 = new ArrayList();

         for (rrzi_3 var6 = (rrzi_3)var4.id_protected[id_protected[83]]; var6 != null; var6 = (rrzi_3)var6.id_protected[id_protected[85]]) {
            rrQs_1 var7 = new rrQs_1(this, (byte[])var6.id_protected[id_protected[84]], id_case[39]);
            rrQs_1 var8 = var7.id_implements();
            rrQs_1 var9 = var1.id_class(var8);
            if (var2 == null || var2.accept(var9)) {
               var5.add(var9);
            }
         }

         var13 = var5.iterator();
      } finally {
         this.id_synchronized();
      }

      return var13;
   }

   void id_class(rrzY_2 var1) {
      this.id_new();

      try {
         rrzi_3 var2 = ((LinkedHashMap)this.id_break[id_protected[233]]).put(var1, var1);
         if (var2 != null) {
            this.id_class(var2);
         }

         if ((Integer)var1.id_class[id_protected[234]] == id_catch[59]
            || (Integer)var1.id_class[id_protected[235]] == id_catch[60]
            || (Integer)var1.id_class[id_protected[236]] == id_catch[61]) {
            rrzi_3 var3 = (rrzi_3)((LinkedHashMap)this.id_break[id_protected[237]])
               .get(((rrzi_3)this.id_break[id_protected[238]]).id_class(id_catch((byte[])var1.id_protected[id_protected[239]])));
            rrzi_3 var9 = (rrzi_3)var3.id_protected[id_protected[240]];
            var1.id_protected[id_protected[241]] = var9;
            var3.id_protected[id_protected[242]] = var1;
         }

         Boolean var11 = id_case[104];
         this.id_break[id_protected[243]] = var11;
      } finally {
         this.id_synchronized();
      }
   }

   public FileChannel id_class(byte[] var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      this.id_class((Set<? extends OpenOption>)var2);
      boolean var4 = !var2.contains(StandardOpenOption.WRITE) && !var2.contains(StandardOpenOption.APPEND) ? id_case[73] : id_case[72];
      this.id_super();

      rrzj_3 var10;
      try {
         this.id_continue();
         rrzY_2 var5 = this.id_private(var1);
         if (var4) {
            this.id_final();
            if (var5 == null) {
               if (!var2.contains(StandardOpenOption.CREATE) && !var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new NoSuchFileException(this.id_throws(var1));
               }
            } else {
               if (var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new FileAlreadyExistsException(this.id_throws(var1));
               }

               if (var5.id_catch()) {
                  throw new FileAlreadyExistsException("directory <" + this.id_throws(var1) + "> exists");
               }
            }

            var2 = new HashSet((Collection)var2);
            var2.remove(StandardOpenOption.CREATE_NEW);
         } else if (var5 == null || var5.id_catch()) {
            throw new NoSuchFileException(this.id_throws(var1));
         }

         boolean var6 = var5 != null && var5.id_class[id_protected[121]] == id_catch[35] ? id_case[74] : id_case[75];
         Path var7 = var6 ? (Path)var5.id_class[id_protected[122]] : this.id_finally(var1);
         FileChannel var8 = var7.getFileSystem().provider().newFileChannel(var7, (Set<? extends OpenOption>)var2, var3);
         Object var9 = var6
            ? var5
            : (this.id_break[id_protected[123]] ? new rrQP((byte[])this, var1, (int)var7, id_catch[36], var3) : new rrzY_2(var1, var7, id_catch[37], var3));
         if (var4) {
            Integer var16 = Integer.valueOf(id_catch[38]);
            ((rrzY_2)var9).id_class[id_protected[124]] = var16;
            Integer var17 = (Integer)this.id_break[id_protected[125]];
            ((rrzY_2)var9).id_class[id_protected[126]] = var17;
         }

         var10 = new rrzj_3(this, var8, var4, (rrzY_2)var9, var6, var7);
      } finally {
         this.id_this();
      }

      return var10;
   }

   @Override
   public boolean isOpen() {
      return (Boolean)this.id_break[19];
   }

   @Override
   public FileSystemProvider provider() {
      return (rrQB)this.id_break[0];
   }

   @Override
   public void close() throws IOException {
      this.id_new();

      try {
         if (!(Boolean)this.id_break[id_protected[48]]) {
            return;
         }

         Boolean var13 = id_case[30];
         this.id_break[id_protected[49]] = var13;
      } finally {
         this.id_synchronized();
      }

      if (!((Set)this.id_break[17]).isEmpty()) {
         for (InputStream var3 : new HashSet((Set)this.id_break[17])) {
            var3.close();
         }
      }

      this.id_new();

      try {
         AccessController.doPrivileged((PrivilegedExceptionAction<Void>)(() -> {
            this.id_finally();
            return null;
         }));
         ((SeekableByteChannel)this.id_break[id_protected[52]]).close();
      } catch (PrivilegedActionException var40) {
         throw (IOException)var40.getException();
      } finally {
         this.id_synchronized();
      }

      synchronized ((List)this.id_break[29]) {
         for (Inflater var50 : (List)this.id_break[id_protected[54]]) {
            var50.end();
         }
      }

      synchronized ((List)this.id_break[30]) {
         for (Deflater var51 : (List)this.id_break[id_protected[56]]) {
            var51.end();
         }
      }

      this.id_new();

      try {
         Object var14 = null;
         this.id_break[id_protected[57]] = var14;
      } finally {
         this.id_synchronized();
      }

      IOException var47 = null;
      synchronized ((Set)this.id_break[18]) {
         for (Path var4 : (Set)this.id_break[id_protected[59]]) {
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

      ((rrQB)this.id_break[0]).id_class((Path)this.id_break[1], this);
      if (var47 != null) {
         throw var47;
      }
   }

   @Override
   public boolean isReadOnly() {
      return (Boolean)this.id_break[4];
   }

   public Path id_break() {
      return (Path)this.id_break[1];
   }

   private void id_break(rrzY_2 var1, OutputStream var2) throws IOException {
      if ((byte[])var1.id_class[0] != null) {
         var2.write((byte[])var1.id_class[0], 0, ((byte[])var1.id_class[0]).length);
      } else if ((Path)var1.id_class[1] != null) {
         if ((Integer)var1.id_class[2] == 2 || (Integer)var1.id_class[2] == 3) {
            try (InputStream var3 = Files.newInputStream((Path)var1.id_class[1])) {
               var3.transferTo(var2);
            }
         }

         Files.delete((Path)var1.id_class[1]);
         ((Set)this.id_break[18]).remove((Path)var1.id_class[1]);
      }
   }

   OutputStream id_break(rrzY_2 var1) throws IOException {
      if ((Long)var1.id_class[7] == -1L) {
         Long var7 = System.currentTimeMillis();
         var1.id_class[7] = var7;
      }

      if ((Integer)var1.id_class[6] == -1) {
         Integer var8 = (Integer)this.id_break[10];
         var1.id_class[6] = var8;
      }

      Integer var9 = 8;
      var1.id_class[4] = var9;
      if (((rrzC_2)this.id_break[2]).id_class()) {
         Integer var10 = (Integer)var1.id_class[4] | 2048;
         var1.id_class[4] = var10;
      }

      Object var2;
      if (!(Boolean)this.id_break[7] && (Long)var1.id_class[12] < 10485760L) {
         var2 = new rrza_3(this, var1);
      } else {
         Path var11 = this.id_finally(null);
         var1.id_class[1] = var11;
         var2 = Files.newOutputStream((Path)var1.id_class[1], StandardOpenOption.WRITE);
      }

      return (OutputStream)(var1.id_class[6] == 8 ? new ZipStream(this, var1, (OutputStream)var2) : new rrzD_2(this, var1, (OutputStream)var2));
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707862977;
   }

   public rrzt_3 id_break(byte[] var1) throws IOException {
      this.id_super();

      Object var4;
      try {
         this.id_continue();
         rrzi_3 var2 = this.id_extends(var1);
         if (var2 == null) {
            return null;
         }

         if (var2 instanceof rrzY_2 var16) {
            return var16;
         }

         if ((Integer)var2.id_protected[id_protected[62]] != id_catch[13]) {
            return (rrzt_3)(this.id_break[id_protected[72]] ? new rrQP(this, this, var2) : new rrzY_2(this, var2));
         }

         Object var3 = this.id_break[id_protected[63]]
            ? new rrQP(this, (byte[])var2.id_protected[id_protected[64]], (Boolean)var2.id_protected[id_protected[65]], id_case[31])
            : new rrzY_2((byte[])var2.id_protected[id_protected[66]], (Boolean)var2.id_protected[id_protected[67]], id_case[32]);
         long var10004 = (Long)this.id_break[id_protected[68]];
         Long var10 = var10004;
         ((rrzY_2)var3).id_class[id_protected[69]] = var10;
         Long var11 = var10004;
         ((rrzY_2)var3).id_class[id_protected[70]] = var11;
         Long var12 = var10004;
         ((rrzY_2)var3).id_class[id_protected[71]] = var12;
         var4 = var3;
      } finally {
         this.id_this();
      }

      return (rrzt_3)var4;
   }

   private rrzi_3 id_break(byte[] var1, boolean var2) {
      rrzi_3 var3 = this.id_extends(var1);
      if (var3 != null) {
         return var3;
      } else {
         var3 = new rrzi_3(var1, var2);
         this.id_new();

         rrzi_3 var4;
         try {
            this.id_byte(
               var3,
               Objects.requireNonNull(
                  (rrzi_3)((LinkedHashMap)this.id_break[id_protected[300]]).get(rrzi_3.id_byte((byte[])id_class[id_protected[301]])), id_byte[68]
               )
            );
            var4 = var3;
         } finally {
            this.id_synchronized();
         }

         return var4;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, -29, 27, -110, -31, -87, -64, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Set<PosixFilePermission> id_break(Map<String, ?> var1) {
      Object var2 = var1.get("defaultPermissions");
      if (var2 == null) {
         return (Set<PosixFilePermission>)id_class[8];
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

   private void id_break(rrzi_3 var1) {
      this.id_new();

      try {
         this.id_class(var1);
         ((LinkedHashMap)this.id_break[id_protected[231]]).remove(var1);
         Boolean var7 = id_case[103];
         this.id_break[id_protected[232]] = var7;
      } finally {
         this.id_synchronized();
      }
   }

   private UserPrincipal id_break(Path var1, Map<String, ?> var2) throws IOException {
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

   private Integer id_break(rrzi_3 var1, rrzi_3 var2) {
      try {
         byte[] var3 = (byte[])var1.id_protected[id_protected[192]];
         return Integer.parseInt(this.id_throws(Arrays.copyOfRange(var3, ((byte[])var2.id_protected[id_protected[193]]).length + id_case[95], var3.length)));
      } catch (NumberFormatException var4) {
         return null;
      }
   }

   public SeekableByteChannel id_break(byte[] var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      this.id_class(var2);
      if (!var2.contains(StandardOpenOption.WRITE) && !var2.contains(StandardOpenOption.APPEND)) {
         this.id_super();

         rrzA_2 var34;
         try {
            this.id_continue();
            rrzY_2 var30 = this.id_private(var1);
            if (var30 == null || var30.id_catch()) {
               throw new NoSuchFileException(this.id_throws(var1));
            }

            try (InputStream var32 = this.id_byte(var30)) {
               var34 = new rrzA_2(var32.readAllBytes(), id_case[71]);
            }
         } finally {
            this.id_this();
         }

         return var34;
      } else {
         this.id_final();
         this.id_super();
         this.id_continue();

         rrzK_2 var33;
         try {
            rrzY_2 var4 = this.id_private(var1);
            if (var4 == null) {
               if (!var2.contains(StandardOpenOption.CREATE) && !var2.contains(StandardOpenOption.CREATE_NEW)) {
                  throw new NoSuchFileException(this.id_throws(var1));
               }

               this.id_implements(var1);
               return new rrzK_2(
                  this,
                  (rrzY_2)(this.id_break[id_protected[118]]
                     ? new rrQP((byte[])this, (int)var1, (boolean)id_catch[33], id_case[69], (Integer)this.id_break[id_protected[119]], var3)
                     : new rrzY_2(var1, id_catch[34], id_case[70], (Integer)this.id_break[id_protected[120]], var3))
               );
            }

            if (var4.id_catch() || var2.contains(StandardOpenOption.CREATE_NEW)) {
               throw new FileAlreadyExistsException(this.id_throws(var1));
            }

            rrzK_2 var5 = new rrzK_2(
               this, (rrzY_2)(this.id_break[id_protected[116]] ? new rrQP(this, (rrQP)var4, id_catch[30]) : new rrzY_2(var4, id_catch[31]))
            );
            if (var2.contains(StandardOpenOption.APPEND)) {
               try (InputStream var6 = this.id_byte(var4)) {
                  byte[] var7 = new byte[id_protected[117]];
                  ByteBuffer var8 = ByteBuffer.wrap(var7);

                  int var9;
                  while ((var9 = var6.read(var7)) != id_catch[32]) {
                     var8.position(id_case[68]);
                     var8.limit(var9);
                     var5.write(var8);
                  }
               }
            }

            var33 = var5;
         } finally {
            this.id_this();
         }

         return var33;
      }
   }

   private static void id_throws() {
      id_catch = new byte[]{
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

   void id_throws(Path var1) throws IOException {
      Files.delete(var1);
      ((Set)this.id_break[18]).remove(var1);
   }

   public String id_throws(byte[] var1) {
      return ((rrzC_2)this.id_break[2]).id_class(var1);
   }

   Path id_finally(byte[] var1) throws IOException {
      Path var2 = this.id_class((Path)this.id_break[1]);
      if (var1 != null) {
         rrzY_2 var3 = this.id_private(var1);
         if (var3 != null) {
            try (InputStream var4 = this.id_byte(var1)) {
               CopyOption[] var10002 = new CopyOption[id_case[76]];
               var10002[id_case[77]] = StandardCopyOption.REPLACE_EXISTING;
               Files.copy(var4, var2, var10002);
            }
         }
      }

      return var2;
   }

   private void id_finally() throws IOException {
      if ((Boolean)this.id_break[26]) {
         PosixFileAttributes var1 = this.id_case((Path)this.id_break[1]);
         Path var2 = this.id_class((Path)this.id_break[1]);
         BufferedOutputStream var3 = new BufferedOutputStream(Files.newOutputStream(var2, StandardOpenOption.WRITE));

         try {
            ArrayList var4 = new ArrayList(((LinkedHashMap)this.id_break[id_protected[273]]).size());
            long var5 = id_private[31];
            byte[] var7 = null;
            rrzi_3 var9 = (rrzi_3)((LinkedHashMap)this.id_break[id_protected[274]]).get(rrzi_3.id_byte(this.id_class(id_byte[66])));
            Iterator var10 = ((LinkedHashMap)this.id_break[id_protected[275]]).values().iterator();
            boolean var11 = id_case[113];

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
                  var11 = id_case[114];
               }

               if (var12 instanceof rrzY_2 var8) {
                  try {
                     if ((Integer)var8.id_class[id_protected[276]] == id_catch[71]) {
                        if (var7 == null) {
                           var7 = new byte[id_protected[277]];
                        }

                        var5 += this.id_class(var8, id_case[115], var3, var5, var7);
                     } else {
                        Long var18 = var5;
                        var8.id_class[id_protected[278]] = var18;
                        var5 += (long)var8.id_break(var3);
                        var5 += this.id_class(var8, var3);
                     }

                     var4.add(var8);
                  } catch (IOException var25) {
                     var25.printStackTrace();
                  }
               } else if ((Integer)var12.id_protected[id_protected[279]] != id_catch[72]
                  && (
                     ((byte[])var12.id_protected[id_protected[280]]).length != id_case[116]
                        || ((byte[])var12.id_protected[id_protected[281]])[id_case[117]] != id_catch[73]
                  )) {
                  Object var27 = this.id_break[id_protected[282]] ? new rrQP(this, this, var12) : new rrzY_2(this, var12);

                  try {
                     if (var7 == null) {
                        var7 = new byte[id_protected[283]];
                     }

                     var5 += this.id_class((rrzY_2)var27, id_case[118], var3, var5, var7);
                     var4.add(var27);
                  } catch (IOException var24) {
                     var24.printStackTrace();
                  }
               }
            }

            rrzR_2 var10000 = (rrzR_2)this.id_break[id_protected[284]];
            Long var19 = var5;
            var10000.id_class[id_protected[285]] = var19;

            for (rrzY_2 var13 : var4) {
               var5 += (long)var13.id_class(var3);
            }

            var10000 = (rrzR_2)this.id_break[id_protected[286]];
            Integer var20 = var4.size();
            var10000.id_class[id_protected[287]] = var20;
            var10000 = (rrzR_2)this.id_break[id_protected[288]];
            Long var21 = var5 - (Long)((rrzR_2)this.id_break[id_protected[289]]).id_class[id_protected[290]];
            var10000.id_class[id_protected[291]] = var21;
            ((rrzR_2)this.id_break[id_protected[292]]).id_class(var3, var5, (Boolean)this.id_break[id_protected[293]]);
         } catch (Throwable var26) {
            try {
               var3.close();
            } catch (Throwable var23) {
               var26.addSuppressed(var23);
            }

            throw var26;
         }

         var3.close();
         ((SeekableByteChannel)this.id_break[20]).close();
         Files.delete((Path)this.id_break[1]);
         if (var1 != null) {
            Files.setPosixFilePermissions(var2, var1.permissions());
         }

         Files.move(var2, (Path)this.id_break[1], StandardCopyOption.REPLACE_EXISTING);
         Boolean var22 = false;
         this.id_break[26] = var22;
      }
   }

   private static byte[] id_catch(byte[] var0) {
      int var1 = id_native(var0);
      return var1 <= 1 ? (byte[])id_class[1] : Arrays.copyOf(var0, var1);
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[31];
         Object[] var1 = this.id_break;
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

   private rrzi_3 id_extends(byte[] var1) {
      return (rrzi_3)((LinkedHashMap)this.id_break[25]).get(rrzi_3.id_byte(Objects.requireNonNull((byte[])((Function)this.id_break[11]).apply(var1), "path")));
   }

   private static void id_goto() {
      id_byte = new String[]{
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

   private PosixFileAttributes id_case(Path var1) throws IOException {
      try {
         PosixFileAttributeView var2 = Files.getFileAttributeView(var1, PosixFileAttributeView.class);
         return var2 == null ? null : var2.readAttributes();
      } catch (UnsupportedOperationException var3) {
         return null;
      }
   }

   private boolean id_case() throws IOException {
      try {
         boolean var3;
         try (InputStream var1 = this.id_byte(this.id_class(id_byte[51]))) {
            String var2 = new Manifest(var1).getMainAttributes().getValue(Name.MULTI_RELEASE);
            var3 = id_byte[52].equalsIgnoreCase(var2);
         }

         return var3;
      } catch (NoSuchFileException var6) {
         return false;
      }
   }

   public boolean id_case(byte[] var1) {
      this.id_super();

      boolean var2;
      try {
         this.id_continue();
         var2 = this.id_extends(var1) != null ? id_case[35] : id_case[36];
      } finally {
         this.id_this();
      }

      return var2;
   }

   void id_continue() {
      if (!(Boolean)this.id_break[19]) {
         throw new ClosedFileSystemException();
      }
   }

   private void id_else() {
      this.id_new();

      try {
         rrzi_3 var1 = (rrzi_3)((LinkedHashMap)this.id_break[id_protected[174]])
            .remove(((rrzi_3)this.id_break[id_protected[175]]).id_class((byte[])id_class[id_protected[176]]));
         if (var1 == null) {
            var1 = new rrzi_3((byte[])id_class[id_protected[177]], id_case[90]);
         }

         rrzi_3[] var2 = ((LinkedHashMap)this.id_break[id_protected[178]]).values().toArray(new rrzi_3[id_case[91]]);
         ((LinkedHashMap)this.id_break[id_protected[179]]).put(var1, var1);
         rrzi_3[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = id_case[92]; var5 < var4; var5++) {
            rrzi_3 var6 = var3[var5];
            this.id_byte(var6, var1);
         }
      } finally {
         this.id_synchronized();
      }
   }

   private void id_implements(byte[] var1) throws IOException {
      this.id_super();

      try {
         while ((var1 = id_catch(var1)) != null && var1 != (byte[])id_class[id_protected[129]]) {
            if (!((LinkedHashMap)this.id_break[id_protected[130]]).containsKey(rrzi_3.id_byte(var1))) {
               throw new NoSuchFileException(this.id_throws(var1));
            }
         }
      } finally {
         this.id_this();
      }
   }

   private rrzR_2 id_implements() throws IOException {
      byte[] var1 = new byte[128];
      long var2 = ((SeekableByteChannel)this.id_break[20]).size();
      long var4 = var2 - 65557L > 0L ? var2 - 65557L : id_private[4];
      long var6 = var4 - (long)(var1.length - 22);

      for (long var8 = var2 - (long)var1.length; var8 >= var6; var8 -= (long)(var1.length - 22)) {
         int var10 = 0;
         if (var8 < 0L) {
            var10 = (int)(-var8);
            Arrays.fill(var1, 0, var10, (byte)0);
         }

         int var11 = var1.length - var10;
         if (this.id_class(var1, var10, (long)var11, var8 + (long)var10) != (long)var11) {
            throw new ZipException("zip END header not found");
         }

         for (int var12 = var1.length - 22; var12 >= 0; var12--) {
            if (var1[var12] == 80
               && var1[var12 + 1] == 75
               && var1[var12 + 2] == 5
               && var1[var12 + 3] == 6
               && var8 + (long)var12 + 22L + (long)rrzH_2.id_class(var1, var12) == var2) {
               var1 = Arrays.copyOfRange(var1, var12, var12 + 22);
               rrzR_2 var13 = new rrzR_2();
               Integer var28 = rrzH_2.id_this(var1);
               var13.id_class[0] = var28;
               Long var29 = rrzH_2.id_finally(var1);
               var13.id_class[1] = var29;
               Long var30 = rrzH_2.id_super(var1);
               var13.id_class[2] = var30;
               Long var31 = var8 + (long)var12;
               var13.id_class[3] = var31;
               byte[] var14 = new byte[20];
               if ((Long)var13.id_class[3] >= 20L
                  && this.id_class(var14, 0, (long)var14.length, (Long)var13.id_class[3] - 20L) == (long)var14.length
                  && rrzH_2.id_package(var14, 0)) {
                  long var15 = rrzH_2.id_private(var14);
                  byte[] var17 = new byte[56];
                  if (this.id_class(var17, 0, (long)var17.length, var15) == (long)var17.length && rrzH_2.id_native(var17, 0)) {
                     long var18 = rrzH_2.id_throws(var17);
                     long var20 = rrzH_2.id_int(var17);
                     long var22 = rrzH_2.id_package(var17);
                     if ((var18 == (Long)var13.id_class[1] || (Long)var13.id_class[1] == 4294967295L)
                        && (var20 == (Long)var13.id_class[2] || (Long)var13.id_class[2] == 4294967295L)
                        && (var22 == (long)((Integer)var13.id_class[0]).intValue() || (Integer)var13.id_class[0] == 65535)) {
                        Long var32 = var18;
                        var13.id_class[1] = var32;
                        Long var33 = var20;
                        var13.id_class[2] = var33;
                        Integer var34 = (int)var22;
                        var13.id_class[0] = var34;
                        Long var35 = var15;
                        var13.id_class[3] = var35;
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

   private void id_new() {
      ((ReadWriteLock)this.id_break[24]).writeLock().lock();
   }

   private static void id_return() {
      id_private = new long[]{
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

   private void id_super() {
      ((ReadWriteLock)this.id_break[24]).readLock().lock();
   }

   private byte[] id_try() throws IOException {
      rrzR_2 var16 = this.id_implements();
      this.id_break[22] = var16;
      if ((Long)((rrzR_2)this.id_break[22]).id_class[3] == 0L) {
         LinkedHashMap var17 = new LinkedHashMap(10);
         this.id_break[25] = var17;
         Long var18 = 0L;
         this.id_break[23] = var18;
         this.id_else();
         return null;
      } else if ((Long)((rrzR_2)this.id_break[22]).id_class[1] > (Long)((rrzR_2)this.id_break[22]).id_class[3]) {
         throw new ZipException("invalid END header (bad central directory size)");
      } else {
         long var1 = (Long)((rrzR_2)this.id_break[22]).id_class[3] - (Long)((rrzR_2)this.id_break[22]).id_class[1];
         Long var19 = var1 - (Long)((rrzR_2)this.id_break[22]).id_class[2];
         this.id_break[23] = var19;
         if ((Long)this.id_break[23] < 0L) {
            throw new ZipException("invalid END header (bad central directory offset)");
         } else {
            byte[] var3 = new byte[(int)(((rrzR_2)this.id_break[22]).id_class[1] + 22L)];
            if (this.id_class(var3, 0, (long)var3.length, var1) != (Long)((rrzR_2)this.id_break[22]).id_class[1] + 22L) {
               throw new ZipException("read CEN tables failed");
            } else {
               LinkedHashMap var20 = new LinkedHashMap((Integer)((rrzR_2)this.id_break[22]).id_class[0] + 1);
               this.id_break[25] = var20;
               int var4 = 0;
               int var5 = var3.length - 22;

               while (var4 < var5) {
                  if (!rrzH_2.id_break(var3, var4)) {
                     throw new ZipException("invalid CEN header (bad signature)");
                  }

                  int var6 = rrzH_2.id_synchronized(var3, var4);
                  int var7 = rrzH_2.id_super(var3, var4);
                  int var8 = rrzH_2.id_instanceof(var3, var4);
                  int var9 = rrzH_2.id_implements(var3, var4);
                  int var10 = rrzH_2.id_else(var3, var4);
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
                  if (var11.id_protected()) {
                     throw new ZipException(
                        "ZIP file can't be opened as a file system because entry \"" + var11.id_private() + "\" has a '.' or '..' element in its name"
                     );
                  }

                  ((LinkedHashMap)this.id_break[25]).put(var11, var11);
                  if (!((rrzC_2)this.id_break[2]).id_class() && (var10 & 2048) == 0) {
                     this.id_final((byte[])var11.id_protected[0]);
                  } else {
                     this.id_volatile((byte[])var11.id_protected[0]);
                  }

                  var4 += 46 + var7 + var8 + var9;
               }

               if (var4 + 22 != var3.length) {
                  throw new ZipException("invalid CEN header (bad header size)");
               } else {
                  this.id_else();
                  return var3;
               }
            }
         }
      }
   }

   Deflater id_while() {
      synchronized ((List)this.id_break[30]) {
         int var2 = ((List)this.id_break[id_protected[339]]).size();
         return var2 > 0 ? (Deflater)((List)this.id_break[id_protected[340]]).remove(var2 - id_case[129]) : new Deflater(id_catch[82], id_case[130]);
      }
   }

   private static void id_protected() {
      id_throws = new int[]{10485760, 65535, 10485760};
   }

   public boolean id_protected(byte[] var1) {
      this.id_super();

      boolean var3;
      try {
         rrzi_3 var2 = this.id_extends(var1);
         var3 = var2 != null && var2.id_catch() ? id_case[37] : id_case[38];
      } finally {
         this.id_this();
      }

      return var3;
   }

   private static void id_private() {
      id_case = new boolean[]{
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

   rrzY_2 id_private(byte[] var1) throws IOException {
      rrzi_3 var2 = this.id_extends(var1);
      if (var2 instanceof rrzY_2) {
         return (rrzY_2)var2;
      } else if (var2 != null && (Integer)var2.id_protected[3] != -1) {
         return (rrzY_2)(this.id_break[12] ? new rrQP(this, this, var2) : new rrzY_2(this, var2));
      } else {
         return null;
      }
   }

   private void id_final() {
      if ((Boolean)this.id_break[4]) {
         throw new ReadOnlyFileSystemException();
      }
   }

   private final void id_final(byte[] var1) throws ZipException {
      try {
         ((rrzC_2)this.id_break[id_protected[228]]).id_class(var1);
      } catch (Exception var3) {
         throw new ZipException("invalid CEN header (bad entry name)");
      }
   }

   private final void id_volatile(byte[] var1) throws ZipException {
      try {
         int var2 = var1.length;

         for (int var3 = id_case[100]; var3 < var2; var3++) {
            if (var1[var3] < 0) {
               ((rrzC_2)this.id_break[id_protected[227]]).id_class(Arrays.copyOfRange(var1, var3, var1.length));
               break;
            }
         }
      } catch (Exception var4) {
         throw new ZipException("invalid CEN header (bad entry name)");
      }
   }

   private static void id_volatile() {
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
      id_class = var0;
   }

   private void id_synchronized() {
      ((ReadWriteLock)this.id_break[24]).writeLock().unlock();
   }

   private Inflater id_native() {
      synchronized ((List)this.id_break[29]) {
         int var2 = ((List)this.id_break[id_protected[333]]).size();
         return var2 > 0 ? (Inflater)((List)this.id_break[id_protected[334]]).remove(var2 - id_case[127]) : new Inflater(id_case[128]);
      }
   }

   private static int id_native(byte[] var0) {
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
      return (Set<String>)this.id_break[16];
   }

   @Override
   public Iterable<Path> getRootDirectories() {
      return List.of((rrQs_1)this.id_break[3]);
   }

   @Override
   public Iterable<FileStore> getFileStores() {
      return List.of(new rrzw_3((rrQs_1)this.id_break[3]));
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
            var5 = rrQO.id_class(var4);
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
