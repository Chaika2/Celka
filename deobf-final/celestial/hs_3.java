package celestial;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class hs_3 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = new GsonBuilder()
      .registerTypeAdapter(Oj_1.class, new OV())
      .registerTypeAdapter(rqO_2.class, new rqh_3())
      .setPrettyPrinting()
      .create();
   private static final TypeToken<Map<rqO_2, Oj_1>> byte_ = new hE_2();
   private final DataFixer protected_;
   private final rCr_1 throws_;
   private final File case_;
   private final Map<OT, Oj_1> catch_ = Maps.newLinkedHashMap();
   private final Set<OT> private_ = Sets.newLinkedHashSet();
   private final Set<OT> implements_ = Sets.newLinkedHashSet();
   private final Set<OT> finally_ = Sets.newLinkedHashSet();
   private rhN_2 extends_;
   private OT native_;
   private boolean volatile_ = true;

   private void byte_() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.catch_.entrySet()) {
         if (((Oj_1)var3.getValue()).class_()) {
            var1.add((OT)var3.getKey());
            this.finally_.add((OT)var3.getKey());
         }
      }

      for (OT var5 : var1) {
         this.throws_(var5);
      }
   }

   private void byte_(OT var1) {
      Oj_1 var2 = this.break_(var1);
      if (!var2.class_()) {
         for (Entry var4 : var1.case_().entrySet()) {
            OD var5 = var2.byte_((String)var4.getKey());
            if (var5 != null && !var5.class_()) {
               hr_3 var6 = ((OK)var4.getValue()).class_();
               if (var6 != null) {
                  hP_2 var7 = Oo_1.class_(var6.class_());
                  if (var7 != null) {
                     var7.class_(this, new hB_2<>(var6, var1, (String)var4.getKey()));
                  }
               }
            }
         }
      }
   }

   private void byte_(Of_1 var1) {
      for (OT var3 : var1.class_()) {
         if (var3.case_().isEmpty()) {
            this.class_(var3, "");
            var3.protected_().class_(this.extends_);
         }
      }
   }

   public hs_3(DataFixer var1, rCr_1 var2, Of_1 var3, File var4, rhN_2 var5) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var4;
      this.extends_ = var5;
      this.protected_(var3);
   }

   public void class_() {
      for (hP_2 var2 : Oo_1.class_()) {
         var2.class_(this);
      }
   }

   public void class_(OT var1) {
      OT var2 = this.native_;
      if (var1 != null && var1.break_() == null && var1.byte_() != null) {
         this.native_ = var1;
      } else {
         this.native_ = null;
      }

      if (var2 != this.native_) {
         this.extends_.class_.class_(new rFS(this.native_ == null ? null : this.native_.private_()));
      }
   }

   public void class_(rhN_2 var1) {
      this.extends_ = var1;
   }

   public boolean class_(OT var1, String var2) {
      boolean var3 = false;
      Oj_1 var4 = this.break_(var1);
      boolean var5 = var4.class_();
      if (var4.class_(var2)) {
         this.protected_(var1);
         this.finally_.add(var1);
         var3 = true;
         if (!var5 && var4.class_()) {
            var1.protected_().class_(this.extends_);
            if (var1.byte_() != null && var1.byte_().implements_() && ((rYB)this.extends_.throws_[7]).B().break_(rRu_1.return_)) {
               this.throws_
                  .class_(new rgn_3("chat.type.advancement." + var1.byte_().throws_().class_(), this.extends_.L_(), var1.finally_()), rVU.SYSTEM, rqR_2.break_);
            }
         }
      }

      if (var4.class_()) {
         this.throws_(var1);
      }

      return var3;
   }

   public void class_(Of_1 var1) {
      this.class_();
      this.catch_.clear();
      this.private_.clear();
      this.implements_.clear();
      this.finally_.clear();
      this.volatile_ = true;
      this.native_ = null;
      this.protected_(var1);
   }

   private void class_(OT var1, Oj_1 var2) {
      var2.class_(var1.case_(), var1.implements_());
      this.catch_.put(var1, var2);
   }

   public void break_(rhN_2 var1) {
      if (this.volatile_ || !this.implements_.isEmpty() || !this.finally_.isEmpty()) {
         HashMap var2 = Maps.newHashMap();
         LinkedHashSet var3 = Sets.newLinkedHashSet();
         LinkedHashSet var4 = Sets.newLinkedHashSet();

         for (OT var6 : this.finally_) {
            if (this.private_.contains(var6)) {
               var2.put(var6.private_(), this.catch_.get(var6));
            }
         }

         for (OT var8 : this.implements_) {
            if (this.private_.contains(var8)) {
               var3.add(var8);
            } else {
               var4.add(var8.private_());
            }
         }

         if (this.volatile_ || !var2.isEmpty() || !var3.isEmpty() || !var4.isEmpty()) {
            var1.class_.class_(new rZI(this.volatile_, var3, var4, var2));
            this.implements_.clear();
            this.finally_.clear();
         }
      }

      this.volatile_ = false;
   }

   public boolean break_(OT var1, String var2) {
      boolean var3 = false;
      Oj_1 var4 = this.break_(var1);
      if (var4.break_(var2)) {
         this.byte_(var1);
         this.finally_.add(var1);
         var3 = true;
      }

      if (!var4.break_()) {
         this.throws_(var1);
      }

      return var3;
   }

   public Oj_1 break_(OT var1) {
      Oj_1 var2 = this.catch_.get(var1);
      if (var2 == null) {
         var2 = new Oj_1();
         this.class_(var1, var2);
      }

      return var2;
   }

   private void break_(Of_1 var1) {
      for (OT var3 : var1.class_()) {
         this.byte_(var3);
      }
   }

   public void break_() {
      HashMap var1 = Maps.newHashMap();

      for (Entry var3 : this.catch_.entrySet()) {
         Oj_1 var4 = (Oj_1)var3.getValue();
         if (var4.break_()) {
            var1.put(((OT)var3.getKey()).private_(), var4);
         }
      }

      if (this.case_.getParentFile() != null) {
         this.case_.getParentFile().mkdirs();
      }

      JsonElement var12 = break_.toJsonTree(var1);
      var12.getAsJsonObject().addProperty("DataVersion", rqu_3.class_().getWorldVersion());

      try (
         FileOutputStream var13 = new FileOutputStream(this.case_);
         OutputStreamWriter var14 = new OutputStreamWriter(var13, Charsets.UTF_8.newEncoder());
      ) {
         break_.toJson(var12, var14);
      } catch (IOException var11) {
         class_.error("Couldn't save player advancements to {}", this.case_, var11);
      }
   }

   private void throws_(OT var1) {
      boolean var2 = this.case_(var1);
      boolean var3 = this.private_.contains(var1);
      if (var2 && !var3) {
         this.private_.add(var1);
         this.implements_.add(var1);
         if (this.catch_.containsKey(var1)) {
            this.finally_.add(var1);
         }
      } else if (!var2 && var3) {
         this.private_.remove(var1);
         this.implements_.add(var1);
      }

      if (var2 != var3 && var1.break_() != null) {
         this.throws_(var1.break_());
      }

      for (OT var5 : var1.throws_()) {
         this.throws_(var5);
      }
   }

   private boolean catch_(OT var1) {
      Oj_1 var2 = this.break_(var1);
      if (var2.class_()) {
         return true;
      } else {
         for (OT var4 : var1.throws_()) {
            if (this.catch_(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean case_(OT var1) {
      for (int var2 = 0; var1 != null && var2 <= 2; var2++) {
         if (var2 == 0 && this.catch_(var1)) {
            return true;
         }

         if (var1.byte_() == null) {
            return false;
         }

         Oj_1 var3 = this.break_(var1);
         if (var3.class_()) {
            return true;
         }

         if (var1.byte_().finally_()) {
            return false;
         }

         var1 = var1.break_();
      }

      return false;
   }

   private void protected_(OT var1) {
      Oj_1 var2 = this.break_(var1);

      for (Entry var4 : var1.case_().entrySet()) {
         OD var5 = var2.byte_((String)var4.getKey());
         if (var5 != null && (var5.class_() || var2.class_())) {
            hr_3 var6 = ((OK)var4.getValue()).class_();
            if (var6 != null) {
               hP_2 var7 = Oo_1.class_(var6.class_());
               if (var7 != null) {
                  var7.break_(this, new hB_2<>(var6, var1, (String)var4.getKey()));
               }
            }
         }
      }
   }

   private void protected_(Of_1 var1) {
      if (this.case_.isFile()) {
         try {
            JsonReader var2 = new JsonReader(new StringReader(Files.toString(this.case_, StandardCharsets.UTF_8)));

            try {
               var2.setLenient(false);
               Dynamic var3 = new Dynamic(JsonOps.INSTANCE, Streams.parse(var2));
               if (!var3.get("DataVersion").asNumber().result().isPresent()) {
                  var3 = var3.set("DataVersion", var3.createInt(1343));
               }

               var3 = this.protected_.update(rTv_1.ADVANCEMENTS.class_(), var3, var3.get("DataVersion").asInt(0), rqu_3.class_().getWorldVersion());
               var3 = var3.remove("DataVersion");
               Map var4 = (Map)break_.getAdapter(byte_).fromJsonTree((JsonElement)var3.getValue());
               if (var4 == null) {
                  throw new JsonParseException("Found null for advancements");
               }

               Stream var5 = var4.entrySet().stream().sorted(Comparator.comparing(Entry::getValue));

               for (Entry var7 : (List)var5.collect(Collectors.toList())) {
                  OT var8 = var1.class_((rqO_2)var7.getKey());
                  if (var8 == null) {
                     class_.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", var7.getKey(), this.case_);
                  } else {
                     this.class_(var8, (Oj_1)var7.getValue());
                  }
               }
            } catch (Throwable var10) {
               try {
                  var2.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            var2.close();
         } catch (JsonParseException var11) {
            class_.error("Couldn't parse player advancements in {}", this.case_, var11);
         } catch (IOException var12) {
            class_.error("Couldn't access player advancements in {}", this.case_, var12);
         }
      }

      this.byte_(var1);
      this.byte_();
      this.break_(var1);
   }
}
