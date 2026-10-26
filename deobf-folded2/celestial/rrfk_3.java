package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfk_3 extends vm_3 implements Zg_1 {
   private static int[] id_case;
   public Object[] id_class;
   private static short[] id_catch;
   private static boolean[] id_private;
   private static double[] id_implements;
   private static float[] id_finally;
   private static String[] id_else;
   private static byte[] id_synchronized;
   public static Object[] id_throws;

   private static void id_char() {
      id_private = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public rdn_3 id_byte() {
      this.id_long();
      return (rrfz_3)this.id_class[2] != null ? ((rrfz_3)this.id_class[2]).id_protected().id_class() : null;
   }

   private static void id_int() {
      id_implements = new double[]{40.0};
   }

   private void id_long() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_float() {
      id_synchronized = new byte[]{70, 25, 25, 10, 16, 3, 2};
   }

   public rrfk_3() {
      super(rgN_2.id_byte);
      this.id_long();
      rrfW_2 var5 = new rrfW_2(this);
      this.id_class[0] = var5;
      rrZH var6 = new rrZH(0.5F);
      this.id_class[1] = var6;
      ((List)this.id_class[0]).sort(Comparator.comparingInt(var0 -> var0.id_class().ordinal()));
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_case = new int[]{16777215, 16777215};
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      this.id_long();
      ((rrZH)this.id_class[1]).id_class(true, var5, 40.0);
      return super.id_class(var1, var3, var5);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 53, -23, -7, -41, 38, 124, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7680056724408129596L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_long();
      super.id_class(var1, var2, var3, var4);
      this.id_class(var1);
      float var5 = 0.0F;
      int var6 = this.id_finally();
      ((rrZH)this.id_class[1]).id_class((float)var6, (float)(id_import.id_else().id_this() - 70));
      float var7 = ((rrZH)this.id_class[1]).id_case();
      Object var19 = null;
      this.id_class[2] = var19;
      float var8 = id_import.id_else().id_package() - 70.0F;

      for (int var9 = 0; var9 < ((List)this.id_class[0]).size(); var9++) {
         rrfz_3 var10 = (rrfz_3)((List)this.id_class[0]).get(var9);
         var10.id_byte(var8);
         rrfJ_2 var11 = var10.id_protected();
         rgP_2 var12 = var11.id_byte();
         rdn_3 var13 = var11.id_class();
         String var14 = ((rrfx_3)var10.id_class[3]).id_protected().name();
         id_import.id_float().id_class(var13, (int)var10.id_throws(), (int)var10.id_break());
         ((cm_3)id_import.id_class[15]).id_break(var1, var12, var10.id_throws() + 20.0F, var10.id_break() + 5.0F, 16777215);
         if (var10.id_class((float)var2, (float)var3)) {
            this.id_class[2] = var10;
            this.id_class(var1, var13, var2, var3);
         }

         if (var9 > 0 && !((rrfz_3)((List)this.id_class[0]).get(var9 - 1)).id_class().id_protected().equals(var10.id_class().id_protected())) {
            var5 += 32.0F;
         } else {
            var5 += 16.0F;
         }

         var10.id_break(var5);
         if (!((Map)id_throws[1]).containsKey(var14)) {
            ((Map)id_throws[1]).put(var14, var10.id_break());
         }
      }

      for (Entry var22 : ((Map)id_throws[1]).entrySet()) {
         String var23 = rgF_2.STRIKETHROUGH + " ".repeat(25) + rgF_2.RESET + (String)var22.getKey() + rgF_2.STRIKETHROUGH + " ".repeat(25);
         float var24 = (Float)var22.getValue();
         ((cm_3)id_import.id_class[15])
            .id_break(
               var1, var23, id_import.id_else().id_package() - (float)((cm_3)id_import.id_class[15]).id_break(var23) / 2.0F, var7 - 10.0F + var24, 16777215
            );
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_long();

      for (rrfz_3 var7 : (List)this.id_class[0]) {
         if (var7.id_class((float)var1, (float)var3)) {
            if (!id_import.id_finally()) {
               String var9 = "Вы не можете выдать предмет не в одиночной игре";
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Items Menu", var9, 3000));
               return false;
            }

            rYB var8 = rrjv_3.id_class();
            var8.a_(
               new rsE_2(
                  var8,
                  ((cb_3)id_import.id_class[57]).rx(),
                  ((cb_3)id_import.id_class[57]).re(),
                  ((cb_3)id_import.id_class[57]).BO(),
                  var7.id_protected().id_class()
               )
            );
            break;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1926980289;
   }

   public int id_finally() {
      this.id_long();
      int var1 = 0;
      var1 += ((List)this.id_class[0]).stream().mapToInt(var0 -> 16).sum();
      return var1 + ((Map)id_throws[1]).size() * 10;
   }

   private static void id_package() {
      id_catch = new short[]{0, 1, 0, 1, 1, 2, 0, 0, 3, 15, 2, 0, 1, 1, 1, 15, 15, 0, 1, 1, 0, 0, 3000, 57, 57, 57, 2, 2};
   }

   private static void id_abstract() {
      id_else = new String[]{new String(" "), new String(" "), new String("Вы не можете выдать предмет не в одиночной игре"), new String("Items Menu")};
   }

   private static void id_final() {
      Object[] var0 = new Object[]{new rrfk_3(), new HashMap()};
      id_throws = var0;
   }

   private static void id_native() {
      id_finally = new float[]{0.5F, 0.0F, 70.0F, 20.0F, 5.0F, 32.0F, 16.0F, 2.0F, 10.0F};
   }
}
