package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class bS_2 extends bb_3 implements MinecraftAccessor {
   public Object[] id_class;
   private static boolean[] id_break;
   private static String[] id_protected;
   private static short[] id_throws;
   private static float[] id_case;
   private static byte[] id_catch;

   public bS_2(C_class var1, bM_2 var2) {
      super(var1, var2);
      this.id_implements();
      ConcurrentHashMap var7 = new ConcurrentHashMap();
      this.id_class[id_throws[0]] = var7;
      HashMap var8 = new HashMap();
      this.id_class[id_throws[1]] = var8;
      HashMap var9 = new HashMap();
      this.id_class[id_throws[2]] = var9;
      bs_3 var10 = (var1x, var2x) -> {
         this.id_implements();
         xd_3 var3 = var2x.id_break();
         if (var3 instanceof JI) {
            return ((rrIk_1)((Map)this.id_class[id_throws[21]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[22]])).id_class();
         } else if (var3 instanceof Wp_1) {
            return ((rrIk_1)((Map)this.id_class[id_throws[23]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[24]])).id_class();
         } else if (var3 instanceof Ji_1) {
            return ((rrIk_1)((Map)this.id_class[id_throws[25]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[26]])).id_class();
         } else if (var3 instanceof dv_3) {
            return ((rrIk_1)((Map)this.id_class[id_throws[27]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[28]])).id_class();
         } else if (var3 instanceof xs_3) {
            return ((rrIk_1)((Map)this.id_class[id_throws[29]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[30]])).id_class();
         } else {
            return var3 instanceof JV
               ? ((rrIk_1)((Map)this.id_class[id_throws[31]]).get((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_throws[32]])).id_class()
               : id_break[7];
         }
      };
      this.id_class[id_throws[3]] = var10;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2676388593306701240L;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_implements();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[9]]) {
         if (((Map)this.id_class[id_throws[10]]).isEmpty()) {
            return;
         }

         Ps_1 var2 = this.id_byte().id_throw();
         rYB var3 = var2.id_case();
         ((Map)this.id_class[id_throws[11]]).entrySet().removeIf(var2x -> {
            this.id_implements();
            rfH_2 var3x = (rfH_2)var2x.getKey();
            xd_3 var4 = (xd_3)var2x.getValue();
            if (var3.id_byte(var3x).id_break() == var4) {
               ((Map)this.id_class[id_throws[18]]).put(var3x, var4);
               return id_break[4];
            } else if (((Map)this.id_class[id_throws[19]]).containsKey(var3x)) {
               ((Map)this.id_class[id_throws[20]]).remove(var3x);
               return id_break[5];
            } else {
               return id_break[6];
            }
         });
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 83, 25, -35, 113, 69, 51, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(rrLu_1 var1) {
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvC_2 var3) {
         var3.id_class((var1x, var2x) -> this.id_break(var1x, var2x));
      } else if (var2 instanceof rZR var4) {
         this.id_break(var4.id_byte(), var4.id_break());
      }
   }

   public void id_class(Map<bE_2, rrIk_1> var1) {
      this.id_implements();
      ((Map)this.id_class[id_throws[14]]).clear();
      ((Map)this.id_class[id_throws[15]]).putAll(var1);
   }

   @Override
   public void id_class() {
      this.id_implements();
      super.id_class();
      ((Map)this.id_class[id_throws[12]]).clear();
      ((Map)this.id_class[id_throws[13]]).clear();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 81493762;
   }

   @Override
   public void id_class(T var1) {
      this.id_implements();
      if (!((Map)this.id_class[id_throws[4]]).isEmpty()) {
         Ps_1 var2 = this.id_byte().id_throw();
         QY var3 = var2.id_throws();
         yt_3 var4 = ((yX_2)var3.id_class[id_throws[5]]).id_static();
         rYB var5 = var2.id_case();
         Ml_1 var6 = var1.id_byte();
         float var7 = var1.id_break();
         var6.id_class();
         GL11.glEnable(id_throws[6]);
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(id_case[0]);
         RenderSystem.disableTexture();
         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(id_break[0]);
         id_strictfp.id_class(id_break[1], ju_3.id_this);
         double var8 = id_void.id_case();
         double var10 = id_void.id_catch();
         double var12 = id_void.id_private();

         for (Entry var15 : ((Map)this.id_class[id_throws[7]]).entrySet()) {
            rfH_2 var16 = (rfH_2)var15.getKey();
            xd_3 var17 = (xd_3)var15.getValue();
            double var18 = (double)var16.b_();
            double var20 = (double)var16.c_();
            double var22 = (double)var16.d_();
            ryO_2 var25 = var5.id_class(var16);
            rfl_3 var24;
            if (var25 != null) {
               xc_3 var26 = var25.id_abstract();
               rjC_2 var27 = rrjc_3.id_class(var25, var16, var26, var7);
               if (var27 == null) {
                  continue;
               }

               var24 = var27.id_class().id_protected(var18, var20, var22);
            } else {
               var24 = rrjc_3.id_class(var17.id_continue(), var16).id_protected(var18, var20, var22);
            }

            if (var4.id_class(var24)) {
               rrfD_2.id_class(var6, var24.id_protected(-var8, -var10, -var12), id_catch[0]);
            }
         }

         id_default.id_break();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(id_break[2]);
         RenderSystem.disableBlend();
         GL11.glDisable(id_throws[8]);
         var6.id_break();
      }
   }

   private void id_break(rfH_2 var1, xc_3 var2) {
      this.id_implements();
      if (!var2.id_catch()) {
         xd_3 var3 = var2.id_break();
         if (((bs_3)this.id_class[id_throws[16]]).test(var1, var2) && ((Map)this.id_class[id_throws[17]]).putIfAbsent(var1.id_int(), var3) == null) {
            rVi_1 var4 = new rgN_2(id_protected[0])
               .id_class(rgF_2.GRAY)
               .id_break(id_protected[1])
               .id_class(new rgN_2(jI_2.id_class(id_protected[2], var3.id_volatile())).id_class(rgF_2.RED))
               .id_break(id_protected[3]);
            this.id_class(var4);
         }
      }
   }

   private static void id_throws() {
      id_throws = new short[]{0, 1, 2, 3, 0, 8, 2848, 0, 2848, 0, 0, 0, 0, 1, 2, 2, 3, 0, 1, 1, 1, 2, 0, 2, 1, 2, 2, 2, 3, 2, 4, 2, 5};
   }

   private static void id_finally() {
      id_protected = new String[]{new String(""), new String("Найден блок '"), new String("ru_ru"), new String("'")};
   }

   private static void id_catch() {
      id_catch = new byte[]{-1, 4};
   }

   private static void id_case() {
      id_case = new float[]{1.5F};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_catch[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_break = new boolean[]{false, true, true, false, false, true, false, false};
   }
}
