package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFO extends rrFl_1<rrFX> {
   private static boolean[] id_protected;
   public Object[] id_class;
   private static float[] id_throws;
   private static byte[] id_case;
   public static Object[] id_break;
   private static short[] id_catch;
   private static long[] id_private;
   private static String[] id_implements;

   @Override
   public Collection<rrFX> id_byte() {
      this.id_catch();
      return (List)this.id_class[id_catch[5]];
   }

   public rrFO(rrFJ var1) {
      this.id_catch();
      ArrayList var6 = new ArrayList();
      this.id_class[id_catch[0]] = var6;
      rrFh_1 var7 = new rrFh_1();
      this.id_class[2] = var7;
      this.id_class[1] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(rrLf_1 var1) {
      this.id_catch();
      if (((rrFJ)this.id_class[1]).id_throw()) {
         iB_2 var2 = var1.id_break();
         if (var2 != (cb_3)MinecraftAccessor.id_import.id_class[57]) {
            rdn_3 var3 = var1.id_class();
            if (var3.id_protected(id_implements[0]) || var3.id_protected(id_implements[1])) {
               rrFX var4 = new rrFX(var2, var3);
               if (((List)this.id_class[id_catch[11]]).contains(var4)) {
                  rrFX var5 = (rrFX)((List)this.id_class[id_catch[12]]).get(((List)this.id_class[id_catch[13]]).indexOf(var4));
                  var5.id_class(var5.id_case() + var3.id_char());
                  var5.id_break(id_protected[2]);
               } else {
                  ((List)this.id_class[id_catch[14]]).add(var4);
               }

               if (!((List)this.id_class[id_catch[15]]).isEmpty()) {
                  ((List)this.id_class[id_catch[16]]).sort((rrFh_1)this.id_class[2]);
               }
            }
         }
      }
   }

   public float id_class(rrFX var1) {
      rVi_1 var2 = var1.id_throws();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[6]]).id_class().id_break(var2.id_byte()) + 7.0F;
   }

   public void id_class(rrAM var1) {
      this.id_catch();

      for (rrFX var3 : (List)this.id_class[id_catch[18]]) {
         var3.id_class(id_protected[3]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 5, -73, 116, 126, -16, -36, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFJ id_class() {
      this.id_catch();
      return (rrFJ)this.id_class[1];
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_catch();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[3]]).id_class();
      this.id_break(18.0F);
      float var5 = this.id_finally();
      float var6 = this.id_protected();
      var4.id_class(MinecraftAccessor.id_strictfp);

      for (rrFX var8 : (List)this.id_class[id_catch[4]]) {
         AnimValue var9 = var8.id_protected();
         var8.id_class(!var8.id_protected().id_new() ? true : id_protected[1]);
         float var10 = var6 * 0.8F * var9.id_continue();
         float var11 = var2 + 3.0F;
         float var12 = var3 + var5 - var10;
         rVi_1 var13 = var8.id_throws();
         int var14 = (int)(255.0F * var9.id_byte());
         var4.id_break(var1, var13, (double)var11, (double)var12, rrZF.d_, var14);
         float var15 = var6 * var9.id_byte();
         var5 += var15;
         this.id_class(var15);
      }

      var4.id_byte(MinecraftAccessor.id_strictfp);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2123269686;
   }

   public void id_class(rrFK var1) {
      this.id_catch();
      ((List)this.id_class[id_catch[19]]).clear();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6088166958131759015L;
   }

   public List<rrFX> id_break() {
      this.id_catch();
      return (List<rrFX>)this.id_class[id_catch[20]];
   }

   @Override
   public void id_throws() {
      this.id_catch();
      super.id_throws();
      if (!((List)this.id_class[id_catch[7]]).isEmpty()) {
         ((List)this.id_class[id_catch[8]]).removeIf(var0 -> {
            if (var0.id_protected().id_catch()) {
               return true;
            } else {
               var0.id_break(var0.id_break() + 1);
               if ((long)var0.id_break() >= (Long)id_break[id_catch[23]] * 40L) {
                  var0.id_class(id_protected[6]);
               }

               return id_protected[7];
            }
         });
      }
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_extends() {
      id_catch = new short[]{0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 57, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 2, 0};
   }

   public rrFh_1 id_case() {
      this.id_catch();
      return (rrFh_1)this.id_class[2];
   }

   private static void id_implements() {
      id_throws = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 7.0F, 10.0F};
   }

   private static void id_package() {
      id_implements = new String[]{new String("don-item"), new String("gift")};
   }

   @Override
   public float id_protected() {
      return 10.0F;
   }

   private static void id_private() {
      id_protected = new boolean[]{true, false, false, false, true, true, false, false, false, true, false};
   }

   private static void id_final() {
      id_case = new byte[]{3};
   }

   private static void id_volatile() {
      id_private = new long[]{40L, 30L, 0L};
   }

   private static void id_native() {
      Object[] var0 = new Object[]{30L};
      id_break = var0;
   }
}
