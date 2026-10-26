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
   private static final Logger class_ = LogManager.getLogger();
   private static final Vp_1 break_ = new Vp_1();
   private static VT byte_;
   private static int protected_ = -1;
   private final Map<String, IntSupplier> throws_ = Maps.newHashMap();
   private final List<String> case_ = Lists.newArrayList();
   private final List<Integer> catch_ = Lists.newArrayList();
   private final List<Vf_1> private_ = Lists.newArrayList();
   private final List<Integer> implements_ = Lists.newArrayList();
   private final Map<String, Vf_1> finally_ = Maps.newHashMap();
   private final int extends_;
   private final String native_;
   private boolean volatile_;
   private final gr_3 final_;
   private final List<Integer> package_;
   private final List<String> int_;
   private final Vw_1 new_;
   private final Vw_1 continue_;

   @Override
   public Vw_1 byte_() {
      return this.new_;
   }

   public VT(rAL var1, String var2) throws IOException {
      rqO_2 var3 = new rqO_2("shaders/program/" + var2 + ".json");
      this.native_ = var2;
      rAF var4 = null;

      try {
         var4 = var1.class_(var3);
         JsonObject var5 = rpY_2.class_(new InputStreamReader(var4.break_(), StandardCharsets.UTF_8));
         String var27 = rpY_2.case_(var5, "vertex");
         String var28 = rpY_2.case_(var5, "fragment");
         JsonArray var8 = rpY_2.class_(var5, "samplers", (JsonArray)null);
         if (var8 != null) {
            int var9 = 0;

            for (JsonElement var11 : var8) {
               try {
                  this.class_(var11);
               } catch (Exception var24) {
                  gP_2 var13 = gP_2.class_(var24);
                  var13.class_("samplers[" + var9 + "]");
                  throw var13;
               }

               var9++;
            }
         }

         JsonArray var29 = rpY_2.class_(var5, "attributes", (JsonArray)null);
         if (var29 != null) {
            int var30 = 0;
            this.package_ = Lists.newArrayListWithCapacity(var29.size());
            this.int_ = Lists.newArrayListWithCapacity(var29.size());

            for (JsonElement var12 : var29) {
               try {
                  this.int_.add(rpY_2.class_(var12, "attribute"));
               } catch (Exception var23) {
                  gP_2 var14 = gP_2.class_(var23);
                  var14.class_("attributes[" + var30 + "]");
                  throw var14;
               }

               var30++;
            }
         } else {
            this.package_ = null;
            this.int_ = null;
         }

         JsonArray var31 = rpY_2.class_(var5, "uniforms", (JsonArray)null);
         if (var31 != null) {
            int var33 = 0;

            for (JsonElement var37 : var31) {
               try {
                  this.break_(var37);
               } catch (Exception var22) {
                  gP_2 var15 = gP_2.class_(var22);
                  var15.class_("uniforms[" + var33 + "]");
                  throw var15;
               }

               var33++;
            }
         }

         this.final_ = class_(rpY_2.class_(var5, "blend", (JsonObject)null));
         this.new_ = class_(var1, VI.VERTEX, var27);
         this.continue_ = class_(var1, VI.FRAGMENT, var28);
         this.extends_ = Vt_1.class_();
         Vt_1.break_(this);
         this.catch_();
         if (this.int_ != null) {
            for (String var36 : this.int_) {
               int var38 = Vf_1.break_(this.extends_, var36);
               this.package_.add(var38);
            }
         }
      } catch (Exception var25) {
         String var6;
         if (var4 != null) {
            var6 = " (" + var4.byte_() + ")";
         } else {
            var6 = "";
         }

         gP_2 var7 = gP_2.class_(var25);
         var7.break_(var3.break_() + var6);
         throw var7;
      } finally {
         IOUtils.closeQuietly(var4);
      }

      this.break_();
   }

   public static gr_3 class_(JsonObject var0) {
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
         if (rpY_2.class_(var0, "func")) {
            var1 = gr_3.class_(var0.get("func").getAsString());
            if (var1 != 32774) {
               var6 = false;
            }
         }

         if (rpY_2.class_(var0, "srcrgb")) {
            var2 = gr_3.break_(var0.get("srcrgb").getAsString());
            if (var2 != 1) {
               var6 = false;
            }
         }

         if (rpY_2.class_(var0, "dstrgb")) {
            var3 = gr_3.break_(var0.get("dstrgb").getAsString());
            if (var3 != 0) {
               var6 = false;
            }
         }

         if (rpY_2.class_(var0, "srcalpha")) {
            var4 = gr_3.break_(var0.get("srcalpha").getAsString());
            if (var4 != 1) {
               var6 = false;
            }

            var7 = true;
         }

         if (rpY_2.class_(var0, "dstalpha")) {
            var5 = gr_3.break_(var0.get("dstalpha").getAsString());
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

   public Vf_1 class_(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return this.finally_.get(var1);
   }

   public void class_(String var1, IntSupplier var2) {
      if (this.throws_.containsKey(var1)) {
         this.throws_.remove(var1);
      }

      this.throws_.put(var1, var2);
      this.break_();
   }

   private void class_(JsonElement var1) {
      JsonObject var2 = rpY_2.private_(var1, "sampler");
      String var3 = rpY_2.case_(var2, "name");
      if (!rpY_2.class_(var2, "file")) {
         this.throws_.put(var3, (IntSupplier)null);
         this.case_.add(var3);
      } else {
         this.case_.add(var3);
      }
   }

   @Override
   public int class_() {
      return this.extends_;
   }

   public static Vw_1 class_(rAL var0, VI var1, String var2) throws IOException {
      Vw_1 var3 = var1.byte_().get(var2);
      if (var3 == null) {
         rqO_2 var4 = new rqO_2("shaders/program/" + var2 + var1.break_());
         rAF var5 = var0.class_(var4);

         try {
            var3 = Vw_1.class_(var1, var2, var5.break_(), var5.byte_());
         } finally {
            IOUtils.closeQuietly(var5);
         }
      }

      return var3;
   }

   @Override
   public void close() {
      for (Vf_1 var2 : this.private_) {
         var2.close();
      }

      Vt_1.class_(this);
   }

   private void break_(JsonElement var1) throws gP_2 {
      JsonObject var2 = rpY_2.private_(var1, "uniform");
      String var3 = rpY_2.case_(var2, "name");
      int var4 = Vf_1.class_(rpY_2.case_(var2, "type"));
      int var5 = rpY_2.extends_(var2, "count");
      float[] var6 = new float[Math.max(var5, 16)];
      JsonArray var7 = rpY_2.volatile_(var2, "values");
      if (var7.size() != var5 && var7.size() > 1) {
         throw new gP_2("Invalid amount of values specified (expected " + var5 + ", found " + var7.size() + ")");
      } else {
         int var8 = 0;

         for (JsonElement var10 : var7) {
            try {
               var6[var8] = rpY_2.protected_(var10, "value");
            } catch (Exception var13) {
               gP_2 var12 = gP_2.class_(var13);
               var12.class_("values[" + var8 + "]");
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
            var15.class_((int)var6[0], (int)var6[1], (int)var6[2], (int)var6[3]);
         } else if (var4 <= 7) {
            var15.break_(var6[0], var6[1], var6[2], var6[3]);
         } else {
            var15.class_(var6);
         }

         this.private_.add(var15);
      }
   }

   @Override
   public void break_() {
      this.volatile_ = true;
   }

   public Vp_1 break_(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      Vf_1 var2 = this.class_(var1);
      return (Vp_1)(var2 == null ? break_ : var2);
   }

   public void throws_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Vt_1.class_(0);
      protected_ = -1;
      byte_ = null;

      for (int var1 = 0; var1 < this.catch_.size(); var1++) {
         if (this.throws_.get(this.case_.get(var1)) != null) {
            MT.new_(33984 + var1);
            MT.short_();
            MT.super_(0);
         }
      }
   }

   private void catch_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      IntArrayList var1 = new IntArrayList();

      for (int var2 = 0; var2 < this.case_.size(); var2++) {
         String var3 = this.case_.get(var2);
         int var4 = Vf_1.class_(this.extends_, var3);
         if (var4 == -1) {
            class_.warn("Shader {} could not find sampler named {} in the specified shader program.", this.native_, var3);
            this.throws_.remove(var3);
            var1.add(var2);
         } else {
            this.catch_.add(var4);
         }
      }

      for (int var6 = var1.size() - 1; var6 >= 0; var6--) {
         this.case_.remove(var1.getInt(var6));
      }

      for (Vf_1 var8 : this.private_) {
         String var9 = var8.class_();
         int var5 = Vf_1.class_(this.extends_, var9);
         if (var5 == -1) {
            class_.warn("Could not find uniform named {} in the specified shader program.", var9);
         } else {
            this.implements_.add(var5);
            var8.class_(var5);
            this.finally_.put(var9, var8);
         }
      }
   }

   public void case_() {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      this.volatile_ = false;
      byte_ = this;
      this.final_.class_();
      if (this.extends_ != protected_) {
         Vt_1.class_(this.extends_);
         protected_ = this.extends_;
      }

      for (int var1 = 0; var1 < this.catch_.size(); var1++) {
         String var2 = this.case_.get(var1);
         IntSupplier var3 = this.throws_.get(var2);
         if (var3 != null) {
            RenderSystem.activeTexture(33984 + var1);
            RenderSystem.enableTexture();
            int var4 = var3.getAsInt();
            if (var4 != -1) {
               RenderSystem.bindTexture(var4);
               Vf_1.class_(this.catch_.get(var1), var1);
            }
         }
      }

      for (Vf_1 var6 : this.private_) {
         var6.break_();
      }
   }

   @Override
   public Vw_1 protected_() {
      return this.continue_;
   }
}
