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
   public static final Nq_1 class_ = new Nq_1("meta:missing_sound", 1.0F, 1.0F, 1, NT.FILE, false, false, 16);
   static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder()
      .registerTypeHierarchyAdapter(rgP_2.class, new rgB_2())
      .registerTypeAdapter(NY.class, new No_1())
      .create();
   private static final TypeToken<Map<String, NY>> protected_ = new Nj_1();
   private final Map<rqO_2, NI> throws_ = Maps.newHashMap();
   private final Nt_1 case_;

   public void byte_() {
      this.case_.byte_();
   }

   public boolean byte_(NQ var1) {
      return this.case_.break_(var1);
   }

   public Nf_1(rAL var1, Qw_1 var2) {
      this.case_ = new Nt_1(this, var2, var1);
   }

   public void class_(rqL_2 var1, float var2) {
      if (var1 == rqL_2.MASTER && var2 <= 0.0F) {
         this.byte_();
      }

      this.case_.class_(var1, var2);
   }

   public void class_(boolean var1) {
      this.case_.class_(var1);
   }

   protected void class_(Ng_1 var1, rAL var2) {
      var1.class_(this.throws_, this.case_);

      for (rqO_2 var4 : this.throws_.keySet()) {
         NI var5 = this.throws_.get(var4);
         if (var5.protected_() instanceof rgn_3) {
            String var6 = ((rgn_3)var5.protected_()).implements_();
            if (!jI_2.class_(var6)) {
               break_.debug("Missing subtitle {} for event: {}", var6, var4);
            }
         }
      }

      if (break_.isDebugEnabled()) {
         for (rqO_2 var8 : this.throws_.keySet()) {
            if (!rVL.short_.byte_(var8)) {
               break_.debug("Not having sound event for: {}", var8);
            }
         }
      }

      this.case_.class_();
   }

   static boolean class_(Nq_1 var0, rqO_2 var1, rAL var2) {
      rqO_2 var3 = var0.protected_();
      if (!var2.break_(var3)) {
         break_.warn("{} - File {} does not exist, cannot add it to event {}", var2.getClass().getSimpleName(), var3, var1);
         return false;
      } else {
         return true;
      }
   }

   public void class_(rqO_2 var1, rqL_2 var2) {
      this.case_.class_(var1, var2);
   }

   public void class_(Nu_1 var1) {
      this.case_.class_(var1);
   }

   protected Ng_1 class_(rAL var1) {
      Ng_1 var2 = new Ng_1();

      for (String var4 : var1.class_()) {
         try {
            for (rAF var6 : var1.byte_(new rqO_2(var4, "sounds.json"))) {
               try (
                  InputStream var7 = var6.break_();
                  InputStreamReader var8 = new InputStreamReader(var7, StandardCharsets.UTF_8);
               ) {
                  Map var9 = rpY_2.class_(byte_, var8, protected_);

                  for (Entry var11 : var9.entrySet()) {
                     var2.class_(new rqO_2(var4, (String)var11.getKey()), (NY)var11.getValue(), var1);
                  }
               } catch (RuntimeException var16) {
                  break_.warn("Invalid sounds.json in resourcepack: '{}'", var6.byte_(), var16);
               }
            }

            ((rrIH)rrIH.staticFields0d29566e59ec37698621b18f09fc7b34[0]).class_(var2, var1);
         } catch (IOException var17) {
         }
      }

      return var2;
   }

   public void class_(NQ var1, int var2) {
      this.case_.class_(var1, var2);
   }

   public NI class_(rqO_2 var1) {
      return this.throws_.get(var1);
   }

   public void class_(Nm_1 var1) {
      this.case_.class_(var1);
   }

   public Collection<rqO_2> class_() {
      return this.throws_.keySet();
   }

   public void class_(ly_3 var1) {
      this.case_.class_(var1);
   }

   public void class_(NQ var1) {
      this.case_.byte_(var1);
   }

   public void break_(Nu_1 var1) {
      this.case_.break_(var1);
   }

   public void break_() {
      this.case_.protected_();
   }

   public void break_(NQ var1) {
      this.case_.class_(var1);
   }

   public void throws_() {
      this.case_.throws_();
   }

   public String case_() {
      return this.case_.case_();
   }

   public void protected_() {
      this.case_.break_();
   }
}
