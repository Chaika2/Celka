package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpg_3 extends rrpi_3 {
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_case;
   public static Object[] id_break;
   private static String[] id_catch;
   private static float[] id_private;

   private rrpY_2 id_byte(int var1) {
      if (var1 == id_case[4]) {
         return (rrpY_2)rrpY_2.staticFieldsf0e328803e763329a58eb35af5ba74f4[id_protected[24]];
      } else {
         return ((cb_3)id_import.id_class[id_protected[25]]).sK().id_class(rdy_3.dA)
            ? (rrpY_2)rrpY_2.staticFieldsf0e328803e763329a58eb35af5ba74f4[id_protected[26]]
            : (rrpY_2)rrpY_2.staticFieldsf0e328803e763329a58eb35af5ba74f4[id_protected[27]];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_break[id_protected[36]];
   }

   public rrpg_3(HwHelper var1) {
      super(var1);
      this.id_break();
      rrIF var6 = new rrIF(id_catch[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
      this.id_class[id_protected[1]] = var6;
      Integer var7 = Integer.valueOf(id_case[0]);
      this.id_class[id_protected[2]] = var7;
      String var10003 = id_catch[1];
      Setting[] var10004 = new Setting[id_byte[0]];
      var10004[id_byte[1]] = (rrIF)this.id_class[id_protected[3]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_break();
      if (var1.id_break() == ((rrIF)this.id_class[id_protected[4]]).id_finally().id_byte()) {
         Boolean var6 = id_byte[2];
         this.id_class[id_protected[5]] = var6;
      }
   }

   private int id_class(int var1) {
      if (var1 == id_case[5]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_case[6]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_case[7]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_protected[28]]).id_implements[id_protected[29]]).id_protected);
         return var1;
      } else if (var1 >= id_case[8] && var1 <= id_case[9]) {
         ((Ax_1)id_import.id_class[id_protected[30]])
            .id_class(
               ((rJr_1)((cb_3)id_import.id_class[id_protected[31]]).id_implements[id_protected[32]]).id_case,
               var1,
               ((rhz_3)((cb_3)id_import.id_class[id_protected[33]]).id_implements[id_protected[34]]).id_protected,
               rXa_1.SWAP
            );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[35]]).id_finally().id_class(rrLY.id_class());
         return var1;
      } else {
         return id_case[10];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 42, 11, 121, 0, -47, -102, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6805966679746745892L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_break();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[6]] && (Boolean)this.id_class[id_protected[7]]) {
         HwHelper var2 = this.id_continue();
         int var3 = this.id_case();
         rrpY_2 var4 = this.id_byte(var3);
         switch (((int[])rrpR_2.id_class[id_protected[8]])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)id_import.id_class[id_protected[9]]).sK().id_protected(rdy_3.dA);
               float var6 = (float)var5 / id_private[0];
               rrfu_3.id_class(var2, id_catch[2], var6);
               this.id_final();
               return;
            case 2:
               this.id_final();
               return;
            default:
               if (var4 == (rrpY_2)rrpY_2.staticFieldsf0e328803e763329a58eb35af5ba74f4[id_protected[10]]) {
                  if ((Integer)this.id_class[id_protected[11]] == id_case[1]) {
                     Integer var11 = this.id_class(var3);
                     this.id_class[id_protected[12]] = var11;
                  }

                  if ((Integer)this.id_class[id_protected[13]] > id_case[2]) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[14]]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)id_import.id_class[id_protected[15]])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[id_protected[16]]).id_implements[id_protected[17]]).id_case,
                              (Integer)this.id_class[id_protected[18]],
                              ((rhz_3)((cb_3)id_import.id_class[id_protected[19]]).id_implements[id_protected[20]]).id_protected,
                              rXa_1.SWAP
                           );
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[21]]).id_finally().id_class(rrLY.id_class());
                        this.id_final();
                     }
                  } else {
                     this.id_final();
                  }
               }
         }
      }
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[1] = false;
         this.id_class[2] = 0;
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 647400779;
   }

   @Override
   public rrIF id_throws() {
      this.id_break();
      return (rrIF)this.id_class[id_protected[37]];
   }

   private static void id_finally() {
      id_private = new float[]{20.0F};
   }

   private static void id_extends() {
      id_protected = new short[]{
         0, 0, 2, 0, 0, 1, 0, 1, 0, 57, 0, 2, 2, 2, 0, 55, 57, 4, 2, 57, 1, 0, 1, 2, 1, 57, 2, 0, 57, 1, 55, 57, 4, 57, 1, 0, 0, 0, 57, 57, 57, 1
      };
   }

   private int id_case() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_case[11];
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[38]]).ss())) {
         return id_case[12];
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[39]]).Sn())) {
         return id_case[13];
      } else {
         for (int var2 = id_byte[4]; var2 < id_case[14]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_protected[40]]).id_implements[id_protected[41]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_case[15];
      }
   }

   private static void id_implements() {
      id_byte = new boolean[]{true, false, true, false, false, true, false, true, false, false, true};
   }

   private static void id_package() {
      id_case = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> rrjk_3.id_class(var0);
   }

   private static void id_private() {
      id_catch = new String[]{new String("Активация"), new String("Взрывная трапка"), new String("взрывной трапки")};
   }

   private void id_final() {
      this.id_break();
      Boolean var5 = id_byte[3];
      this.id_class[id_protected[22]] = var5;
      Integer var6 = Integer.valueOf(id_case[3]);
      this.id_class[id_protected[23]] = var6;
   }

   private static void id_native() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.dA, 1)};
      id_break = var0;
   }

   @Override
   public boolean aK_() {
      this.id_final();
      return super.aK_();
   }
}
