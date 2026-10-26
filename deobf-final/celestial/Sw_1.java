package celestial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sw_1 implements C_continue {
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static String[] throws_;
   private static short[] case_;
   private static long[] catch_;
   private static int[] private_;

   public synchronized void byte_(String var1) {
      if ((Boolean)this.break_[4]) {
         this.byte_();

         try {
            Path var2 = Paths.get(var1);
            if (!Files.exists(var2)) {
               Files.createDirectories(var2);
            }

            Path var3 = class_(var2, (Integer)this.break_[case_[13]], (Integer)this.break_[case_[14]]);
            if (!Files.exists(var3)) {
               Files.createFile(var3);
            }

            try (
               FileOutputStream var4 = new FileOutputStream(var3.toFile());
               GZIPOutputStream var5 = new GZIPOutputStream(var4, case_[15]);
               DataOutputStream var6 = new DataOutputStream(var5);
            ) {
               var6.writeInt(private_[0]);

               for (int var7 = byte_[11]; var7 < protected_[10]; var7++) {
                  for (int var8 = byte_[12]; var8 < protected_[11]; var8++) {
                     St_1 var9 = ((St_1[][])this.break_[case_[16]])[var7][var8];
                     if (var9 == null) {
                        var6.write(byte_[13]);
                     } else {
                        var6.write(byte_[14]);
                        byte[] var10 = var9.byte_();
                        var6.write(var10);
                        var6.write(new byte[case_[17] - var10.length]);
                     }
                  }
               }

               for (int var26 = byte_[15]; var26 < protected_[12]; var26++) {
                  for (int var29 = byte_[16]; var29 < protected_[13]; var29++) {
                     if (((St_1[][])this.break_[case_[18]])[var26][var29] != null) {
                        for (int var32 = byte_[17]; var32 < case_[19]; var32++) {
                           var6.writeUTF(ri_3.class_(((St_1[][])this.break_[case_[20]])[var26][var29].class_()[var32].break_()));
                        }
                     }
                  }
               }

               for (int var27 = byte_[18]; var27 < protected_[14]; var27++) {
                  for (int var30 = byte_[19]; var30 < protected_[15]; var30++) {
                     if (((St_1[][])this.break_[case_[21]])[var27][var30] != null) {
                        Map var33 = ((St_1[][])this.break_[case_[22]])[var27][var30].break_();
                        var6.writeShort(var33.entrySet().size());

                        for (Entry var11 : var33.entrySet()) {
                           var6.writeUTF((String)var11.getKey());
                           var6.writeShort(((List)var11.getValue()).size());

                           for (rfH_2 var13 : (List)var11.getValue()) {
                              var6.writeByte((byte)(var13.d_() << protected_[16] | var13.b_()));
                              var6.writeByte((byte)var13.c_());
                           }
                        }
                     }
                  }
               }

               for (int var28 = byte_[20]; var28 < protected_[17]; var28++) {
                  for (int var31 = byte_[21]; var31 < protected_[18]; var31++) {
                     if (((St_1[][])this.break_[case_[23]])[var28][var31] != null) {
                        var6.writeLong((Long)((St_1[][])this.break_[case_[24]])[var28][var31].break_[case_[25]]);
                     }
                  }
               }
            }

            Boolean var18 = byte_[22];
            this.break_[case_[26]] = var18;
         } catch (Exception var25) {
            var25.printStackTrace();
         }
      }
   }

   public synchronized void byte_() {
      long var1 = (Long)C_class.instanceof_().strictfp_.class_[0];
      if (var1 >= 0L) {
         long var3 = System.currentTimeMillis();
         long var5 = var3 - var1 * 1000L;

         for (int var7 = 0; var7 < 32; var7++) {
            for (int var8 = 0; var8 < 32; var8++) {
               if (((St_1[][])this.break_[0])[var7][var8] != null && (Long)((St_1[][])this.break_[0])[var7][var8].break_[7] < var5) {
                  System.out
                     .println(
                        "Removing chunk "
                           + (var7 + 32 * (Integer)this.break_[1])
                           + ","
                           + (var8 + 32 * (Integer)this.break_[2])
                           + " because it was cached "
                           + (var3 - (Long)((St_1[][])this.break_[0])[var7][var8].break_[7]) / 1000L
                           + " seconds ago, and max age is "
                           + var1
                     );
                  ((St_1[][])this.break_[0])[var7][var8] = null;
               }
            }
         }
      }
   }

   public Sw_1(int var1, int var2, rqM_2<rYB> var3) {
      this.private_();
      St_1[][] var8 = new St_1[32][32];
      this.break_[0] = var8;
      Integer var9 = var1;
      this.break_[1] = var9;
      Integer var10 = var2;
      this.break_[2] = var10;
      Boolean var11 = false;
      this.break_[4] = var11;
      this.break_[3] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public int class_() {
      return (Integer)this.break_[2];
   }

   private static Path class_(Path var0, int var1, int var2) {
      return Paths.get(var0.toString(), "r." + var1 + "." + var2 + ".bcr");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707862014;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7135826876099624916L;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return ((St_1[][])this.break_[0])[var1 >> 4][var2 >> 4] != null ? true : byte_[2];
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3) {
      St_1 var4 = ((St_1[][])this.break_[0])[var1 >> 4][var3 >> 4];
      return var4 != null ? var4.class_(var1 & 15, var2, var3 & 15, (rqM_2<rYB>)this.break_[3]) : null;
   }

   public synchronized void class_(int var1, int var2, St_1 var3) {
      ((St_1[][])this.break_[0])[var1][var2] = var3;
      Boolean var8 = true;
      this.break_[4] = var8;
   }

   public synchronized void class_(String var1) {
      try {
         Path var2 = Paths.get(var1);
         if (!Files.exists(var2)) {
            Files.createDirectories(var2);
         }

         Path var3 = class_(var2, (Integer)this.break_[case_[27]], (Integer)this.break_[case_[28]]);
         if (!Files.exists(var3)) {
            return;
         }

         long var4 = System.nanoTime() / catch_[0];

         try (
            FileInputStream var6 = new FileInputStream(var3.toFile());
            GZIPInputStream var7 = new GZIPInputStream(var6, private_[1]);
            DataInputStream var8 = new DataInputStream(var7);
         ) {
            int var9 = var8.readInt();
            if (var9 != private_[2]) {
               throw new IOException("Bad magic value " + var9);
            }

            boolean[][] var10 = new boolean[protected_[19]][protected_[20]];
            BitSet[][] var11 = new BitSet[protected_[21]][protected_[22]];
            Map[][] var12 = new Map[protected_[23]][protected_[24]];
            xc_3[][][] var13 = new xc_3[protected_[25]][protected_[26]][];
            long[][] var14 = new long[protected_[27]][protected_[28]];

            for (int var15 = byte_[27]; var15 < protected_[29]; var15++) {
               for (int var16 = byte_[28]; var16 < protected_[30]; var16++) {
                  int var17 = var8.read();
                  switch (var17) {
                     case 1:
                        byte[] var18 = new byte[case_[29]];
                        var8.readFully(var18);
                        var11[var15][var16] = BitSet.valueOf(var18);
                        var12[var15][var16] = new HashMap();
                        var13[var15][var16] = new xc_3[case_[30]];
                        var10[var15][var16] = byte_[29];
                        break;
                     case 0:
                     default:
                        throw new IOException(throws_[0]);
                  }
               }
            }

            for (int var40 = byte_[30]; var40 < protected_[31]; var40++) {
               for (int var44 = byte_[31]; var44 < protected_[32]; var44++) {
                  if (var10[var40][var44]) {
                     for (int var48 = byte_[32]; var48 < case_[31]; var48++) {
                        var13[var40][var44][var48] = ri_3.break_(var8.readUTF()).continue_();
                     }
                  }
               }
            }

            for (int var41 = byte_[33]; var41 < protected_[33]; var41++) {
               for (int var45 = byte_[34]; var45 < protected_[34]; var45++) {
                  if (var10[var41][var45]) {
                     int var49 = var8.readShort() & private_[3];

                     for (int var51 = byte_[35]; var51 < var49; var51++) {
                        String var19 = var8.readUTF();
                        ri_3.break_(var19);
                        ArrayList var20 = new ArrayList();
                        var12[var41][var45].put(var19, var20);
                        int var21 = var8.readShort() & private_[4];
                        if (var21 == 0) {
                           var21 = private_[5];
                        }

                        for (int var22 = byte_[36]; var22 < var21; var22++) {
                           byte var23 = var8.readByte();
                           int var24 = var23 & protected_[35];
                           int var25 = var23 >>> protected_[36] & protected_[37];
                           int var26 = var8.readByte() & case_[32];
                           var20.add(new rfH_2(var24, var26, var25));
                        }
                     }
                  }
               }
            }

            for (int var42 = byte_[37]; var42 < protected_[38]; var42++) {
               for (int var46 = byte_[38]; var46 < protected_[39]; var46++) {
                  if (var10[var42][var46]) {
                     var14[var42][var46] = var8.readLong();
                  }
               }
            }

            for (int var43 = byte_[39]; var43 < protected_[40]; var43++) {
               for (int var47 = byte_[40]; var47 < protected_[41]; var47++) {
                  if (var10[var43][var47]) {
                     int var50 = (Integer)this.break_[case_[33]];
                     int var52 = (Integer)this.break_[case_[34]];
                     int var53 = var43 + protected_[42] * var50;
                     int var54 = var47 + protected_[43] * var52;
                     ((St_1[][])this.break_[case_[35]])[var43][var47] = new St_1(
                        var53, var54, var11[var43][var47], var13[var43][var47], var12[var43][var47], var14[var43][var47]
                     );
                  }
               }
            }
         }

         this.byte_();
         Boolean var31 = byte_[41];
         this.break_[case_[36]] = var31;
         long var39 = System.nanoTime() / catch_[1];
      } catch (Exception var38) {
         var38.printStackTrace();
      }
   }

   @Override
   public int break_() {
      return (Integer)this.break_[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -107, -116, 120, 114, -56, 73, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      Object[] var0 = new Object[]{(byte)0, (byte)1, 456022910};
      class_ = var0;
   }

   private static void finally_() {
      case_ = new short[]{
         0,
         1,
         2,
         4,
         3,
         0,
         3,
         0,
         0,
         0,
         0,
         4,
         4,
         1,
         2,
         16384,
         0,
         16384,
         0,
         256,
         0,
         0,
         0,
         0,
         0,
         7,
         4,
         1,
         2,
         16384,
         256,
         256,
         255,
         1,
         2,
         0,
         4,
         0,
         0,
         0,
         7,
         1,
         2,
         0,
         7,
         0,
         0,
         0,
         7,
         7,
         0,
         1,
         2
      };
   }

   private static void catch_() {
      byte_ = new boolean[]{
         false,
         true,
         false,
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
         false,
         false,
         false,
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
         false,
         false,
         false,
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
         false,
         false,
         true,
         true
      };
   }

   private static void extends_() {
      protected_ = new byte[]{
         32,
         32,
         4,
         4,
         15,
         15,
         4,
         4,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         4,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         15,
         4,
         15,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         32,
         5,
         2,
         4,
         3,
         2
      };
   }

   private static void case_() {
      private_ = new int[]{456022910, 32768, 456022910, 65535, 65535, 65536, 456022910};
   }

   private static void implements_() {
      throws_ = new String[]{new String("Malformed stream")};
   }

   public synchronized St_1 protected_() {
      St_1 var1 = null;

      for (int var2 = 0; var2 < 32; var2++) {
         for (int var3 = 0; var3 < 32; var3++) {
            if (((St_1[][])this.break_[0])[var2][var3] != null
               && (var1 == null || (Long)((St_1[][])this.break_[0])[var2][var3].break_[7] > (Long)var1.break_[7])) {
               var1 = ((St_1[][])this.break_[0])[var2][var3];
            }
         }
      }

      return var1;
   }

   public ArrayList<rfH_2> protected_(String var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 32; var4++) {
            if (((St_1[][])this.break_[0])[var3][var4] != null) {
               ArrayList var5 = ((St_1[][])this.break_[0])[var3][var4].class_(var1);
               if (var5 != null) {
                  var2.addAll(var5);
               }
            }
         }
      }

      return var2;
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[1] = 0;
         var1[2] = 0;
         var1[4] = false;
      }
   }

   private static void native_() {
      catch_ = new long[]{1000000L, 1000000L, 0L, 1000L, 1000L};
   }
}
