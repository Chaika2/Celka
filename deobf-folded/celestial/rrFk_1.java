package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFk_1 extends rrFl_1<rrFz_1> {
   private static String[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_class;
   private static double[] id_case;
   private static float[] id_catch;
   private static byte[] id_private;
   public Object[] id_break;
   private static short[] id_implements;

   @Override
   public Collection<rrFz_1> id_byte() {
      this.id_final();
      return (List)this.id_break[1];
   }

   private static void id_int() {
      id_case = new double[]{140.0};
   }

   public rrFk_1(rrFd_1 var1) {
      this.id_final();
      ArrayList var6 = new ArrayList();
      this.id_break[1] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[2] = var7;
      rrFN var8 = new rrFN();
      this.id_break[3] = var8;
      this.id_break[id_implements[3]] = var1;
      ((List)this.id_break[1]).add(new rrFc_1(this, id_protected[0], id_protected[1], id_protected[2]));
   }

   static {
      ntfClinit();
   }

   public void id_class(rrAN var1) {
      this.id_final();
      rLR var2 = var1.id_class();

      for (rrFz_1 var4 : (List)this.id_break[1]) {
         if (var4 instanceof rrFQ var5 && var5.id_private().id_class().equals(var2)) {
            var4.id_class(id_throws[8]);
            ((List)this.id_break[2]).remove(var4);
            break;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -71, 69, 58, -115, -36, 8, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_final();
      float var4 = ((rrFd_1)this.id_break[id_implements[5]]).id_long();
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[6]]).id_class();
      this.id_break(18.0F);
      float var6 = this.id_finally();
      float var7 = this.id_protected();
      var5.id_class(MinecraftAccessor.id_strictfp);
      float var8 = (float)Math.sin((double)System.currentTimeMillis() / 140.0) * 0.5F + 0.5F;
      float var9 = 1.0F;

      for (rrFz_1 var11 : this.id_byte()) {
         AnimValue var12 = var11.id_class();
         if (var12.id_case()) {
            float var13 = var12.id_byte();
            float var14 = var12.id_continue();
            if (var11 instanceof rrFQ var15) {
               rLY var16 = var15.id_private();
               var9 = var16.id_break() <= 200 ? var8 : 1.0F;
            }

            int var22 = ColorHelper.id_break(rrZF.d_, (int)(255.0F * var9 * var13 * var4));
            float var23 = var7 * 0.8F * var14;
            float var17 = var2 + 3.0F;
            float var18 = var3 + var6 - var23;
            String var19 = var11.id_protected();
            String var20 = var11.id_break();
            var5.id_break(var1, MinecraftAccessor.id_strictfp, var19, (double)var17, (double)var18, var22, id_throws[0], id_throws[1]);
            var5.id_break(
               var1,
               MinecraftAccessor.id_strictfp,
               var20,
               (double)(var17 + ((rrFd_1)this.id_break[id_implements[8]]).id_implements() - var5.id_break(var20) - 5.0F),
               (double)var18,
               var22,
               id_throws[2],
               id_throws[3]
            );
            float var21 = var7 * var13;
            var6 += var21;
            this.id_class(var21);
         }
      }

      var5.id_byte(MinecraftAccessor.id_strictfp);
   }

   public void id_class(rrFK var1) {
      this.id_final();
      ((List)this.id_break[1]).removeIf(var0 -> !var0.id_byte() ? true : id_throws[10]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1938109630191114692L;
   }

   public float id_class(rrFz_1 var1) {
      String var2 = var1.id_protected() + var1.id_break();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[26]]).id_class().id_break(var2) + 15.0F;
   }

   public void id_class(rrLI var1) {
      this.id_final();
      rLY var2 = var1.id_break();
      rLR var3 = var2.id_class();

      for (rrFz_1 var5 : (List)this.id_break[1]) {
         if (var5 instanceof rrFQ var6 && var6.id_private().id_class().equals(var3)) {
            var6.id_class(var2);
            break;
         }
      }
   }

   public List<rrFz_1> id_class() {
      this.id_final();
      return (List<rrFz_1>)this.id_break[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2048181643;
   }

   public void id_class(rrLC var1) {
      this.id_final();
      rLY var2 = var1.id_break();
      rrFQ var3 = new rrFQ(var2);
      ((List)this.id_break[1]).remove(var3);
      ((List)this.id_break[1]).add(var3);
      if (((List)this.id_break[1]).size() > 1) {
         ((List)this.id_break[1]).sort((Comparator)this.id_break[3]);
      }
   }

   public rrFd_1 id_break() {
      this.id_final();
      return (rrFd_1)this.id_break[id_implements[29]];
   }

   @Override
   public void id_throws() {
      this.id_final();
      super.id_throws();
      Collection var1 = this.id_byte();
      Boolean var11 = id_throws[4];
      this.id_break[4] = var11;
      ((List)this.id_break[2]).clear();
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrFz_1 var3 = (rrFz_1)var2.next();
            AnimValue var4 = var3.id_class();
            boolean var5 = var3.id_byte();
            if (!var5 && var4.id_catch()) {
               var2.remove();
            } else {
               if (var3 instanceof rrFQ) {
                  rrFQ var6 = (rrFQ)var3;
                  if ((cb_3)MinecraftAccessor.id_import.id_class[57] != null
                     && !((cb_3)MinecraftAccessor.id_import.id_class[57]).id_break(var6.id_private().id_class())) {
                     var6.id_class(id_throws[5]);
                  }

                  var6.id_catch();
               }

               if (var3.id_throws()) {
                  ((List)this.id_break[2]).add(var3);
                  if (!var5) {
                     Boolean var12 = true;
                     this.id_break[4] = var12;
                  }
               }
            }
         }
      }
   }

   public void id_catch() {
      this.id_final();

      for (rrFz_1 var2 : (List)this.id_break[1]) {
         var2.id_class(var2.id_throws());
      }
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{new rrFW()};
      id_class = var0;
   }

   public Comparator<rrFz_1> id_case() {
      this.id_final();
      return (Comparator<rrFz_1>)this.id_break[3];
   }

   private static void id_continue() {
      id_catch = new float[]{18.0F, 0.5F, 0.5F, 1.0F, 1.0F, 255.0F, 0.8F, 3.0F, 5.0F, 15.0F, 10.0F};
   }

   public List<rrFz_1> id_implements() {
      this.id_final();
      return (List<rrFz_1>)this.id_break[1];
   }

   private static void id_new() {
      id_protected = new String[]{new String("Preview Potion"), new String("999"), new String("**:**")};
   }

   private static void id_package() {
      id_throws = new boolean[]{false, false, false, false, false, false, true, true, false, true, false, false, false, true};
   }

   @Override
   public float id_protected() {
      return 10.0F;
   }

   public boolean id_private() {
      this.id_final();
      return (Boolean)this.id_break[4];
   }

   private void id_final() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         Object[] var1 = this.id_break;
         var1[4] = id_throws[12];
      }
   }

   private static void id_volatile() {
      id_implements = new short[]{1, 2, 3, 0, 1, 0, 0, 200, 0, 1, 4, 2, 57, 57, 2, 4, 1, 1, 1, 1, 3, 1, 2, 1, 1, 1, 0, 2, 4, 0, 1, 3};
   }

   private static void id_native() {
      id_private = new byte[]{5, 4};
   }
}
