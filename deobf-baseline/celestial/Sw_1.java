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
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;
   private static long[] id_catch;
   private static int[] id_private;

   public synchronized void id_byte(String var1) {
      if ((Boolean)this.id_break[id_case[12]]) {
         this.id_byte();

         try {
            Path var2 = Paths.get(var1);
            if (!Files.exists(var2)) {
               Files.createDirectories(var2);
            }

            Path var3 = id_class(var2, (Integer)this.id_break[id_case[13]], (Integer)this.id_break[id_case[14]]);
            if (!Files.exists(var3)) {
               Files.createFile(var3);
            }

            try (
               FileOutputStream var4 = new FileOutputStream(var3.toFile());
               GZIPOutputStream var5 = new GZIPOutputStream(var4, id_case[15]);
               DataOutputStream var6 = new DataOutputStream(var5);
            ) {
               var6.writeInt(id_private[0]);

               for (int var7 = id_byte[11]; var7 < id_protected[10]; var7++) {
                  for (int var8 = id_byte[12]; var8 < id_protected[11]; var8++) {
                     St_1 var9 = ((St_1[][])this.id_break[id_case[16]])[var7][var8];
                     if (var9 == null) {
                        var6.write(id_byte[13]);
                     } else {
                        var6.write(id_byte[14]);
                        byte[] var10 = var9.id_byte();
                        var6.write(var10);
                        var6.write(new byte[id_case[17] - var10.length]);
                     }
                  }
               }

               for (int var26 = id_byte[15]; var26 < id_protected[12]; var26++) {
                  for (int var29 = id_byte[16]; var29 < id_protected[13]; var29++) {
                     if (((St_1[][])this.id_break[id_case[18]])[var26][var29] != null) {
                        for (int var32 = id_byte[17]; var32 < id_case[19]; var32++) {
                           var6.writeUTF(ri_3.id_class(((St_1[][])this.id_break[id_case[20]])[var26][var29].id_class()[var32].id_break()));
                        }
                     }
                  }
               }

               for (int var27 = id_byte[18]; var27 < id_protected[14]; var27++) {
                  for (int var30 = id_byte[19]; var30 < id_protected[15]; var30++) {
                     if (((St_1[][])this.id_break[id_case[21]])[var27][var30] != null) {
                        Map var33 = ((St_1[][])this.id_break[id_case[22]])[var27][var30].id_break();
                        var6.writeShort(var33.entrySet().size());

                        for (Entry var11 : var33.entrySet()) {
                           var6.writeUTF((String)var11.getKey());
                           var6.writeShort(((List)var11.getValue()).size());

                           for (rfH_2 var13 : (List)var11.getValue()) {
                              var6.writeByte((byte)(var13.d_() << id_protected[16] | var13.b_()));
                              var6.writeByte((byte)var13.c_());
                           }
                        }
                     }
                  }
               }

               for (int var28 = id_byte[20]; var28 < id_protected[17]; var28++) {
                  for (int var31 = id_byte[21]; var31 < id_protected[18]; var31++) {
                     if (((St_1[][])this.id_break[id_case[23]])[var28][var31] != null) {
                        var6.writeLong((Long)((St_1[][])this.id_break[id_case[24]])[var28][var31].id_break[id_case[25]]);
                     }
                  }
               }
            }

            Boolean var18 = id_byte[22];
            this.id_break[id_case[26]] = var18;
         } catch (Exception var25) {
            var25.printStackTrace();
         }
      }
   }

   public synchronized void id_byte() {
      long var1 = (Long)C_class.id_instanceof().id_strictfp.id_class[id_case[37]];
      if (var1 >= id_catch[2]) {
         long var3 = System.currentTimeMillis();
         long var5 = var3 - var1 * id_catch[3];

         for (int var7 = id_byte[42]; var7 < id_protected[44]; var7++) {
            for (int var8 = id_byte[43]; var8 < id_protected[45]; var8++) {
               if (((St_1[][])this.id_break[id_case[38]])[var7][var8] != null
                  && (Long)((St_1[][])this.id_break[id_case[39]])[var7][var8].id_break[id_case[40]] < var5) {
                  System.out
                     .println(
                        "Removing chunk "
                           + (var7 + id_protected[46] * (Integer)this.id_break[id_case[41]])
                           + ","
                           + (var8 + id_protected[47] * (Integer)this.id_break[id_case[42]])
                           + " because it was cached "
                           + (var3 - (Long)((St_1[][])this.id_break[id_case[43]])[var7][var8].id_break[id_case[44]]) / id_catch[4]
                           + " seconds ago, and max age is "
                           + var1
                     );
                  ((St_1[][])this.id_break[id_case[45]])[var7][var8] = null;
               }
            }
         }
      }
   }

   public Sw_1(int var1, int var2, rqM_2<rYB> var3) {
      this.id_private();
      St_1[][] var8 = new St_1[id_protected[0]][id_protected[1]];
      this.id_break[id_case[0]] = var8;
      Integer var9 = var1;
      this.id_break[id_case[1]] = var9;
      Integer var10 = var2;
      this.id_break[id_case[2]] = var10;
      Boolean var11 = id_byte[0];
      this.id_break[id_case[3]] = var11;
      this.id_break[id_case[4]] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public int id_class() {
      return (Integer)this.id_break[id_case[52]];
   }

   private static Path id_class(Path var0, int var1, int var2) {
      String var10000 = var0.toString();
      String[] var10001 = new String[id_byte[46]];
      var10001[id_byte[47]] = "r." + var1 + "." + var2 + ".bcr";
      return Paths.get(var10000, var10001);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707862014;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7135826876099624916L;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return ((St_1[][])this.id_break[id_case[7]])[var1 >> id_protected[6]][var2 >> id_protected[7]] != null ? id_byte[1] : id_byte[2];
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3) {
      St_1 var4 = ((St_1[][])this.id_break[id_case[5]])[var1 >> id_protected[2]][var3 >> id_protected[3]];
      return var4 != null ? var4.id_class(var1 & id_protected[4], var2, var3 & id_protected[5], (rqM_2<rYB>)this.id_break[id_case[6]]) : null;
   }

   public synchronized void id_class(int var1, int var2, St_1 var3) {
      ((St_1[][])this.id_break[id_case[10]])[var1][var2] = var3;
      Boolean var8 = id_byte[5];
      this.id_break[id_case[11]] = var8;
   }

   public synchronized void id_class(String var1) {
      try {
         Path var2 = Paths.get(var1);
         if (!Files.exists(var2)) {
            Files.createDirectories(var2);
         }

         Path var3 = id_class(var2, (Integer)this.id_break[id_case[27]], (Integer)this.id_break[id_case[28]]);
         if (!Files.exists(var3)) {
            return;
         }

         long var4 = System.nanoTime() / id_catch[0];

         try (
            FileInputStream var6 = new FileInputStream(var3.toFile());
            GZIPInputStream var7 = new GZIPInputStream(var6, id_private[1]);
            DataInputStream var8 = new DataInputStream(var7);
         ) {
            int var9 = var8.readInt();
            if (var9 != id_private[2]) {
               throw new IOException("Bad magic value " + var9);
            }

            boolean[][] var10 = new boolean[id_protected[19]][id_protected[20]];
            BitSet[][] var11 = new BitSet[id_protected[21]][id_protected[22]];
            Map[][] var12 = new Map[id_protected[23]][id_protected[24]];
            xc_3[][][] var13 = new xc_3[id_protected[25]][id_protected[26]][];
            long[][] var14 = new long[id_protected[27]][id_protected[28]];

            for (int var15 = id_byte[27]; var15 < id_protected[29]; var15++) {
               for (int var16 = id_byte[28]; var16 < id_protected[30]; var16++) {
                  int var17 = var8.read();
                  switch (var17) {
                     case 1:
                        byte[] var18 = new byte[id_case[29]];
                        var8.readFully(var18);
                        var11[var15][var16] = BitSet.valueOf(var18);
                        var12[var15][var16] = new HashMap();
                        var13[var15][var16] = new xc_3[id_case[30]];
                        var10[var15][var16] = id_byte[29];
                        break;
                     case 0:
                     default:
                        throw new IOException(id_throws[0]);
                  }
               }
            }

            for (int var40 = id_byte[30]; var40 < id_protected[31]; var40++) {
               for (int var44 = id_byte[31]; var44 < id_protected[32]; var44++) {
                  if (var10[var40][var44]) {
                     for (int var48 = id_byte[32]; var48 < id_case[31]; var48++) {
                        var13[var40][var44][var48] = ri_3.id_break(var8.readUTF()).id_continue();
                     }
                  }
               }
            }

            for (int var41 = id_byte[33]; var41 < id_protected[33]; var41++) {
               for (int var45 = id_byte[34]; var45 < id_protected[34]; var45++) {
                  if (var10[var41][var45]) {
                     int var49 = var8.readShort() & id_private[3];

                     for (int var51 = id_byte[35]; var51 < var49; var51++) {
                        String var19 = var8.readUTF();
                        ri_3.id_break(var19);
                        ArrayList var20 = new ArrayList();
                        var12[var41][var45].put(var19, var20);
                        int var21 = var8.readShort() & id_private[4];
                        if (var21 == 0) {
                           var21 = id_private[5];
                        }

                        for (int var22 = id_byte[36]; var22 < var21; var22++) {
                           byte var23 = var8.readByte();
                           int var24 = var23 & id_protected[35];
                           int var25 = var23 >>> id_protected[36] & id_protected[37];
                           int var26 = var8.readByte() & id_case[32];
                           var20.add(new rfH_2(var24, var26, var25));
                        }
                     }
                  }
               }
            }

            for (int var42 = id_byte[37]; var42 < id_protected[38]; var42++) {
               for (int var46 = id_byte[38]; var46 < id_protected[39]; var46++) {
                  if (var10[var42][var46]) {
                     var14[var42][var46] = var8.readLong();
                  }
               }
            }

            for (int var43 = id_byte[39]; var43 < id_protected[40]; var43++) {
               for (int var47 = id_byte[40]; var47 < id_protected[41]; var47++) {
                  if (var10[var43][var47]) {
                     int var50 = (Integer)this.id_break[id_case[33]];
                     int var52 = (Integer)this.id_break[id_case[34]];
                     int var53 = var43 + id_protected[42] * var50;
                     int var54 = var47 + id_protected[43] * var52;
                     ((St_1[][])this.id_break[id_case[35]])[var43][var47] = new St_1(
                        var53, var54, var11[var43][var47], var13[var43][var47], var12[var43][var47], var14[var43][var47]
                     );
                  }
               }
            }
         }

         this.id_byte();
         Boolean var31 = id_byte[41];
         this.id_break[id_case[36]] = var31;
         long var39 = System.nanoTime() / id_catch[1];
      } catch (Exception var38) {
         var38.printStackTrace();
      }
   }

   @Override
   public int id_break() {
      return (Integer)this.id_break[id_case[51]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -107, -116, 120, 114, -56, 73, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{(byte)0, (byte)1, 456022910};
      id_class = var0;
   }

   private static void id_finally() {
      id_case = new short[]{
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

   private static void id_catch() {
      id_byte = new boolean[]{
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

   private static void id_extends() {
      id_protected = new byte[]{
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

   private static void id_case() {
      id_private = new int[]{456022910, 32768, 456022910, 65535, 65535, 65536, 456022910};
   }

   private static void id_implements() {
      id_throws = new String[]{new String("Malformed stream")};
   }

   public synchronized St_1 id_protected() {
      St_1 var1 = null;

      for (int var2 = id_byte[44]; var2 < id_protected[48]; var2++) {
         for (int var3 = id_byte[45]; var3 < id_protected[49]; var3++) {
            if (((St_1[][])this.id_break[id_case[46]])[var2][var3] != null
               && (var1 == null || (Long)((St_1[][])this.id_break[id_case[47]])[var2][var3].id_break[id_case[48]] > (Long)var1.id_break[id_case[49]])) {
               var1 = ((St_1[][])this.id_break[id_case[50]])[var2][var3];
            }
         }
      }

      return var1;
   }

   public ArrayList<rfH_2> id_protected(String var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = id_byte[3]; var3 < id_protected[8]; var3++) {
         for (int var4 = id_byte[4]; var4 < id_protected[9]; var4++) {
            if (((St_1[][])this.id_break[id_case[8]])[var3][var4] != null) {
               ArrayList var5 = ((St_1[][])this.id_break[id_case[9]])[var3][var4].id_class(var1);
               if (var5 != null) {
                  var2.addAll(var5);
               }
            }
         }
      }

      return var2;
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[50]];
         Object[] var1 = this.id_break;
         var1[id_byte[48]] = Integer.valueOf(id_byte[49]);
         var1[id_protected[51]] = Integer.valueOf(id_byte[50]);
         var1[id_protected[52]] = id_byte[51];
      }
   }

   private static void id_native() {
      id_catch = new long[]{1000000L, 1000000L, 0L, 1000L, 1000L};
   }
}
