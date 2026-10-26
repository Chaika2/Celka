package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bw_3 {
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[22]];
         Object[] var1 = this.id_class;
         var1[id_byte[23]] = id_protected[10];
      }
   }

   public bw_3(Ps_1 var1) {
      this(var1, id_protected[0]);
   }

   public bw_3(Ps_1 var1, boolean var2) {
      this(var1.id_case(), (SR)var1.id_package(), var2);
   }

   public bw_3(rYB var1, SR var2, boolean var3) {
      this.id_byte();
      Object var8 = null;
      this.id_class[id_throws[0]] = var8;
      Object var9 = null;
      this.id_class[id_throws[1]] = var9;
      this.id_class[id_throws[2]] = var1;
      ba_3 var11 = new ba_3(var1.id_instanceof());
      this.id_class[id_throws[3]] = var11;
      this.id_class[id_throws[4]] = var2;
      if (var3) {
         AO var13 = ((AO)var1.id_goto()).id_throws();
         this.id_class[id_throws[5]] = var13;
      } else {
         AO var14 = (AO)var1.id_goto();
         this.id_class[id_throws[6]] = var14;
      }

      Boolean var15 = !C_class.id_instanceof().rU.id_class[id_throws[7]] ? id_protected[1] : id_protected[2];
      this.id_class[id_throws[8]] = var15;
      if (!QY.id_instanceof().rX()) {
         throw new IllegalStateException();
      } else {
         rfw_3 var16 = new rfw_3();
         this.id_class[id_throws[9]] = var16;
         bI_2 var17 = new bI_2(this);
         this.id_class[id_throws[10]] = var17;
      }
   }

   static {
      ntfClinit();
   }

   public boolean id_class(int var1, int var2) {
      return ((AO)this.id_class[id_throws[11]]).id_case(var1 >> id_byte[0], var2 >> id_byte[1]);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{rrPy_1.id_class};
      id_break = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 83, -66, 89, -73, 18, -107, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static xc_3 id_class(roJ_2 var0, int var1, int var2, int var3) {
      roQ_2 var4 = var0.id_byte()[var2 >> id_byte[18]];
      return roQ_2.id_class(var4) ? (xc_3)id_break[id_throws[40]] : var4.id_class(var1 & id_byte[19], var2 & id_byte[20], var3 & id_byte[21]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -459902661183041068L;
   }

   public xc_3 id_class(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < id_throws[12]) {
         if ((Boolean)this.id_class[id_throws[14]]) {
            roJ_2 var4 = (roJ_2)this.id_class[id_throws[15]];
            if (var4 != null && var4.id_private().id_break == var1 >> id_byte[2] && var4.id_private().id_byte == var3 >> id_byte[3]) {
               return id_class(var4, var1, var2, var3);
            }

            roJ_2 var5 = ((AO)this.id_class[id_throws[16]]).id_class(var1 >> id_byte[4], var3 >> id_byte[5], roN_2.id_volatile, id_protected[3]);
            if (var5 != null && !var5.id_catch()) {
               this.id_class[id_throws[17]] = var5;
               return id_class(var5, var1, var2, var3);
            }
         }

         Sw_1 var12 = (Sw_1)this.id_class[id_throws[18]];
         if (var12 == null || var12.id_break() != var1 >> id_byte[6] || var12.id_class() != var3 >> id_byte[7]) {
            if ((SR)this.id_class[id_throws[19]] == null) {
               return (xc_3)id_break[id_throws[20]];
            }

            Sw_1 var13 = ((SI)((SR)this.id_class[id_throws[21]]).id_class[id_throws[22]]).id_throws(var1 >> id_byte[8], var3 >> id_byte[9]);
            if (var13 == null) {
               return (xc_3)id_break[id_throws[23]];
            }

            this.id_class[id_throws[24]] = var13;
            var12 = var13;
         }

         xc_3 var14 = var12.id_class(var1 & id_throws[25], var2, var3 & id_throws[26]);
         return var14 == null ? (xc_3)id_break[id_throws[27]] : var14;
      } else {
         return (xc_3)id_break[id_throws[13]];
      }
   }

   public xc_3 id_class(rfH_2 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   public static xc_3 id_class(Ps_1 var0, rfH_2 var1) {
      return new bw_3(var0).id_class(var1.b_(), var1.c_(), var1.d_());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1885121461;
   }

   public boolean id_break(int var1, int var2) {
      roJ_2 var3 = (roJ_2)this.id_class[id_throws[28]];
      if (var3 != null && var3.id_private().id_break == var1 >> id_byte[10] && var3.id_private().id_byte == var2 >> id_byte[11]) {
         return id_protected[4];
      } else {
         var3 = ((AO)this.id_class[id_throws[29]]).id_class(var1 >> id_byte[12], var2 >> id_byte[13], roN_2.id_volatile, id_protected[5]);
         if (var3 != null && !var3.id_catch()) {
            this.id_class[id_throws[30]] = var3;
            return id_protected[6];
         } else {
            Sw_1 var4 = (Sw_1)this.id_class[id_throws[31]];
            if (var4 != null && var4.id_break() == var1 >> id_byte[14] && var4.id_class() == var2 >> id_byte[15]) {
               return var4.id_class(var1 & id_throws[32], var2 & id_throws[33]);
            } else if ((SR)this.id_class[id_throws[34]] == null) {
               return id_protected[7];
            } else {
               var4 = ((SI)((SR)this.id_class[id_throws[35]]).id_class[id_throws[36]]).id_throws(var1 >> id_byte[16], var2 >> id_byte[17]);
               if (var4 == null) {
                  return id_protected[8];
               } else {
                  this.id_class[id_throws[37]] = var4;
                  return var4.id_class(var1 & id_throws[38], var2 & id_throws[39]);
               }
            }
         }
      }
   }

   public static xd_3 id_break(Ps_1 var0, rfH_2 var1) {
      return id_class(var0, var1).id_break();
   }

   private static void id_break() {
      id_throws = new short[]{
         6, 7, 2, 5, 1, 0, 0, 0, 8, 3, 4, 0, 256, 0, 8, 6, 0, 6, 7, 1, 0, 1, 0, 0, 7, 511, 511, 0, 6, 0, 6, 7, 511, 511, 1, 1, 0, 7, 511, 511, 0
      };
   }

   private static void id_throws() {
      id_byte = new byte[]{4, 4, 4, 4, 4, 4, 9, 9, 9, 9, 4, 4, 4, 4, 9, 9, 9, 9, 4, 15, 15, 15, 9, 8};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, false, false, true, false, true, false, false, false, false, true};
   }
}
