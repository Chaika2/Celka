package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpp_3 extends rrpi_3 {
   private static String[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static float[] id_case;
   private static byte[] id_catch;
   private static short[] id_private;

   private int id_byte(int var1) {
      if (var1 == id_catch[5]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_catch[6]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_catch[7]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_private[28]]).id_implements[id_private[29]]).id_protected);
         return var1;
      } else if (var1 >= id_catch[8] && var1 <= id_catch[9]) {
         ((Ax_1)id_import.id_class[id_private[30]])
            .id_class(
               ((rJr_1)((cb_3)id_import.id_class[id_private[31]]).id_implements[id_private[32]]).id_case,
               var1,
               ((rhz_3)((cb_3)id_import.id_class[id_private[33]]).id_implements[id_private[34]]).id_protected,
               rXa_1.SWAP
            );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[35]]).id_finally().id_class(rrLY.id_class());
         return var1;
      } else {
         return id_catch[10];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_class[id_private[36]];
   }

   public rrpp_3(HwHelper var1) {
      super(var1);
      this.id_case();
      rrIF var6 = new rrIF(id_byte[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[0]]);
      this.id_break[id_private[1]] = var6;
      Integer var7 = Integer.valueOf(id_catch[0]);
      this.id_break[id_private[2]] = var7;
      String var10003 = id_byte[1];
      Setting[] var10004 = new Setting[id_protected[0]];
      var10004[id_protected[1]] = (rrIF)this.id_break[id_private[3]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, -31, -124, -79, 89, -55, -128, -37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 350100241742110329L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_case();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[6]] && (Boolean)this.id_break[id_private[7]]) {
         HwHelper var2 = this.id_continue();
         int var3 = this.id_native();
         rrpT_2 var4 = this.id_break(var3);
         switch (((int[])rrpq_3.id_class[id_private[8]])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)id_import.id_class[id_private[9]]).sK().id_protected(rdy_3.kh);
               float var6 = (float)var5 / id_case[0];
               rrfu_3.id_class(var2, id_byte[2], var6);
               this.id_implements();
               return;
            case 2:
               this.id_implements();
               return;
            default:
               if (var4 == (rrpT_2)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[10]]) {
                  if ((Integer)this.id_break[id_private[11]] == id_catch[1]) {
                     Integer var11 = this.id_byte(var3);
                     this.id_break[id_private[12]] = var11;
                  }

                  if ((Integer)this.id_break[id_private[13]] > id_catch[2]) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[14]]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)id_import.id_class[id_private[15]])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[id_private[16]]).id_implements[id_private[17]]).id_case,
                              (Integer)this.id_break[id_private[18]],
                              ((rhz_3)((cb_3)id_import.id_class[id_private[19]]).id_implements[id_private[20]]).id_protected,
                              rXa_1.SWAP
                           );
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[21]]).id_finally().id_class(rrLY.id_class());
                        this.id_implements();
                     }
                  } else {
                     this.id_implements();
                  }
               }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1373545175;
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_case();
      if (var1.id_break() == ((rrIF)this.id_break[id_private[4]]).id_finally().id_byte()) {
         Boolean var6 = id_protected[2];
         this.id_break[id_private[5]] = var6;
      }
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.kh, 1)};
      id_class = var0;
   }

   private rrpT_2 id_break(int var1) {
      if (var1 == id_catch[4]) {
         return (rrpT_2)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[24]];
      } else {
         return ((cb_3)id_import.id_class[id_private[25]]).sK().id_class(rdy_3.kh)
            ? (rrpT_2)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[26]]
            : (rrpT_2)rrpT_2.staticFields40114faa3468399f904240e789c63c91[id_private[27]];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_case();
      return (rrIF)this.id_break[id_private[37]];
   }

   private static void id_finally() {
      id_protected = new boolean[]{true, false, true, false, false, true, false, true, false, false, true};
   }

   private static void id_extends() {
      id_byte = new String[]{new String("Активация"), new String("Трапка"), new String("трапки")};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[1] = false;
         this.id_break[2] = 0;
      }
   }

   private void id_implements() {
      this.id_case();
      Boolean var5 = id_protected[3];
      this.id_break[id_private[22]] = var5;
      Integer var6 = Integer.valueOf(id_catch[3]);
      this.id_break[id_private[23]] = var6;
   }

   private static void id_package() {
      id_private = new short[]{
         0, 0, 2, 0, 0, 1, 0, 1, 0, 57, 0, 2, 2, 2, 0, 55, 57, 4, 2, 57, 1, 0, 1, 2, 1, 57, 2, 0, 57, 1, 55, 57, 4, 57, 1, 0, 0, 0, 57, 57, 57, 1
      };
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> rrjk_3.id_byte(var0);
   }

   private static void id_private() {
      id_catch = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
   }

   private static void id_final() {
      id_case = new float[]{20.0F};
   }

   private int id_native() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_catch[11];
      } else if (var1.test(((cb_3)id_import.id_class[id_private[38]]).ss())) {
         return id_catch[12];
      } else if (var1.test(((cb_3)id_import.id_class[id_private[39]]).Sn())) {
         return id_catch[13];
      } else {
         for (int var2 = id_protected[4]; var2 < id_catch[14]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_private[40]]).id_implements[id_private[41]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_catch[15];
      }
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      return super.aK_();
   }
}
