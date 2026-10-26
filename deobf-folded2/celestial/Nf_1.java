package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nf_1 extends jY_2<Ng_1> {
   public static final Nq_1 id_class = new Nq_1("meta:missing_sound", 1.0F, 1.0F, 1, NT.FILE, false, false, 16);
   static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder()
      .registerTypeHierarchyAdapter(rgP_2.class, new rgB_2())
      .registerTypeAdapter(NY.class, new No_1())
      .create();
   private static final TypeToken<Map<String, NY>> id_protected = new Nj_1();
   private final Map<rqO_2, NI> id_throws = Maps.newHashMap();
   private final Nt_1 id_case;

   public void id_byte() {
      this.id_case.id_byte();
   }

   public boolean id_byte(NQ var1) {
      return this.id_case.id_break(var1);
   }

   public Nf_1(rAL var1, Qw_1 var2) {
      this.id_case = new Nt_1(this, var2, var1);
   }

   public void id_class(rqL_2 var1, float var2) {
      if (var1 == rqL_2.MASTER && var2 <= 0.0F) {
         this.id_byte();
      }

      this.id_case.id_class(var1, var2);
   }

   public void id_class(boolean var1) {
      this.id_case.id_class(var1);
   }

   protected void id_class(Ng_1 var1, rAL var2) {
      var1.id_class(this.id_throws, this.id_case);

      for (rqO_2 var4 : this.id_throws.keySet()) {
         NI var5 = this.id_throws.get(var4);
         if (var5.id_protected() instanceof rgn_3) {
            String var6 = ((rgn_3)var5.id_protected()).id_implements();
            if (!jI_2.id_class(var6)) {
               id_break.debug("Missing subtitle {} for event: {}", var6, var4);
            }
         }
      }

      if (id_break.isDebugEnabled()) {
         for (rqO_2 var8 : this.id_throws.keySet()) {
            if (!rVL.id_short.id_byte(var8)) {
               id_break.debug("Not having sound event for: {}", var8);
            }
         }
      }

      this.id_case.id_class();
   }

   static boolean id_class(Nq_1 var0, rqO_2 var1, rAL var2) {
      rqO_2 var3 = var0.id_protected();
      if (!var2.id_break(var3)) {
         id_break.warn("{} - File {} does not exist, cannot add it to event {}", var2.getClass().getSimpleName(), var3, var1);
         return false;
      } else {
         return true;
      }
   }

   public void id_class(rqO_2 var1, rqL_2 var2) {
      this.id_case.id_class(var1, var2);
   }

   public void id_class(Nu_1 var1) {
      this.id_case.id_class(var1);
   }

   protected Ng_1 id_class(rAL var1) {
      Ng_1 var2 = new Ng_1();

      for (String var4 : var1.id_class()) {
         try {
            for (rAF var6 : var1.id_byte(new rqO_2(var4, "sounds.json"))) {
               try (
                  InputStream var7 = var6.id_break();
                  InputStreamReader var8 = new InputStreamReader(var7, StandardCharsets.UTF_8);
               ) {
                  Map var9 = rpY_2.id_class(id_byte, var8, id_protected);

                  for (Entry var11 : var9.entrySet()) {
                     var2.id_class(new rqO_2(var4, (String)var11.getKey()), (NY)var11.getValue(), var1);
                  }
               } catch (RuntimeException var16) {
                  id_break.warn("Invalid sounds.json in resourcepack: '{}'", var6.id_byte(), var16);
               }
            }

            ((rrIH)rrIH.staticFields0d29566e59ec37698621b18f09fc7b34[0]).id_class(var2, var1);
         } catch (IOException var17) {
         }
      }

      return var2;
   }

   public void id_class(NQ var1, int var2) {
      this.id_case.id_class(var1, var2);
   }

   public NI id_class(rqO_2 var1) {
      return this.id_throws.get(var1);
   }

   public void id_class(Nm_1 var1) {
      this.id_case.id_class(var1);
   }

   public Collection<rqO_2> id_class() {
      return this.id_throws.keySet();
   }

   public void id_class(ly_3 var1) {
      this.id_case.id_class(var1);
   }

   public void id_class(NQ var1) {
      this.id_case.id_byte(var1);
   }

   public void id_break(Nu_1 var1) {
      this.id_case.id_break(var1);
   }

   public void id_break() {
      this.id_case.id_protected();
   }

   public void id_break(NQ var1) {
      this.id_case.id_class(var1);
   }

   public void id_throws() {
      this.id_case.id_throws();
   }

   public String id_case() {
      return this.id_case.id_case();
   }

   public void id_protected() {
      this.id_case.id_break();
   }
}
