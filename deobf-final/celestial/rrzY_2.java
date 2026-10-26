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
   private static byte[] throws_;
   private static boolean[] case_;
   private static long[] catch_;
   private static String[] private_;
   private static short[] implements_;
   public Object[] class_;
   private static int[] finally_;
   public static Object[] break_;

   int byte_(OutputStream var1) throws IOException {
      this.final_();
      rrQO.break_(var1, (Long)rrzH_2.class_[11]);
      rrQO.break_(var1, (Long)this.class_[10]);
      if ((Long)this.class_[11] < 4294967295L && (Long)this.class_[12] < 4294967295L) {
         rrQO.break_(var1, (Long)this.class_[11]);
         rrQO.break_(var1, (Long)this.class_[12]);
         return 16;
      } else {
         rrQO.class_(var1, (Long)this.class_[11]);
         rrQO.class_(var1, (Long)this.class_[12]);
         return 24;
      }
   }

   @Override
   public byte[] byte_() {
      this.final_();
      return (byte[])this.class_[13] != null ? Arrays.copyOf((byte[])this.class_[13], ((byte[])this.class_[13]).length) : null;
   }

   private static void int_() {
      implements_ = new short[]{
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
      this.final_();
      Integer var7 = 1;
      this.class_[2] = var7;
      Integer var8 = -1;
      this.class_[5] = var8;
      Integer var9 = -1;
      this.class_[6] = var9;
      Long var10 = -1L;
      this.class_[7] = var10;
      Long var11 = -1L;
      this.class_[8] = var11;
      Long var12 = -1L;
      this.class_[9] = var12;
      Long var13 = -1L;
      this.class_[10] = var13;
      Long var14 = -1L;
      this.class_[11] = var14;
      Long var15 = -1L;
      this.class_[12] = var15;
      this.class_(var1, var2);
   }

   public rrzY_2(byte[] var1, boolean var2, int var3) {
      this.final_();
      Integer var8 = 1;
      this.class_[2] = var8;
      Integer var9 = -1;
      this.class_[5] = var9;
      Integer var10 = -1;
      this.class_[6] = var10;
      Long var11 = -1L;
      this.class_[7] = var11;
      Long var12 = -1L;
      this.class_[8] = var12;
      Long var13 = -1L;
      this.class_[9] = var13;
      Long var14 = -1L;
      this.class_[10] = var14;
      Long var15 = -1L;
      this.class_[11] = var15;
      Long var16 = -1L;
      this.class_[12] = var16;
      this.break_(var1);
      Boolean var17 = var2;
      this.protected_[2] = var17;
      long var10004 = System.currentTimeMillis();
      Long var18 = var10004;
      this.class_[8] = var18;
      Long var19 = var10004;
      this.class_[9] = var19;
      Long var20 = var10004;
      this.class_[7] = var20;
      Long var21 = 0L;
      this.class_[10] = var21;
      Long var22 = 0L;
      this.class_[12] = var22;
      Long var23 = 0L;
      this.class_[11] = var23;
      Integer var24 = var3;
      this.class_[6] = var24;
   }

   public rrzY_2(rrzY_2 var1, int var2, int var3) {
      this(var1, var2);
      Integer var8 = var3;
      this.class_[6] = var8;
   }

   public rrzY_2(byte[] var1, Path var2, int var3, FileAttribute<?>... var4) {
      this(var1, var3, false, 0, var4);
      this.class_[1] = var2;
   }

   public rrzY_2(byte[] var1, int var2, boolean var3, int var4, FileAttribute<?>... var5) {
      this(var1, var3, var4);
      Integer var15 = var2;
      this.class_[2] = var15;

      for (FileAttribute var9 : var5) {
         String var10 = var9.name();
         if (var10.equals("posix:permissions")) {
            Integer var16 = rrQO.class_((Set<PosixFilePermission>)var9.value());
            this.class_[5] = var16;
         }
      }
   }

   public rrzY_2(rrzY_2 var1, int var2) {
      this.final_();
      Integer var7 = 1;
      this.class_[2] = var7;
      Integer var8 = -1;
      this.class_[5] = var8;
      Integer var9 = -1;
      this.class_[6] = var9;
      Long var10 = -1L;
      this.class_[7] = var10;
      Long var11 = -1L;
      this.class_[8] = var11;
      Long var12 = -1L;
      this.class_[9] = var12;
      Long var13 = -1L;
      this.class_[10] = var13;
      Long var14 = -1L;
      this.class_[11] = var14;
      Long var15 = -1L;
      this.class_[12] = var15;
      this.break_((byte[])var1.protected_[0]);
      Boolean var16 = (Boolean)var1.protected_[2];
      this.protected_[2] = var16;
      Integer var17 = (Integer)var1.class_[3];
      this.class_[3] = var17;
      Long var18 = (Long)var1.class_[9];
      this.class_[9] = var18;
      Long var19 = (Long)var1.class_[8];
      this.class_[8] = var19;
      Long var20 = (Long)var1.class_[7];
      this.class_[7] = var20;
      Long var21 = (Long)var1.class_[10];
      this.class_[10] = var21;
      Long var22 = (Long)var1.class_[12];
      this.class_[12] = var22;
      Long var23 = (Long)var1.class_[11];
      this.class_[11] = var23;
      Integer var24 = (Integer)var1.class_[6];
      this.class_[6] = var24;
      byte[] var25 = (byte[])var1.class_[13];
      this.class_[13] = var25;
      Long var26 = (Long)var1.class_[14];
      this.class_[14] = var26;
      byte[] var27 = (byte[])var1.class_[15];
      this.class_[15] = var27;
      Integer var28 = (Integer)var1.class_[5];
      this.class_[5] = var28;
      Integer var29 = var2;
      this.class_[2] = var29;
   }

   static {
      ntfClinit();
   }

   @Override
   public long size() {
      this.final_();
      return (Long)this.class_[12];
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(1024);
      Formatter var2 = new Formatter(var1);
      var2.format("    name            : %s%n", this.private_());
      var2.format("    creationTime    : %tc%n", this.creationTime().toMillis());
      var2.format("    lastAccessTime  : %tc%n", this.lastAccessTime().toMillis());
      var2.format("    lastModifiedTime: %tc%n", this.lastModifiedTime().toMillis());
      var2.format("    isRegularFile   : %b%n", this.isRegularFile());
      var2.format("    isDirectory     : %b%n", this.isDirectory());
      var2.format("    isSymbolicLink  : %b%n", this.isSymbolicLink());
      var2.format("    isOther         : %b%n", this.isOther());
      var2.format("    fileKey         : %s%n", this.fileKey());
      var2.format("    size            : %d%n", this.size());
      var2.format("    compressedSize  : %d%n", this.protected_());
      var2.format("    crc             : %x%n", this.case_());
      var2.format("    method          : %d%n", this.break_());
      Set var3 = this.class_().orElse(null);
      if (var3 != null) {
         var2.format("    permissions     : %s%n", var3);
      }

      var2.close();
      return var1.toString();
   }

   private void class_(rrzf_3 var1, rrzi_3 var2) throws IOException {
      this.final_();
      byte[] var3 = (byte[])var1.break_[21];
      int var4 = (Integer)var2.protected_[3];
      if (!rrzH_2.break_(var3, var4)) {
         throw new ZipException("invalid CEN header (bad signature)");
      } else {
         Integer var12 = rrzH_2.interface_(var3, var4);
         this.class_[3] = var12;
         Integer var13 = rrzH_2.else_(var3, var4);
         this.class_[4] = var13;
         Integer var14 = rrzH_2.synchronized_(var3, var4);
         this.class_[6] = var14;
         Long var15 = rrQO.break_(rrzH_2.volatile_(var3, var4));
         this.class_[7] = var15;
         Long var16 = rrzH_2.protected_(var3, var4);
         this.class_[10] = var16;
         Long var17 = rrzH_2.finally_(var3, var4);
         this.class_[11] = var17;
         Long var18 = rrzH_2.int_(var3, var4);
         this.class_[12] = var18;
         int var5 = rrzH_2.super_(var3, var4);
         int var6 = rrzH_2.instanceof_(var3, var4);
         int var7 = rrzH_2.implements_(var3, var4);
         if (rrzH_2.private_(var3, var4) == 3) {
            Integer var19 = rrzH_2.byte_(var3, var4) & 4095;
            this.class_[5] = var19;
         }

         Long var20 = rrzH_2.throw_(var3, var4);
         this.class_[14] = var20;
         var4 += 46;
         byte[] var21 = (byte[])var2.protected_[0];
         this.protected_[0] = var21;
         Boolean var22 = (Boolean)var2.protected_[2];
         this.protected_[2] = var22;
         Integer var23 = (Integer)var2.protected_[1];
         this.protected_[1] = var23;
         var4 += var5;
         if (var6 > 0) {
            byte[] var24 = Arrays.copyOfRange(var3, var4, var4 + var6);
            this.class_[13] = var24;
            var4 += var6;
            this.break_(var1);
         }

         if (var7 > 0) {
            byte[] var25 = Arrays.copyOfRange(var3, var4, var4 + var7);
            this.class_[15] = var25;
         }
      }
   }

   int class_(OutputStream var1) throws IOException {
      this.final_();
      long var2 = (Long)this.class_[11];
      long var4 = (Long)this.class_[12];
      long var6 = (Long)this.class_[14];
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      boolean var11 = false;
      byte[] var12 = this.protected_[2] ? rrQO.class_((byte[])this.protected_[0]) : (byte[])this.protected_[0];
      int var13 = var12 != null ? var12.length - 1 : case_[11];
      int var14 = (byte[])this.class_[13] != null ? ((byte[])this.class_[13]).length : case_[12];
      int var15 = 0;
      int var16 = (byte[])this.class_[15] != null ? ((byte[])this.class_[15]).length : case_[14];
      if ((Long)this.class_[11] >= 4294967295L) {
         var2 = 4294967295L;
         var8 += 8;
      }

      if ((Long)this.class_[12] >= 4294967295L) {
         var4 = 4294967295L;
         var8 += 8;
      }

      if ((Long)this.class_[14] >= 4294967295L) {
         var6 = 4294967295L;
         var8 += 8;
      }

      if (var8 != 0) {
         var8 += 4;
      }

      boolean var17 = var8 != 0 ? true : case_[16];
      int var18 = this.class_(var17);

      while (var15 + 4 < var14) {
         int var19 = rrzH_2.while_((byte[])this.class_[13], var15);
         int var20 = rrzH_2.while_((byte[])this.class_[13], var15 + 2);
         if (var19 == 21589 || var19 == 10) {
            var11 = case_[17];
         }

         var15 += 4 + var20;
      }

      if (!var11) {
         if ((Boolean)rrzf_3.class_[0]) {
            var9 = 36;
         } else {
            var10 = throws_[16];
         }
      }

      rrQO.break_(var1, (Long)rrzH_2.class_[12]);
      rrQO.class_(var1, this.break_(var18));
      rrQO.class_(var1, var18);
      rrQO.class_(var1, (Integer)this.class_[4]);
      rrQO.class_(var1, (Integer)this.class_[6]);
      rrQO.break_(var1, (long)((int)rrQO.case_((Long)this.class_[7])));
      rrQO.break_(var1, (Long)this.class_[10]);
      rrQO.break_(var1, var2);
      rrQO.break_(var1, var4);
      rrQO.class_(var1, var13);
      rrQO.class_(var1, var14 + var8 + var9 + var10);
      if ((byte[])this.class_[15] != null) {
         rrQO.class_(var1, Math.min(var16, 65535));
      } else {
         rrQO.class_(var1, 0);
      }

      rrQO.class_(var1, 0);
      rrQO.class_(var1, 0);
      rrQO.break_(var1, this.class_[5] > 0 ? (long)((Integer)this.class_[5] << 16) : catch_[27]);
      rrQO.break_(var1, var6);
      rrQO.class_(var1, var12, 1, var13);
      if (var17) {
         rrQO.class_(var1, 1);
         rrQO.class_(var1, var8 - 4);
         if (var4 == 4294967295L) {
            rrQO.class_(var1, (Long)this.class_[12]);
         }

         if (var2 == 4294967295L) {
            rrQO.class_(var1, (Long)this.class_[11]);
         }

         if (var6 == 4294967295L) {
            rrQO.class_(var1, (Long)this.class_[14]);
         }
      }

      if (var9 != 0) {
         rrQO.class_(var1, 10);
         rrQO.class_(var1, var9 - 4);
         rrQO.break_(var1, 0L);
         rrQO.class_(var1, 1);
         rrQO.class_(var1, 24);
         rrQO.class_(var1, rrQO.class_((Long)this.class_[7]));
         rrQO.class_(var1, rrQO.class_((Long)this.class_[8]));
         rrQO.class_(var1, rrQO.class_((Long)this.class_[9]));
      }

      if (var10 != 0) {
         rrQO.class_(var1, 21589);
         rrQO.class_(var1, var10 - 4);
         if ((Long)this.class_[9] == -1L) {
            var1.write(3);
         } else {
            var1.write(7);
         }

         rrQO.break_(var1, rrQO.byte_((Long)this.class_[7]));
      }

      if ((byte[])this.class_[13] != null) {
         rrQO.class_(var1, (byte[])this.class_[13]);
      }

      if ((byte[])this.class_[15] != null) {
         rrQO.class_(var1, (byte[])this.class_[15]);
      }

      return throws_[25] + var13 + var14 + var16 + var8 + var9 + var10;
   }

   private int class_(boolean var1) throws ZipException {
      this.final_();
      if (var1) {
         return 45;
      } else if ((Integer)this.class_[6] == 8) {
         return 20;
      } else if ((Integer)this.class_[6] == 0) {
         return 10;
      } else {
         throw new ZipException("unsupported compression method");
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 88, -40, 53, -29, 0, -20, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Optional<Set<PosixFilePermission>> class_() {
      this.final_();
      HashSet var1 = null;
      if ((Integer)this.class_[5] != -1) {
         var1 = new HashSet(PosixFilePermission.values().length);

         for (PosixFilePermission var5 : PosixFilePermission.values()) {
            if (((Integer)this.class_[5] & rrQO.class_(var5)) != 0) {
               var1.add(var5);
            }
         }
      }

      return Optional.ofNullable(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1566707947;
   }

   private void class_(rrzf_3 var1) throws IOException {
      this.final_();
      byte[] var2 = new byte[30];
      if (var1.class_(var2, 0, (long)var2.length, (Long)this.class_[14]) != (long)var2.length) {
         throw new ZipException("loc: reading failed");
      } else if (!rrzH_2.new_(var2, 0)) {
         throw new ZipException("R" + Long.toString(rrzH_2.case_(var2, 0), 16));
      } else {
         int var3 = rrzH_2.volatile_(var2);
         if (var3 >= 9) {
            int var4 = rrzH_2.extends_(var2);
            var2 = new byte[var3];
            if (var1.class_(var2, 0, (long)var2.length, (Long)this.class_[14] + 30L + (long)var4) != (long)var2.length) {
               throw new ZipException("loc extra: reading failed");
            } else {
               int var5 = case_[50];

               while (var5 + 4 < var2.length) {
                  int var6 = rrzH_2.while_(var2, var5);
                  int var7 = rrzH_2.while_(var2, var5 + 2);
                  var5 += 4;
                  if (var6 == 21589) {
                     int var8 = var5 + var7 - 4;
                     int var9 = rrzH_2.final_(var2, var5++);
                     if ((var9 & 1) != 0 && var5 <= var8) {
                        Long var14 = rrQO.throws_(rrzH_2.try_(var2, var5));
                        this.class_[7] = var14;
                        var5 += 4;
                     }

                     if ((var9 & 2) != 0 && var5 <= var8) {
                        Long var15 = rrQO.throws_(rrzH_2.try_(var2, var5));
                        this.class_[8] = var15;
                        var5 += 4;
                     }

                     if ((var9 & 4) != 0 && var5 <= var8) {
                        Long var16 = rrQO.throws_(rrzH_2.try_(var2, var5));
                        this.class_[9] = var16;
                     }
                     break;
                  }

                  var5 += var7;
               }
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6526717619808680707L;
   }

   private int break_(int var1) {
      this.final_();
      return this.class_[5] < 0 ? var1 : implements_[70] | var1 & 0xFF;
   }

   @Override
   public int break_() {
      this.final_();
      return (Integer)this.class_[6];
   }

   private void break_(rrzf_3 var1) throws IOException {
      this.final_();
      if ((byte[])this.class_[13] != null) {
         int var2 = ((byte[])this.class_[13]).length;
         int var3 = 0;
         int var4 = 0;
         boolean var5 = false;

         while (var3 + 4 < var2) {
            int var7 = rrzH_2.while_((byte[])this.class_[13], var3);
            int var8 = rrzH_2.while_((byte[])this.class_[13], var3 + 2);
            int var6 = var3 + 4;
            if (var6 + var8 > var2) {
               break;
            }

            switch (var7) {
               case 1:
                  if ((Long)this.class_[12] == 4294967295L) {
                     if (var6 + 8 > var2) {
                        break;
                     }

                     Long var13 = rrzH_2.catch_((byte[])this.class_[13], var6);
                     this.class_[12] = var13;
                     var6 += 8;
                  }

                  if ((Long)this.class_[11] == 4294967295L) {
                     if (var6 + 8 > var2) {
                        break;
                     }

                     Long var14 = rrzH_2.catch_((byte[])this.class_[13], var6);
                     this.class_[11] = var14;
                     var6 += 8;
                  }

                  if ((Long)this.class_[14] == 4294967295L && var6 + 8 <= var2) {
                     Long var15 = rrzH_2.catch_((byte[])this.class_[13], var6);
                     this.class_[14] = var15;
                  }
                  break;
               case 10:
                  if (var8 >= 32) {
                     var6 += 4;
                     if (rrzH_2.while_((byte[])this.class_[13], var6) == 1 && rrzH_2.while_((byte[])this.class_[13], var6 + 2) == 24) {
                        Long var16 = rrQO.protected_(rrzH_2.catch_((byte[])this.class_[13], var6 + 4));
                        this.class_[7] = var16;
                        Long var17 = rrQO.protected_(rrzH_2.catch_((byte[])this.class_[13], var6 + 12));
                        this.class_[8] = var17;
                        Long var18 = rrQO.protected_(rrzH_2.catch_((byte[])this.class_[13], var6 + 20));
                        this.class_[9] = var18;
                     }
                  }
                  break;
               case 21589:
                  if ((Boolean)var1.break_[6]) {
                     if (var8 == 5) {
                        Long var19 = rrQO.throws_(rrzH_2.try_((byte[])this.class_[13], var6 + 1));
                        this.class_[7] = var19;
                     }
                  } else if ((Long)this.class_[14] != 4294967295L) {
                     this.class_(var1);
                  } else {
                     var5 = case_[45];
                  }
                  break;
               default:
                  System.arraycopy((byte[])this.class_[13], var3, (byte[])this.class_[13], var4, var8 + 4);
                  var4 += var8 + 4;
            }

            var3 += var8 + 4;
         }

         if (var5) {
            this.class_(var1);
         }

         if (var4 != 0 && var4 != ((byte[])this.class_[13]).length) {
            byte[] var20 = Arrays.copyOf((byte[])this.class_[13], var4);
            this.class_[13] = var20;
         } else {
            Object var21 = null;
            this.class_[13] = var21;
         }
      }
   }

   int break_(OutputStream var1) throws IOException {
      this.final_();
      byte[] var2 = this.protected_[2] ? rrQO.class_((byte[])this.protected_[0]) : (byte[])this.protected_[0];
      int var3 = var2 != null ? var2.length - 1 : case_[25];
      int var4 = (byte[])this.class_[13] != null ? ((byte[])this.class_[13]).length : case_[26];
      boolean var5 = false;
      int var6 = 0;
      byte var7 = 0;
      boolean var8 = false;
      byte var9 = 0;
      byte var10 = 0;
      rrQO.break_(var1, (Long)rrzH_2.class_[10]);
      if (((Integer)this.class_[4] & 8) != 0) {
         rrQO.class_(var1, this.class_(false));
         rrQO.class_(var1, (Integer)this.class_[4]);
         rrQO.class_(var1, (Integer)this.class_[6]);
         rrQO.break_(var1, (long)((int)rrQO.case_((Long)this.class_[7])));
         rrQO.break_(var1, 0L);
         rrQO.break_(var1, 0L);
         rrQO.break_(var1, 0L);
      } else {
         if ((Long)this.class_[11] >= 4294967295L || (Long)this.class_[12] >= 4294967295L) {
            var7 = throws_[27];
            var8 = true;
         }

         rrQO.class_(var1, this.class_(var8));
         rrQO.class_(var1, (Integer)this.class_[4]);
         rrQO.class_(var1, (Integer)this.class_[6]);
         rrQO.break_(var1, (long)((int)rrQO.case_((Long)this.class_[7])));
         rrQO.break_(var1, (Long)this.class_[10]);
         if (var8) {
            rrQO.break_(var1, 4294967295L);
            rrQO.break_(var1, 4294967295L);
         } else {
            rrQO.break_(var1, (Long)this.class_[11]);
            rrQO.break_(var1, (Long)this.class_[12]);
         }
      }

      while (var6 + 4 < var4) {
         int var11 = rrzH_2.while_((byte[])this.class_[13], var6);
         int var12 = rrzH_2.while_((byte[])this.class_[13], var6 + 2);
         if (var11 == 21589 || var11 == 10) {
            var5 = case_[35];
         }

         var6 += 4 + var12;
      }

      if (!var5) {
         if ((Boolean)rrzf_3.class_[0]) {
            var10 = 36;
         } else {
            var9 = throws_[33];
            if ((Long)this.class_[8] != -1L) {
               var9 += 4;
            }

            if ((Long)this.class_[9] != -1L) {
               var9 += 4;
            }
         }
      }

      rrQO.class_(var1, var3);
      rrQO.class_(var1, var4 + var7 + var10 + var9);
      rrQO.class_(var1, var2, 1, var3);
      if (var8) {
         rrQO.class_(var1, 1);
         rrQO.class_(var1, 16);
         rrQO.class_(var1, (Long)this.class_[12]);
         rrQO.class_(var1, (Long)this.class_[11]);
      }

      if (var10 != 0) {
         rrQO.class_(var1, 10);
         rrQO.class_(var1, var10 - 4);
         rrQO.break_(var1, 0L);
         rrQO.class_(var1, 1);
         rrQO.class_(var1, 24);
         rrQO.class_(var1, rrQO.class_((Long)this.class_[7]));
         rrQO.class_(var1, rrQO.class_((Long)this.class_[8]));
         rrQO.class_(var1, rrQO.class_((Long)this.class_[9]));
      }

      if (var9 != 0) {
         rrQO.class_(var1, 21589);
         rrQO.class_(var1, var9 - 4);
         byte var13 = 1;
         if ((Long)this.class_[8] != -1L) {
            var13 |= 2;
         }

         if ((Long)this.class_[9] != -1L) {
            var13 |= 4;
         }

         var1.write(var13);
         rrQO.break_(var1, rrQO.byte_((Long)this.class_[7]));
         if ((Long)this.class_[8] != -1L) {
            rrQO.break_(var1, rrQO.byte_((Long)this.class_[8]));
         }

         if ((Long)this.class_[9] != -1L) {
            rrQO.break_(var1, rrQO.byte_((Long)this.class_[9]));
         }
      }

      if ((byte[])this.class_[13] != null) {
         rrQO.class_(var1, (byte[])this.class_[13]);
      }

      return throws_[41] + var3 + var4 + var7 + var10 + var9;
   }

   @Override
   public byte[] throws_() {
      this.final_();
      return (byte[])this.class_[15] != null ? Arrays.copyOf((byte[])this.class_[15], ((byte[])this.class_[15]).length) : null;
   }

   private static void finally_() {
      Object[] var0 = new Object[]{1, 2, 3, 4};
      break_ = var0;
   }

   private static void extends_() {
      catch_ = new long[]{
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
   public long case_() {
      this.final_();
      return (Long)this.class_[10];
   }

   private static void implements_() {
      case_ = new boolean[]{
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

   private static void package_() {
      throws_ = new byte[]{
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
   public long protected_() {
      this.final_();
      return (Long)this.class_[11];
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[16];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
         var1[7] = 0L;
         var1[8] = 0L;
         var1[9] = 0L;
         var1[10] = 0L;
         var1[11] = 0L;
         var1[12] = 0L;
         var1[14] = 0L;
      }
   }

   private static void volatile_() {
      finally_ = new int[]{65535};
   }

   private static void native_() {
      private_ = new String[]{
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
      return this.catch_();
   }

   @Override
   public FileTime lastModifiedTime() {
      this.final_();
      return FileTime.fromMillis((Long)this.class_[7]);
   }

   @Override
   public Object fileKey() {
      return null;
   }

   @Override
   public boolean isRegularFile() {
      return !this.catch_() ? true : case_[82];
   }

   @Override
   public FileTime lastAccessTime() {
      this.final_();
      return FileTime.fromMillis(this.class_[8] == -1L ? (Long)this.class_[7] : (Long)this.class_[8]);
   }

   @Override
   public FileTime creationTime() {
      this.final_();
      return FileTime.fromMillis(this.class_[9] == -1L ? (Long)this.class_[7] : (Long)this.class_[9]);
   }

   @Override
   public boolean isSymbolicLink() {
      return false;
   }

   @Override
   public boolean isOther() {
      return false;
   }
}
