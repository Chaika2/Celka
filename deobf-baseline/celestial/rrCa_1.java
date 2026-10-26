package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCa_1 extends rrTF<NoSlow> {
   private static short[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_case;
   public Object[] id_class;

   private static void id_byte() {
      id_case = new boolean[]{
         true, true, true, true, false, false, true, true, false, true, true, true, false, false, false, false, false, false, true, false, false, false
      };
   }

   public rrCa_1(NoSlow var1) {
      super(var1);
      this.id_break();
      Integer var6 = Integer.valueOf(id_protected[0]);
      this.id_class[id_break[0]] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{83, 109, -35, 11, -83, 49, -108, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1147295434;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_break();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[5]]) {
         if ((Boolean)this.id_class[id_break[6]]) {
            int var10002 = (Integer)this.id_class[id_break[7]] + id_case[2];
            Integer var6 = var10002;
            this.id_class[id_break[8]] = var6;
            if (var10002 > id_protected[1]) {
               Integer var7 = ((rhz_3)((cb_3)id_import.id_class[id_break[9]]).id_implements[id_break[10]]).id_protected;
               this.id_class[id_break[11]] = var7;
               rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_break[12]]).id_implements[id_break[13]]).id_protected % id_protected[2] + id_case[3]);
               Integer var8 = Integer.valueOf(id_case[4]);
               this.id_class[id_break[14]] = var8;
               Boolean var9 = id_case[5];
               this.id_class[id_break[15]] = var9;
            }
         }

         if ((Integer)this.id_class[id_break[16]] != id_protected[3]) {
            int var13 = (Integer)this.id_class[id_break[17]] + id_case[6];
            Integer var10 = var13;
            this.id_class[id_break[18]] = var10;
            if (var13 > id_case[7]) {
               rrfo_3.id_class((Integer)this.id_class[id_break[19]]);
               Integer var11 = Integer.valueOf(id_protected[4]);
               this.id_class[id_break[20]] = var11;
               Integer var12 = Integer.valueOf(id_case[8]);
               this.id_class[id_break[21]] = var12;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAA var1) {
      this.id_break();
      if (var1.id_protected() == rpm_3.OFF_HAND && var1.id_class().id_class().id_byte()) {
         Boolean var6 = id_case[0];
         this.id_class[id_break[1]] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4727133288293698414L;
   }

   private boolean id_class() {
      if (((cb_3)id_import.id_class[id_break[28]]).P() == rpm_3.OFF_HAND && ((cb_3)id_import.id_class[id_break[29]]).Sw() < id_protected[6]) {
         return id_case[10];
      } else {
         return ((cb_3)id_import.id_class[id_break[30]]).P() == rpm_3.MAIN_HAND && !((cb_3)id_import.id_class[id_break[31]]).PZ() ? id_case[11] : id_case[12];
      }
   }

   @EventTarget
   public void id_class(rrAB var1) {
      if (((cb_3)id_import.id_class[id_break[22]]).P() != rpm_3.MAIN_HAND || !((cb_3)id_import.id_class[id_break[23]]).PZ()) {
         if (this.id_class()) {
            this.id_break(var1);
         } else {
            var1.id_class(id_case[9]);
         }
      }
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_break();
      if (var1.id_class() < id_byte[0] && ((cb_3)id_import.id_class[id_break[2]]).id_return() && ((cb_3)id_import.id_class[id_break[3]]).P() == rpm_3.OFF_HAND) {
         Boolean var6 = id_case[1];
         this.id_class[id_break[4]] = var6;
      }
   }

   private float id_class(float var1) {
      return ((cb_3)id_import.id_class[id_break[32]]).Sw() < id_protected[7] ? id_byte[5] : var1;
   }

   private void id_break(rrAB var1) {
      if (((cb_3)id_import.id_class[id_break[24]]).Se() >= id_protected[5] && ((cb_3)id_import.id_class[id_break[25]]).BL()) {
         float var2 = ((cb_3)id_import.id_class[id_break[26]]).id_private[id_break[27]] == id_byte[2] ? id_byte[3] : id_byte[4];
         var1.id_break(this.id_class(var2));
      } else {
         var1.id_break(id_byte[1]);
      }
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[0] = false;
         this.id_class[1] = 0;
         this.id_class[2] = 0;
         this.id_class[3] = 0;
      }
   }

   private static void id_throws() {
      id_protected = new byte[]{-1, 3, 8, -1, -1, 2, 2, 2, -1, 4, 2, 3};
   }

   private static void id_case() {
      id_byte = new float[]{10.0F, 0.205F, 0.0F, 0.538F, 0.38F, 0.2F};
   }

   private static void id_protected() {
      id_break = new short[]{2, 0, 57, 57, 0, 0, 0, 1, 1, 57, 1, 2, 57, 1, 1, 0, 2, 3, 3, 2, 2, 3, 57, 57, 57, 57, 57, 42, 57, 57, 57, 57, 57, 0, 1, 3, 2};
   }

   @Override
   public boolean aK_() {
      this.id_break();
      Boolean var5 = id_case[13];
      this.id_class[id_break[33]] = var5;
      Integer var6 = Integer.valueOf(id_case[14]);
      this.id_class[id_break[34]] = var6;
      Integer var7 = Integer.valueOf(id_case[15]);
      this.id_class[id_break[35]] = var7;
      Integer var8 = Integer.valueOf(id_protected[8]);
      this.id_class[id_break[36]] = var8;
      return super.aK_();
   }
}
