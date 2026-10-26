package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzY_2 extends rrzi_3 implements rrzt_3 {
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static long[] id_catch;
   private static String[] id_private;
   private static short[] id_implements;
   public Object[] id_class;
   private static int[] id_finally;
   public static Object[] id_break;

   int id_byte(OutputStream var1) throws IOException {
      this.id_final();
      rrQO.id_break(var1, (Long)rrzH_2.id_class[11]);
      rrQO.id_break(var1, (Long)this.id_class[10]);
      if ((Long)this.id_class[11] < 4294967295L && (Long)this.id_class[12] < 4294967295L) {
         rrQO.id_break(var1, (Long)this.id_class[11]);
         rrQO.id_break(var1, (Long)this.id_class[12]);
         return 16;
      } else {
         rrQO.id_class(var1, (Long)this.id_class[11]);
         rrQO.id_class(var1, (Long)this.id_class[12]);
         return 24;
      }
   }

   @Override
   public byte[] id_byte() {
      this.id_final();
      return (byte[])this.id_class[13] != null ? Arrays.copyOf((byte[])this.id_class[13], ((byte[])this.id_class[13]).length) : null;
   }

   private static void id_int() {
      id_implements = new short[]{
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         2,
         8,
         9,
         7,
         10,
         12,
         11,
         6,
         2,
         5,
         1,
         6,
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         0,
         2,
         2,
         3,
         3,
         9,
         9,
         8,
         8,
         7,
         7,
         10,
         10,
         12,
         12,
         11,
         11,
         6,
         6,
         13,
         13,
         14,
         14,
         15,
         15,
         5,
         5,
         2,
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         6,
         6,
         5,
         768,
         255,
         21,
         3,
         3,
         4,
         6,
         7,
         10,
         11,
         12,
         4095,
         5,
         14,
         0,
         0,
         2,
         2,
         1,
         1,
         13,
         15,
         11,
         12,
         14,
         2,
         0,
         0,
         13,
         13,
         15,
         15,
         11,
         12,
         14,
         13,
         13,
         21589,
         0,
         12,
         4,
         6,
         7,
         10,
         15,
         5,
         5,
         12,
         11,
         14,
         7,
         8,
         9,
         21589,
         9,
         7,
         13,
         13,
         15,
         15,
         2,
         0,
         0,
         13,
         13,
         10,
         4,
         4,
         6,
         7,
         11,
         12,
         4,
         6,
         7,
         10,
         11,
         12,
         13,
         13,
         21589,
         0,
         8,
         9,
         12,
         11,
         7,
         8,
         9,
         21589,
         8,
         9,
         7,
         8,
         8,
         9,
         9,
         13,
         13,
         11,
         10,
         11,
         12,
         11,
         12,
         11,
         12,
         13,
         13,
         13,
         13,
         12,
         13,
         12,
         11,
         13,
         11,
         14,
         13,
         14,
         13,
         13,
         13,
         7,
         13,
         8,
         13,
         9,
         6,
         13,
         7,
         14,
         13,
         13,
         13,
         13,
         13,
         13,
         14,
         14,
         21589,
         7,
         8,
         9,
         1024,
         9,
         7,
         9,
         8,
         7,
         8,
         7,
         12,
         11,
         10,
         6,
         13,
         13,
         13,
         15,
         15,
         15,
         5,
         5
      };
   }

   public rrzY_2(rrzf_3 var1, rrzi_3 var2) throws IOException {
      this.id_final();
      Integer var7 = 1;
      this.id_class[2] = var7;
      Integer var8 = -1;
      this.id_class[5] = var8;
      Integer var9 = -1;
      this.id_class[6] = var9;
      Long var10 = -1L;
      this.id_class[7] = var10;
      Long var11 = -1L;
      this.id_class[8] = var11;
      Long var12 = -1L;
      this.id_class[9] = var12;
      Long var13 = -1L;
      this.id_class[10] = var13;
      Long var14 = -1L;
      this.id_class[11] = var14;
      Long var15 = -1L;
      this.id_class[12] = var15;
      this.id_class(var1, var2);
   }

   public rrzY_2(byte[] var1, boolean var2, int var3) {
      this.id_final();
      Integer var8 = 1;
      this.id_class[2] = var8;
      Integer var9 = -1;
      this.id_class[5] = var9;
      Integer var10 = -1;
      this.id_class[6] = var10;
      Long var11 = -1L;
      this.id_class[7] = var11;
      Long var12 = -1L;
      this.id_class[8] = var12;
      Long var13 = -1L;
      this.id_class[9] = var13;
      Long var14 = -1L;
      this.id_class[10] = var14;
      Long var15 = -1L;
      this.id_class[11] = var15;
      Long var16 = -1L;
      this.id_class[12] = var16;
      this.id_break(var1);
      Boolean var17 = var2;
      this.id_protected[2] = var17;
      long var10004 = System.currentTimeMillis();
      Long var18 = var10004;
      this.id_class[8] = var18;
      Long var19 = var10004;
      this.id_class[9] = var19;
      Long var20 = var10004;
      this.id_class[7] = var20;
      Long var21 = id_catch[6];
      this.id_class[10] = var21;
      Long var22 = id_catch[7];
      this.id_class[12] = var22;
      Long var23 = id_catch[8];
      this.id_class[11] = var23;
      Integer var24 = var3;
      this.id_class[6] = var24;
   }

   public rrzY_2(rrzY_2 var1, int var2, int var3) {
      this(var1, var2);
      Integer var8 = var3;
      this.id_class[6] = var8;
   }

   public rrzY_2(byte[] var1, Path var2, int var3, FileAttribute<?>... var4) {
      this(var1, var3, id_case[2], id_case[3], var4);
      this.id_class[1] = var2;
   }

   public rrzY_2(byte[] var1, int var2, boolean var3, int var4, FileAttribute<?>... var5) {
      this(var1, var3, var4);
      Integer var15 = var2;
      this.id_class[2] = var15;
      FileAttribute[] var6 = var5;
      int var7 = var5.length;

      for (int var8 = id_case[1]; var8 < var7; var8++) {
         FileAttribute var9 = var6[var8];
         String var10 = var9.name();
         if (var10.equals(id_private[0])) {
            Integer var16 = rrQO.id_class((Set<PosixFilePermission>)var9.value());
            this.id_class[5] = var16;
         }
      }
   }

   public rrzY_2(rrzY_2 var1, int var2) {
      this.id_final();
      Integer var7 = 1;
      this.id_class[2] = var7;
      Integer var8 = -1;
      this.id_class[5] = var8;
      Integer var9 = -1;
      this.id_class[6] = var9;
      Long var10 = -1L;
      this.id_class[7] = var10;
      Long var11 = -1L;
      this.id_class[8] = var11;
      Long var12 = -1L;
      this.id_class[9] = var12;
      Long var13 = -1L;
      this.id_class[10] = var13;
      Long var14 = -1L;
      this.id_class[11] = var14;
      Long var15 = -1L;
      this.id_class[12] = var15;
      this.id_break((byte[])var1.id_protected[id_implements[30]]);
      Boolean var16 = (Boolean)var1.id_protected[2];
      this.id_protected[2] = var16;
      Integer var17 = (Integer)var1.id_class[3];
      this.id_class[3] = var17;
      Long var18 = (Long)var1.id_class[9];
      this.id_class[9] = var18;
      Long var19 = (Long)var1.id_class[8];
      this.id_class[8] = var19;
      Long var20 = (Long)var1.id_class[7];
      this.id_class[7] = var20;
      Long var21 = (Long)var1.id_class[10];
      this.id_class[10] = var21;
      Long var22 = (Long)var1.id_class[12];
      this.id_class[12] = var22;
      Long var23 = (Long)var1.id_class[11];
      this.id_class[11] = var23;
      Integer var24 = (Integer)var1.id_class[6];
      this.id_class[6] = var24;
      byte[] var25 = (byte[])var1.id_class[13];
      this.id_class[13] = var25;
      Long var26 = (Long)var1.id_class[14];
      this.id_class[14] = var26;
      byte[] var27 = (byte[])var1.id_class[15];
      this.id_class[15] = var27;
      Integer var28 = (Integer)var1.id_class[5];
      this.id_class[5] = var28;
      Integer var29 = var2;
      this.id_class[2] = var29;
   }

   static {
      ntfClinit();
   }

   @Override
   public long size() {
      this.id_final();
      return (Long)this.id_class[12];
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(1024);
      Formatter var2 = new Formatter(var1);
      String var10001 = id_private[5];
      Object[] var10002 = new Object[1];
      var10002[id_case[53]] = this.id_private();
      var2.format(var10001, var10002);
      var10001 = id_private[6];
      var10002 = new Object[1];
      var10002[id_case[55]] = this.creationTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[7];
      var10002 = new Object[1];
      var10002[id_case[57]] = this.lastAccessTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[8];
      var10002 = new Object[1];
      var10002[id_case[59]] = this.lastModifiedTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[9];
      var10002 = new Object[1];
      var10002[id_case[61]] = this.isRegularFile();
      var2.format(var10001, var10002);
      var10001 = id_private[10];
      var10002 = new Object[1];
      var10002[id_case[63]] = this.isDirectory();
      var2.format(var10001, var10002);
      var10001 = id_private[11];
      var10002 = new Object[1];
      var10002[id_case[65]] = this.isSymbolicLink();
      var2.format(var10001, var10002);
      var10001 = id_private[12];
      var10002 = new Object[1];
      var10002[id_case[67]] = this.isOther();
      var2.format(var10001, var10002);
      var10001 = id_private[13];
      var10002 = new Object[1];
      var10002[id_case[69]] = this.fileKey();
      var2.format(var10001, var10002);
      var10001 = id_private[14];
      var10002 = new Object[1];
      var10002[id_case[71]] = this.size();
      var2.format(var10001, var10002);
      var10001 = id_private[15];
      var10002 = new Object[1];
      var10002[id_case[73]] = this.id_protected();
      var2.format(var10001, var10002);
      var10001 = id_private[16];
      var10002 = new Object[1];
      var10002[id_case[75]] = this.id_case();
      var2.format(var10001, var10002);
      var10001 = id_private[17];
      var10002 = new Object[1];
      var10002[id_case[77]] = this.id_break();
      var2.format(var10001, var10002);
      Set var3 = this.id_class().orElse(null);
      if (var3 != null) {
         var10001 = id_private[18];
         var10002 = new Object[1];
         var10002[id_case[79]] = var3;
         var2.format(var10001, var10002);
      }

      var2.close();
      return var1.toString();
   }

   private void id_class(rrzf_3 var1, rrzi_3 var2) throws IOException {
      this.id_final();
      byte[] var3 = (byte[])var1.id_break[21];
      int var4 = (Integer)var2.id_protected[3];
      if (!rrzH_2.id_break(var3, var4)) {
         throw new ZipException(id_private[2]);
      } else {
         Integer var12 = rrzH_2.id_interface(var3, var4);
         this.id_class[3] = var12;
         Integer var13 = rrzH_2.id_else(var3, var4);
         this.id_class[4] = var13;
         Integer var14 = rrzH_2.id_synchronized(var3, var4);
         this.id_class[6] = var14;
         Long var15 = rrQO.id_break(rrzH_2.id_volatile(var3, var4));
         this.id_class[7] = var15;
         Long var16 = rrzH_2.id_protected(var3, var4);
         this.id_class[10] = var16;
         Long var17 = rrzH_2.id_finally(var3, var4);
         this.id_class[11] = var17;
         Long var18 = rrzH_2.id_int(var3, var4);
         this.id_class[12] = var18;
         int var5 = rrzH_2.id_super(var3, var4);
         int var6 = rrzH_2.id_instanceof(var3, var4);
         int var7 = rrzH_2.id_implements(var3, var4);
         if (rrzH_2.id_private(var3, var4) == 3) {
            Integer var19 = rrzH_2.id_byte(var3, var4) & 4095;
            this.id_class[5] = var19;
         }

         Long var20 = rrzH_2.id_throw(var3, var4);
         this.id_class[14] = var20;
         var4 += 46;
         byte[] var21 = (byte[])var2.id_protected[id_implements[84]];
         this.id_protected[id_implements[85]] = var21;
         Boolean var22 = (Boolean)var2.id_protected[2];
         this.id_protected[2] = var22;
         Integer var23 = (Integer)var2.id_protected[1];
         this.id_protected[1] = var23;
         var4 += var5;
         if (var6 > 0) {
            byte[] var24 = Arrays.copyOfRange(var3, var4, var4 + var6);
            this.id_class[13] = var24;
            var4 += var6;
            this.id_break(var1);
         }

         if (var7 > 0) {
            byte[] var25 = Arrays.copyOfRange(var3, var4, var4 + var7);
            this.id_class[15] = var25;
         }
      }
   }

   int id_class(OutputStream var1) throws IOException {
      this.id_final();
      long var2 = (Long)this.id_class[11];
      long var4 = (Long)this.id_class[12];
      long var6 = (Long)this.id_class[14];
      byte var8 = id_case[6];
      byte var9 = id_case[7];
      byte var10 = id_case[8];
      boolean var11 = id_case[9];
      byte[] var12 = this.id_protected[2] ? rrQO.id_class((byte[])this.id_protected[id_implements[96]]) : (byte[])this.id_protected[id_implements[97]];
      int var13 = var12 != null ? var12.length - 1 : id_case[11];
      int var14 = (byte[])this.id_class[13] != null ? ((byte[])this.id_class[13]).length : id_case[12];
      int var15 = id_case[13];
      int var16 = (byte[])this.id_class[15] != null ? ((byte[])this.id_class[15]).length : id_case[14];
      if ((Long)this.id_class[11] >= 4294967295L) {
         var2 = 4294967295L;
         var8 += 8;
      }

      if ((Long)this.id_class[12] >= 4294967295L) {
         var4 = 4294967295L;
         var8 += 8;
      }

      if ((Long)this.id_class[14] >= 4294967295L) {
         var6 = 4294967295L;
         var8 += 8;
      }

      if (var8 != 0) {
         var8 += 4;
      }

      boolean var17 = var8 != 0 ? true : id_case[16];
      int var18 = this.id_class(var17);

      while (var15 + 4 < var14) {
         int var19 = rrzH_2.id_while((byte[])this.id_class[13], var15);
         int var20 = rrzH_2.id_while((byte[])this.id_class[13], var15 + 2);
         if (var19 == 21589 || var19 == 10) {
            var11 = true;
         }

         var15 += 4 + var20;
      }

      if (!var11) {
         if ((Boolean)rrzf_3.id_class[id_implements[108]]) {
            var9 = 36;
         } else {
            var10 = 9;
         }
      }

      rrQO.id_break(var1, (Long)rrzH_2.id_class[12]);
      rrQO.id_class(var1, this.id_break(var18));
      rrQO.id_class(var1, var18);
      rrQO.id_class(var1, (Integer)this.id_class[4]);
      rrQO.id_class(var1, (Integer)this.id_class[6]);
      rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[7])));
      rrQO.id_break(var1, (Long)this.id_class[10]);
      rrQO.id_break(var1, var2);
      rrQO.id_break(var1, var4);
      rrQO.id_class(var1, var13);
      rrQO.id_class(var1, var14 + var8 + var9 + var10);
      if ((byte[])this.id_class[15] != null) {
         rrQO.id_class(var1, Math.min(var16, 65535));
      } else {
         rrQO.id_class(var1, id_case[18]);
      }

      rrQO.id_class(var1, id_case[19]);
      rrQO.id_class(var1, id_case[20]);
      rrQO.id_break(var1, this.id_class[5] > 0 ? (long)((Integer)this.id_class[5] << 16) : id_catch[27]);
      rrQO.id_break(var1, var6);
      rrQO.id_class(var1, var12, 1, var13);
      if (var17) {
         rrQO.id_class(var1, 1);
         rrQO.id_class(var1, var8 - 4);
         if (var4 == 4294967295L) {
            rrQO.id_class(var1, (Long)this.id_class[12]);
         }

         if (var2 == 4294967295L) {
            rrQO.id_class(var1, (Long)this.id_class[11]);
         }

         if (var6 == 4294967295L) {
            rrQO.id_class(var1, (Long)this.id_class[14]);
         }
      }

      if (var9 != 0) {
         rrQO.id_class(var1, 10);
         rrQO.id_class(var1, var9 - 4);
         rrQO.id_break(var1, id_catch[31]);
         rrQO.id_class(var1, 1);
         rrQO.id_class(var1, 24);
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[7]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[8]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[9]));
      }

      if (var10 != 0) {
         rrQO.id_class(var1, 21589);
         rrQO.id_class(var1, var10 - 4);
         if ((Long)this.id_class[9] == -1L) {
            var1.write(3);
         } else {
            var1.write(7);
         }

         rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[7]));
      }

      if ((byte[])this.id_class[13] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[13]);
      }

      if ((byte[])this.id_class[15] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[15]);
      }

      return 46 + var13 + var14 + var16 + var8 + var9 + var10;
   }

   private int id_class(boolean var1) throws ZipException {
      this.id_final();
      if (var1) {
         return 45;
      } else if ((Integer)this.id_class[6] == 8) {
         return 20;
      } else if ((Integer)this.id_class[6] == 0) {
         return 10;
      } else {
         throw new ZipException(id_private[1]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 88, -40, 53, -29, 0, -20, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Optional<Set<PosixFilePermission>> id_class() {
      this.id_final();
      HashSet var1 = null;
      if ((Integer)this.id_class[5] != -1) {
         var1 = new HashSet(PosixFilePermission.values().length);
         PosixFilePermission[] var2 = PosixFilePermission.values();
         int var3 = var2.length;

         for (int var4 = id_case[84]; var4 < var3; var4++) {
            PosixFilePermission var5 = var2[var4];
            if (((Integer)this.id_class[5] & rrQO.id_class(var5)) != 0) {
               var1.add(var5);
            }
         }
      }

      return Optional.ofNullable(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1566707947;
   }

   private void id_class(rrzf_3 var1) throws IOException {
      this.id_final();
      byte[] var2 = new byte[30];
      if (var1.id_class(var2, id_case[46], (long)var2.length, (Long)this.id_class[14]) != (long)var2.length) {
         throw new ZipException(id_private[3]);
      } else if (!rrzH_2.id_new(var2, id_case[47])) {
         throw new ZipException("R" + Long.toString(rrzH_2.id_case(var2, id_case[48]), 16));
      } else {
         int var3 = rrzH_2.id_volatile(var2);
         if (var3 >= 9) {
            int var4 = rrzH_2.id_extends(var2);
            var2 = new byte[var3];
            if (var1.id_class(var2, id_case[49], (long)var2.length, (Long)this.id_class[14] + 30L + (long)var4) != (long)var2.length) {
               throw new ZipException(id_private[4]);
            } else {
               int var5 = id_case[50];

               while (var5 + 4 < var2.length) {
                  int var6 = rrzH_2.id_while(var2, var5);
                  int var7 = rrzH_2.id_while(var2, var5 + 2);
                  var5 += 4;
                  if (var6 == 21589) {
                     int var8 = var5 + var7 - 4;
                     int var9 = rrzH_2.id_final(var2, var5++);
                     if ((var9 & 1) != 0 && var5 <= var8) {
                        Long var14 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[7] = var14;
                        var5 += 4;
                     }

                     if ((var9 & 2) != 0 && var5 <= var8) {
                        Long var15 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[8] = var15;
                        var5 += 4;
                     }

                     if ((var9 & 4) != 0 && var5 <= var8) {
                        Long var16 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[9] = var16;
                     }
                     break;
                  }

                  var5 += var7;
               }
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6526717619808680707L;
   }

   private int id_break(int var1) {
      this.id_final();
      return this.id_class[5] < 0 ? var1 : 768 | var1 & 0xFF;
   }

   @Override
   public int id_break() {
      this.id_final();
      return (Integer)this.id_class[6];
   }

   private void id_break(rrzf_3 var1) throws IOException {
      this.id_final();
      if ((byte[])this.id_class[13] != null) {
         int var2 = ((byte[])this.id_class[13]).length;
         int var3 = id_case[40];
         int var4 = id_case[41];
         boolean var5 = id_case[42];

         while (var3 + 4 < var2) {
            int var7 = rrzH_2.id_while((byte[])this.id_class[13], var3);
            int var8 = rrzH_2.id_while((byte[])this.id_class[13], var3 + 2);
            int var6 = var3 + 4;
            if (var6 + var8 > var2) {
               break;
            }

            switch (var7) {
               case 1:
                  if ((Long)this.id_class[12] == 4294967295L) {
                     if (var6 + 8 > var2) {
                        break;
                     }

                     Long var13 = rrzH_2.id_catch((byte[])this.id_class[13], var6);
                     this.id_class[12] = var13;
                     var6 += 8;
                  }

                  if ((Long)this.id_class[11] == 4294967295L) {
                     if (var6 + 8 > var2) {
                        break;
                     }

                     Long var14 = rrzH_2.id_catch((byte[])this.id_class[13], var6);
                     this.id_class[11] = var14;
                     var6 += 8;
                  }

                  if ((Long)this.id_class[14] == 4294967295L && var6 + 8 <= var2) {
                     Long var15 = rrzH_2.id_catch((byte[])this.id_class[13], var6);
                     this.id_class[14] = var15;
                  }
                  break;
               case 10:
                  if (var8 >= 32) {
                     var6 += 4;
                     if (rrzH_2.id_while((byte[])this.id_class[13], var6) == 1 && rrzH_2.id_while((byte[])this.id_class[13], var6 + 2) == 24) {
                        Long var16 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[13], var6 + 4));
                        this.id_class[7] = var16;
                        Long var17 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[13], var6 + 12));
                        this.id_class[8] = var17;
                        Long var18 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[13], var6 + 20));
                        this.id_class[9] = var18;
                     }
                  }
                  break;
               case 21589:
                  if ((Boolean)var1.id_break[6]) {
                     if (var8 == 5) {
                        Long var19 = rrQO.id_throws(rrzH_2.id_try((byte[])this.id_class[13], var6 + 1));
                        this.id_class[7] = var19;
                     }
                  } else if ((Long)this.id_class[14] != 4294967295L) {
                     this.id_class(var1);
                  } else {
                     var5 = true;
                  }
                  break;
               default:
                  System.arraycopy((byte[])this.id_class[13], var3, (byte[])this.id_class[13], var4, var8 + 4);
                  var4 += var8 + 4;
            }

            var3 += var8 + 4;
         }

         if (var5) {
            this.id_class(var1);
         }

         if (var4 != 0 && var4 != ((byte[])this.id_class[13]).length) {
            byte[] var20 = Arrays.copyOf((byte[])this.id_class[13], var4);
            this.id_class[13] = var20;
         } else {
            Object var21 = null;
            this.id_class[13] = var21;
         }
      }
   }

   int id_break(OutputStream var1) throws IOException {
      this.id_final();
      byte[] var2 = this.id_protected[2] ? rrQO.id_class((byte[])this.id_protected[id_implements[131]]) : (byte[])this.id_protected[id_implements[132]];
      int var3 = var2 != null ? var2.length - 1 : id_case[25];
      int var4 = (byte[])this.id_class[13] != null ? ((byte[])this.id_class[13]).length : id_case[26];
      boolean var5 = id_case[27];
      int var6 = id_case[28];
      byte var7 = id_case[29];
      boolean var8 = id_case[30];
      byte var9 = id_case[31];
      byte var10 = id_case[32];
      rrQO.id_break(var1, (Long)rrzH_2.id_class[10]);
      if (((Integer)this.id_class[4] & 8) != 0) {
         rrQO.id_class(var1, this.id_class(id_case[33]));
         rrQO.id_class(var1, (Integer)this.id_class[4]);
         rrQO.id_class(var1, (Integer)this.id_class[6]);
         rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[7])));
         rrQO.id_break(var1, id_catch[33]);
         rrQO.id_break(var1, id_catch[34]);
         rrQO.id_break(var1, id_catch[35]);
      } else {
         if ((Long)this.id_class[11] >= 4294967295L || (Long)this.id_class[12] >= 4294967295L) {
            var7 = 20;
            var8 = true;
         }

         rrQO.id_class(var1, this.id_class(var8));
         rrQO.id_class(var1, (Integer)this.id_class[4]);
         rrQO.id_class(var1, (Integer)this.id_class[6]);
         rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[7])));
         rrQO.id_break(var1, (Long)this.id_class[10]);
         if (var8) {
            rrQO.id_break(var1, 4294967295L);
            rrQO.id_break(var1, 4294967295L);
         } else {
            rrQO.id_break(var1, (Long)this.id_class[11]);
            rrQO.id_break(var1, (Long)this.id_class[12]);
         }
      }

      while (var6 + 4 < var4) {
         int var11 = rrzH_2.id_while((byte[])this.id_class[13], var6);
         int var12 = rrzH_2.id_while((byte[])this.id_class[13], var6 + 2);
         if (var11 == 21589 || var11 == 10) {
            var5 = true;
         }

         var6 += 4 + var12;
      }

      if (!var5) {
         if ((Boolean)rrzf_3.id_class[id_implements[151]]) {
            var10 = 36;
         } else {
            var9 = 9;
            if ((Long)this.id_class[8] != -1L) {
               var9 += 4;
            }

            if ((Long)this.id_class[9] != -1L) {
               var9 += 4;
            }
         }
      }

      rrQO.id_class(var1, var3);
      rrQO.id_class(var1, var4 + var7 + var10 + var9);
      rrQO.id_class(var1, var2, 1, var3);
      if (var8) {
         rrQO.id_class(var1, 1);
         rrQO.id_class(var1, 16);
         rrQO.id_class(var1, (Long)this.id_class[12]);
         rrQO.id_class(var1, (Long)this.id_class[11]);
      }

      if (var10 != 0) {
         rrQO.id_class(var1, 10);
         rrQO.id_class(var1, var10 - 4);
         rrQO.id_break(var1, id_catch[42]);
         rrQO.id_class(var1, 1);
         rrQO.id_class(var1, 24);
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[7]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[8]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[9]));
      }

      if (var9 != 0) {
         rrQO.id_class(var1, 21589);
         rrQO.id_class(var1, var9 - 4);
         byte var13 = 1;
         if ((Long)this.id_class[8] != -1L) {
            var13 |= 2;
         }

         if ((Long)this.id_class[9] != -1L) {
            var13 |= 4;
         }

         var1.write(var13);
         rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[7]));
         if ((Long)this.id_class[8] != -1L) {
            rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[8]));
         }

         if ((Long)this.id_class[9] != -1L) {
            rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[9]));
         }
      }

      if ((byte[])this.id_class[13] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[13]);
      }

      return 30 + var3 + var4 + var7 + var10 + var9;
   }

   @Override
   public byte[] id_throws() {
      this.id_final();
      return (byte[])this.id_class[15] != null ? Arrays.copyOf((byte[])this.id_class[15], ((byte[])this.id_class[15]).length) : null;
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{1, 2, 3, 4};
      id_break = var0;
   }

   private static void id_extends() {
      id_catch = new long[]{
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         0L,
         0L,
         0L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         0L,
         4294967295L,
         4294967295L,
         4294967295L,
         0L,
         -1L,
         0L,
         0L,
         0L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         -1L,
         -1L,
         0L,
         -1L,
         -1L,
         -1L,
         -1L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         30L,
         -1L,
         -1L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L
      };
   }

   @Override
   public long id_case() {
      this.id_final();
      return (Long)this.id_class[10];
   }

   private static void id_implements() {
      id_case = new boolean[]{
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
         true,
         false,
         false,
         false,
         false,
         true,
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
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
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
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
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
         true,
         true
      };
   }

   private static void id_package() {
      id_throws = new byte[]{
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         45,
         8,
         20,
         10,
         3,
         4,
         2,
         10,
         4,
         36,
         9,
         16,
         4,
         10,
         4,
         24,
         4,
         3,
         7,
         46,
         8,
         20,
         4,
         2,
         10,
         4,
         36,
         9,
         16,
         10,
         4,
         24,
         4,
         2,
         4,
         30,
         24,
         16,
         4,
         2,
         8,
         8,
         8,
         32,
         2,
         24,
         4,
         12,
         20,
         5,
         4,
         4,
         4,
         30,
         16,
         9,
         4,
         2,
         4,
         2,
         4,
         -1,
         16,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         14,
         4,
         2,
         2,
         3,
         3,
         4
      };
   }

   @Override
   public long id_protected() {
      this.id_final();
      return (Long)this.id_class[11];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[16];
         Object[] var1 = this.id_class;
         var1[2] = Integer.valueOf(id_case[85]);
         var1[3] = Integer.valueOf(id_case[86]);
         var1[4] = Integer.valueOf(id_case[87]);
         var1[5] = Integer.valueOf(id_case[88]);
         var1[6] = Integer.valueOf(id_case[89]);
         var1[7] = id_catch[56];
         var1[8] = id_catch[57];
         var1[9] = id_catch[58];
         var1[10] = id_catch[59];
         var1[11] = id_catch[60];
         var1[12] = id_catch[61];
         var1[14] = id_catch[62];
      }
   }

   private static void id_volatile() {
      id_finally = new int[]{65535};
   }

   private static void id_native() {
      id_private = new String[]{
         new String("posix:permissions"),
         new String("unsupported compression method"),
         new String("invalid CEN header (bad signature)"),
         new String("loc: reading failed"),
         new String("loc extra: reading failed"),
         new String("    name            : %s%n"),
         new String("    creationTime    : %tc%n"),
         new String("    lastAccessTime  : %tc%n"),
         new String("    lastModifiedTime: %tc%n"),
         new String("    isRegularFile   : %b%n"),
         new String("    isDirectory     : %b%n"),
         new String("    isSymbolicLink  : %b%n"),
         new String("    isOther         : %b%n"),
         new String("    fileKey         : %s%n"),
         new String("    size            : %d%n"),
         new String("    compressedSize  : %d%n"),
         new String("    crc             : %x%n"),
         new String("    method          : %d%n"),
         new String("    permissions     : %s%n")
      };
   }

   @Override
   public boolean isDirectory() {
      return this.id_catch();
   }

   @Override
   public FileTime lastModifiedTime() {
      this.id_final();
      return FileTime.fromMillis((Long)this.id_class[7]);
   }

   @Override
   public Object fileKey() {
      return null;
   }

   @Override
   public boolean isRegularFile() {
      return !this.id_catch() ? true : id_case[82];
   }

   @Override
   public FileTime lastAccessTime() {
      this.id_final();
      return FileTime.fromMillis(this.id_class[8] == -1L ? (Long)this.id_class[7] : (Long)this.id_class[8]);
   }

   @Override
   public FileTime creationTime() {
      this.id_final();
      return FileTime.fromMillis(this.id_class[9] == -1L ? (Long)this.id_class[7] : (Long)this.id_class[9]);
   }

   @Override
   public boolean isSymbolicLink() {
      return id_case[83];
   }

   @Override
   public boolean isOther() {
      return id_case[80];
   }
}
