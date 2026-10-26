package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFs_1 extends rrFl_1<rrFE> {
   private static String[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;
   private static byte[] id_case;
   private static float[] id_catch;

   @Override
   public Collection<rrFE> id_byte() {
      this.id_case();
      return (List)this.id_class[1];
   }

   public rrFs_1(rrFS var1) {
      this.id_case();
      ArrayList var8 = new ArrayList();
      this.id_class[1] = var8;
      ArrayList var9 = new ArrayList();
      this.id_class[2] = var9;
      this.id_class[0] = var1;

      for (Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
         ((List)this.id_class[1]).add(new rrFG(var3));
      }

      ((List)this.id_class[1]).add(new rrFb_1(this, "Preview Bind", "[Key]"));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1852312837382707362L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 889938662;
   }

   public float id_class(rrFE var1) {
      String var2 = var1.id_byte() + var1.id_break();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class().id_break(var2) + 15.0F;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, -109, 35, 111, 12, -8, 14, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_case();
      float var4 = ((rrFS)this.id_class[0]).id_long();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
      this.id_break(18.0F);
      float var6 = this.id_finally();
      float var7 = this.id_protected();
      var5.id_class(MinecraftAccessor.id_strictfp);

      for (rrFE var9 : this.id_byte()) {
         AnimValue var10 = var9.id_class();
         var9.id_class(var9.id_throws());
         if (var10.id_case()) {
            float var11 = var10.id_byte();
            float var12 = var10.id_continue();
            float var13 = var7 * 0.8F * var12;
            float var14 = var2 + 3.0F;
            float var15 = var3 + var6 - var13;
            int var16 = ColorHelper.id_break(rrZF.d_, (int)(255.0F * var11 * var4));
            String var17 = var9.id_byte();
            String var18 = var9.id_break();
            var5.id_break(var1, MinecraftAccessor.id_strictfp, var17, (double)var14, (double)var15, var16, false, false);
            var5.id_break(
               var1,
               MinecraftAccessor.id_strictfp,
               var18,
               (double)(var14 + ((rrFS)this.id_class[0]).id_implements() - var5.id_break(var18) - 5.0F),
               (double)var15,
               var16,
               false,
               false
            );
            float var19 = var7 * var11;
            var6 += var19;
            this.id_class(var19);
         }
      }

      var5.id_byte(MinecraftAccessor.id_strictfp);
   }

   public List<rrFE> id_class() {
      this.id_case();
      return (List<rrFE>)this.id_class[2];
   }

   public boolean id_break() {
      this.id_case();
      return (Boolean)this.id_class[3];
   }

   @Override
   public void id_throws() {
      this.id_case();
      super.id_throws();
      Collection var1 = this.id_byte();
      Boolean var8 = false;
      this.id_class[3] = var8;
      ((List)this.id_class[2]).clear();
      if (!var1.isEmpty()) {
         for (rrFE var3 : var1) {
            if (var3.id_throws()) {
               ((List)this.id_class[2]).add(var3);
               if (!var3.id_protected()) {
                  Boolean var9 = true;
                  this.id_class[3] = var9;
               }
            }
         }
      }
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, false, false, false, false, true, false};
   }

   private static void id_extends() {
      id_case = new byte[]{4, 3};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[3] = false;
      }
   }

   private static void id_implements() {
      id_catch = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   @Override
   public float id_protected() {
      return 10.0F;
   }

   private static void id_private() {
      id_throws = new short[]{1, 2, 0, 0, 1, 1, 0, 0, 0, 3, 2, 2, 3, 1, 0, 2, 3};
   }

   private static void id_native() {
      id_break = new String[]{new String("Preview Bind"), new String("[Key]")};
   }
}
