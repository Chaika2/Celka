package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VT implements AutoCloseable, VH {
   private static final Logger id_class = LogManager.getLogger();
   private static final Vp_1 id_break = new Vp_1();
   private static VT id_byte;
   private static int id_protected = -1;
   private final Map<String, IntSupplier> id_throws = Maps.newHashMap();
   private final List<String> id_case = Lists.newArrayList();
   private final List<Integer> id_catch = Lists.newArrayList();
   private final List<Vf_1> id_private = Lists.newArrayList();
   private final List<Integer> id_implements = Lists.newArrayList();
   private final Map<String, Vf_1> id_finally = Maps.newHashMap();
   private final int id_extends;
   private final String id_native;
   private boolean id_volatile;
   private final gr_3 id_final;
   private final List<Integer> id_package;
   private final List<String> id_int;
   private final Vw_1 id_new;
   private final Vw_1 id_continue;

   @Override
   public Vw_1 id_byte() {
      return this.id_new;
   }

   public VT(rAL var1, String var2) throws IOException {
      rqO_2 var3 = new rqO_2("shaders/program/" + var2 + ".json");
      this.id_native = var2;
      rAF var4 = null;

      try {
         var4 = var1.id_class(var3);
         JsonObject var5 = rpY_2.id_class(new InputStreamReader(var4.id_break(), StandardCharsets.UTF_8));
         String var27 = rpY_2.id_case(var5, "vertex");
         String var28 = rpY_2.id_case(var5, "fragment");
         JsonArray var8 = rpY_2.id_class(var5, "samplers", (JsonArray)null);
         if (var8 != null) {
            int var9 = 0;

            for (JsonElement var11 : var8) {
               try {
                  this.id_class(var11);
               } catch (Exception var24) {
                  gP_2 var13 = gP_2.id_class(var24);
                  var13.id_class("samplers[" + var9 + "]");
                  throw var13;
               }

               var9++;
            }
         }

         JsonArray var29 = rpY_2.id_class(var5, "attributes", (JsonArray)null);
         if (var29 != null) {
            int var30 = 0;
            this.id_package = Lists.newArrayListWithCapacity(var29.size());
            this.id_int = Lists.newArrayListWithCapacity(var29.size());

            for (JsonElement var12 : var29) {
               try {
                  this.id_int.add(rpY_2.id_class(var12, "attribute"));
               } catch (Exception var23) {
                  gP_2 var14 = gP_2.id_class(var23);
                  var14.id_class("attributes[" + var30 + "]");
                  throw var14;
               }

               var30++;
            }
         } else {
            this.id_package = null;
            this.id_int = null;
         }

         JsonArray var31 = rpY_2.id_class(var5, "uniforms", (JsonArray)null);
         if (var31 != null) {
            int var33 = 0;

            for (JsonElement var37 : var31) {
               try {
                  this.id_break(var37);
               } catch (Exception var22) {
                  gP_2 var15 = gP_2.id_class(var22);
                  var15.id_class("uniforms[" + var33 + "]");
                  throw var15;
               }

               var33++;
            }
         }

         this.id_final = id_class(rpY_2.id_class(var5, "blend", (JsonObject)null));
         this.id_new = id_class(var1, VI.VERTEX, var27);
         this.id_continue = id_class(var1, VI.FRAGMENT, var28);
         this.id_extends = Vt_1.id_class();
         Vt_1.id_break(this);
         this.id_catch();
         if (this.id_int != null) {
            for (String var36 : this.id_int) {
               int var38 = Vf_1.id_break(this.id_extends, var36);
               this.id_package.add(var38);
            }
         }
      } catch (Exception var25) {
         String var6;
         if (var4 != null) {
            var6 = " (" + var4.id_byte() + ")";
         } else {
            var6 = "";
         }

         gP_2 var7 = gP_2.id_class(var25);
         var7.id_break(var3.id_break() + var6);
         throw var7;
      } finally {
         IOUtils.closeQuietly(var4);
      }

      this.id_break();
   }

   public static gr_3 id_class(JsonObject var0) {
      if (var0 == null) {
         return new gr_3();
      } else {
         int var1 = 32774;
         int var2 = 1;
         int var3 = 0;
         int var4 = 1;
         int var5 = 0;
         boolean var6 = true;
         boolean var7 = false;
         if (rpY_2.id_class(var0, "func")) {
            var1 = gr_3.id_class(var0.get("func").getAsString());
            if (var1 != 32774) {
               var6 = false;
            }
         }

         if (rpY_2.id_class(var0, "srcrgb")) {
            var2 = gr_3.id_break(var0.get("srcrgb").getAsString());
            if (var2 != 1) {
               var6 = false;
            }
         }

         if (rpY_2.id_class(var0, "dstrgb")) {
            var3 = gr_3.id_break(var0.get("dstrgb").getAsString());
            if (var3 != 0) {
               var6 = false;
            }
         }

         if (rpY_2.id_class(var0, "srcalpha")) {
            var4 = gr_3.id_break(var0.get("srcalpha").getAsString());
            if (var4 != 1) {
               var6 = false;
            }

            var7 = true;
         }

         if (rpY_2.id_class(var0, "dstalpha")) {
            var5 = gr_3.id_break(var0.get("dstalpha").getAsString());
            if (var5 != 0) {
               var6 = false;
            }

            var7 = true;
         }

         if (var6) {
            return new gr_3();
         } else {
            return var7 ? new gr_3(var2, var3, var4, var5, var1) : new gr_3(var2, var3, var1);
         }
      }
   }

   public Vf_1 id_class(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return this.id_finally.get(var1);
   }

   public void id_class(String var1, IntSupplier var2) {
      if (this.id_throws.containsKey(var1)) {
         this.id_throws.remove(var1);
      }

      this.id_throws.put(var1, var2);
      this.id_break();
   }

   private void id_class(JsonElement var1) {
      JsonObject var2 = rpY_2.id_private(var1, "sampler");
      String var3 = rpY_2.id_case(var2, "name");
      if (!rpY_2.id_class(var2, "file")) {
         this.id_throws.put(var3, (IntSupplier)null);
         this.id_case.add(var3);
      } else {
         this.id_case.add(var3);
      }
   }

   @Override
   public int id_class() {
      return this.id_extends;
   }

   public static Vw_1 id_class(rAL var0, VI var1, String var2) throws IOException {
      Vw_1 var3 = var1.id_byte().get(var2);
      if (var3 == null) {
         rqO_2 var4 = new rqO_2("shaders/program/" + var2 + var1.id_break());
         rAF var5 = var0.id_class(var4);

         try {
            var3 = Vw_1.id_class(var1, var2, var5.id_break(), var5.id_byte());
         } finally {
            IOUtils.closeQuietly(var5);
         }
      }

      return var3;
   }

   @Override
   public void close() {
      for (Vf_1 var2 : this.id_private) {
         var2.close();
      }

      Vt_1.id_class(this);
   }

   private void id_break(JsonElement var1) throws gP_2 {
      JsonObject var2 = rpY_2.id_private(var1, "uniform");
      String var3 = rpY_2.id_case(var2, "name");
      int var4 = Vf_1.id_class(rpY_2.id_case(var2, "type"));
      int var5 = rpY_2.id_extends(var2, "count");
      float[] var6 = new float[Math.max(var5, 16)];
      JsonArray var7 = rpY_2.id_volatile(var2, "values");
      if (var7.size() != var5 && var7.size() > 1) {
         throw new gP_2("Invalid amount of values specified (expected " + var5 + ", found " + var7.size() + ")");
      } else {
         int var8 = 0;

         for (JsonElement var10 : var7) {
            try {
               var6[var8] = rpY_2.id_protected(var10, "value");
            } catch (Exception var13) {
               gP_2 var12 = gP_2.id_class(var13);
               var12.id_class("values[" + var8 + "]");
               throw var12;
            }

            var8++;
         }

         if (var5 > 1 && var7.size() == 1) {
            while (var8 < var5) {
               var6[var8] = var6[0];
               var8++;
            }
         }

         int var14 = var5 > 1 && var5 <= 4 && var4 < 8 ? var5 - 1 : 0;
         Vf_1 var15 = new Vf_1(var3, var4 + var14, var5, this);
         if (var4 <= 3) {
            var15.id_class((int)var6[0], (int)var6[1], (int)var6[2], (int)var6[3]);
         } else if (var4 <= 7) {
            var15.id_break(var6[0], var6[1], var6[2], var6[3]);
         } else {
            var15.id_class(var6);
         }

         this.id_private.add(var15);
      }
   }

   @Override
   public void id_break() {
      this.id_volatile = true;
   }

   public Vp_1 id_break(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      Vf_1 var2 = this.id_class(var1);
      return (Vp_1)(var2 == null ? id_break : var2);
   }

   public void id_throws() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Vt_1.id_class(0);
      id_protected = -1;
      id_byte = null;

      for (int var1 = 0; var1 < this.id_catch.size(); var1++) {
         if (this.id_throws.get(this.id_case.get(var1)) != null) {
            MT.id_new(33984 + var1);
            MT.id_short();
            MT.id_super(0);
         }
      }
   }

   private void id_catch() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      IntArrayList var1 = new IntArrayList();

      for (int var2 = 0; var2 < this.id_case.size(); var2++) {
         String var3 = this.id_case.get(var2);
         int var4 = Vf_1.id_class(this.id_extends, var3);
         if (var4 == -1) {
            id_class.warn("Shader {} could not find sampler named {} in the specified shader program.", this.id_native, var3);
            this.id_throws.remove(var3);
            var1.add(var2);
         } else {
            this.id_catch.add(var4);
         }
      }

      for (int var6 = var1.size() - 1; var6 >= 0; var6--) {
         this.id_case.remove(var1.getInt(var6));
      }

      for (Vf_1 var8 : this.id_private) {
         String var9 = var8.id_class();
         int var5 = Vf_1.id_class(this.id_extends, var9);
         if (var5 == -1) {
            id_class.warn("Could not find uniform named {} in the specified shader program.", var9);
         } else {
            this.id_implements.add(var5);
            var8.id_class(var5);
            this.id_finally.put(var9, var8);
         }
      }
   }

   public void id_case() {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      this.id_volatile = false;
      id_byte = this;
      this.id_final.id_class();
      if (this.id_extends != id_protected) {
         Vt_1.id_class(this.id_extends);
         id_protected = this.id_extends;
      }

      for (int var1 = 0; var1 < this.id_catch.size(); var1++) {
         String var2 = this.id_case.get(var1);
         IntSupplier var3 = this.id_throws.get(var2);
         if (var3 != null) {
            RenderSystem.activeTexture(33984 + var1);
            RenderSystem.enableTexture();
            int var4 = var3.getAsInt();
            if (var4 != -1) {
               RenderSystem.bindTexture(var4);
               Vf_1.id_class(this.id_catch.get(var1), var1);
            }
         }
      }

      for (Vf_1 var6 : this.id_private) {
         var6.id_break();
      }
   }

   @Override
   public Vw_1 id_protected() {
      return this.id_continue;
   }
}
