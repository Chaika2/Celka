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
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = new GsonBuilder()
      .registerTypeAdapter(Oj_1.class, new OV())
      .registerTypeAdapter(rqO_2.class, new rqh_3())
      .setPrettyPrinting()
      .create();
   private static final TypeToken<Map<rqO_2, Oj_1>> id_byte = new hE_2();
   private final DataFixer id_protected;
   private final rCr_1 id_throws;
   private final File id_case;
   private final Map<OT, Oj_1> id_catch = Maps.newLinkedHashMap();
   private final Set<OT> id_private = Sets.newLinkedHashSet();
   private final Set<OT> id_implements = Sets.newLinkedHashSet();
   private final Set<OT> id_finally = Sets.newLinkedHashSet();
   private rhN_2 id_extends;
   private OT id_native;
   private boolean id_volatile = true;

   private void id_byte() {
      ArrayList var1 = Lists.newArrayList();

      for (Entry var3 : this.id_catch.entrySet()) {
         if (((Oj_1)var3.getValue()).id_class()) {
            var1.add((OT)var3.getKey());
            this.id_finally.add((OT)var3.getKey());
         }
      }

      for (OT var5 : var1) {
         this.id_throws(var5);
      }
   }

   private void id_byte(OT var1) {
      Oj_1 var2 = this.id_break(var1);
      if (!var2.id_class()) {
         for (Entry var4 : var1.id_case().entrySet()) {
            OD var5 = var2.id_byte((String)var4.getKey());
            if (var5 != null && !var5.id_class()) {
               hr_3 var6 = ((OK)var4.getValue()).id_class();
               if (var6 != null) {
                  hP_2 var7 = Oo_1.id_class(var6.id_class());
                  if (var7 != null) {
                     var7.id_class(this, new hB_2<>(var6, var1, (String)var4.getKey()));
                  }
               }
            }
         }
      }
   }

   private void id_byte(Of_1 var1) {
      for (OT var3 : var1.id_class()) {
         if (var3.id_case().isEmpty()) {
            this.id_class(var3, "");
            var3.id_protected().id_class(this.id_extends);
         }
      }
   }

   public hs_3(DataFixer var1, rCr_1 var2, Of_1 var3, File var4, rhN_2 var5) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var4;
      this.id_extends = var5;
      this.id_protected(var3);
   }

   public void id_class() {
      for (hP_2 var2 : Oo_1.id_class()) {
         var2.id_class(this);
      }
   }

   public void id_class(OT var1) {
      OT var2 = this.id_native;
      if (var1 != null && var1.id_break() == null && var1.id_byte() != null) {
         this.id_native = var1;
      } else {
         this.id_native = null;
      }

      if (var2 != this.id_native) {
         this.id_extends.id_class.id_class(new rFS(this.id_native == null ? null : this.id_native.id_private()));
      }
   }

   public void id_class(rhN_2 var1) {
      this.id_extends = var1;
   }

   public boolean id_class(OT var1, String var2) {
      boolean var3 = false;
      Oj_1 var4 = this.id_break(var1);
      boolean var5 = var4.id_class();
      if (var4.id_class(var2)) {
         this.id_protected(var1);
         this.id_finally.add(var1);
         var3 = true;
         if (!var5 && var4.id_class()) {
            var1.id_protected().id_class(this.id_extends);
            if (var1.id_byte() != null && var1.id_byte().id_implements() && ((rYB)this.id_extends.id_throws[7]).B().id_break(rRu_1.id_return)) {
               this.id_throws
                  .id_class(
                     new rgn_3("chat.type.advancement." + var1.id_byte().id_throws().id_class(), this.id_extends.L_(), var1.id_finally()),
                     rVU.SYSTEM,
                     rqR_2.id_break
                  );
            }
         }
      }

      if (var4.id_class()) {
         this.id_throws(var1);
      }

      return var3;
   }

   public void id_class(Of_1 var1) {
      this.id_class();
      this.id_catch.clear();
      this.id_private.clear();
      this.id_implements.clear();
      this.id_finally.clear();
      this.id_volatile = true;
      this.id_native = null;
      this.id_protected(var1);
   }

   private void id_class(OT var1, Oj_1 var2) {
      var2.id_class(var1.id_case(), var1.id_implements());
      this.id_catch.put(var1, var2);
   }

   public void id_break(rhN_2 var1) {
      if (this.id_volatile || !this.id_implements.isEmpty() || !this.id_finally.isEmpty()) {
         HashMap var2 = Maps.newHashMap();
         LinkedHashSet var3 = Sets.newLinkedHashSet();
         LinkedHashSet var4 = Sets.newLinkedHashSet();

         for (OT var6 : this.id_finally) {
            if (this.id_private.contains(var6)) {
               var2.put(var6.id_private(), this.id_catch.get(var6));
            }
         }

         for (OT var8 : this.id_implements) {
            if (this.id_private.contains(var8)) {
               var3.add(var8);
            } else {
               var4.add(var8.id_private());
            }
         }

         if (this.id_volatile || !var2.isEmpty() || !var3.isEmpty() || !var4.isEmpty()) {
            var1.id_class.id_class(new rZI(this.id_volatile, var3, var4, var2));
            this.id_implements.clear();
            this.id_finally.clear();
         }
      }

      this.id_volatile = false;
   }

   public boolean id_break(OT var1, String var2) {
      boolean var3 = false;
      Oj_1 var4 = this.id_break(var1);
      if (var4.id_break(var2)) {
         this.id_byte(var1);
         this.id_finally.add(var1);
         var3 = true;
      }

      if (!var4.id_break()) {
         this.id_throws(var1);
      }

      return var3;
   }

   public Oj_1 id_break(OT var1) {
      Oj_1 var2 = this.id_catch.get(var1);
      if (var2 == null) {
         var2 = new Oj_1();
         this.id_class(var1, var2);
      }

      return var2;
   }

   private void id_break(Of_1 var1) {
      for (OT var3 : var1.id_class()) {
         this.id_byte(var3);
      }
   }

   public void id_break() {
      HashMap var1 = Maps.newHashMap();

      for (Entry var3 : this.id_catch.entrySet()) {
         Oj_1 var4 = (Oj_1)var3.getValue();
         if (var4.id_break()) {
            var1.put(((OT)var3.getKey()).id_private(), var4);
         }
      }

      if (this.id_case.getParentFile() != null) {
         this.id_case.getParentFile().mkdirs();
      }

      JsonElement var12 = id_break.toJsonTree(var1);
      var12.getAsJsonObject().addProperty("DataVersion", rqu_3.id_class().getWorldVersion());

      try (
         FileOutputStream var13 = new FileOutputStream(this.id_case);
         OutputStreamWriter var14 = new OutputStreamWriter(var13, Charsets.UTF_8.newEncoder());
      ) {
         id_break.toJson(var12, var14);
      } catch (IOException var11) {
         id_class.error("Couldn't save player advancements to {}", this.id_case, var11);
      }
   }

   private void id_throws(OT var1) {
      boolean var2 = this.id_case(var1);
      boolean var3 = this.id_private.contains(var1);
      if (var2 && !var3) {
         this.id_private.add(var1);
         this.id_implements.add(var1);
         if (this.id_catch.containsKey(var1)) {
            this.id_finally.add(var1);
         }
      } else if (!var2 && var3) {
         this.id_private.remove(var1);
         this.id_implements.add(var1);
      }

      if (var2 != var3 && var1.id_break() != null) {
         this.id_throws(var1.id_break());
      }

      for (OT var5 : var1.id_throws()) {
         this.id_throws(var5);
      }
   }

   private boolean id_catch(OT var1) {
      Oj_1 var2 = this.id_break(var1);
      if (var2.id_class()) {
         return true;
      } else {
         for (OT var4 : var1.id_throws()) {
            if (this.id_catch(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean id_case(OT var1) {
      for (int var2 = 0; var1 != null && var2 <= 2; var2++) {
         if (var2 == 0 && this.id_catch(var1)) {
            return true;
         }

         if (var1.id_byte() == null) {
            return false;
         }

         Oj_1 var3 = this.id_break(var1);
         if (var3.id_class()) {
            return true;
         }

         if (var1.id_byte().id_finally()) {
            return false;
         }

         var1 = var1.id_break();
      }

      return false;
   }

   private void id_protected(OT var1) {
      Oj_1 var2 = this.id_break(var1);

      for (Entry var4 : var1.id_case().entrySet()) {
         OD var5 = var2.id_byte((String)var4.getKey());
         if (var5 != null && (var5.id_class() || var2.id_class())) {
            hr_3 var6 = ((OK)var4.getValue()).id_class();
            if (var6 != null) {
               hP_2 var7 = Oo_1.id_class(var6.id_class());
               if (var7 != null) {
                  var7.id_break(this, new hB_2<>(var6, var1, (String)var4.getKey()));
               }
            }
         }
      }
   }

   private void id_protected(Of_1 var1) {
      if (this.id_case.isFile()) {
         try {
            JsonReader var2 = new JsonReader(new StringReader(Files.toString(this.id_case, StandardCharsets.UTF_8)));

            try {
               var2.setLenient(false);
               Dynamic var3 = new Dynamic(JsonOps.INSTANCE, Streams.parse(var2));
               if (!var3.get("DataVersion").asNumber().result().isPresent()) {
                  var3 = var3.set("DataVersion", var3.createInt(1343));
               }

               var3 = this.id_protected.update(rTv_1.ADVANCEMENTS.id_class(), var3, var3.get("DataVersion").asInt(0), rqu_3.id_class().getWorldVersion());
               var3 = var3.remove("DataVersion");
               Map var4 = (Map)id_break.getAdapter(id_byte).fromJsonTree((JsonElement)var3.getValue());
               if (var4 == null) {
                  throw new JsonParseException("Found null for advancements");
               }

               Stream var5 = var4.entrySet().stream().sorted(Comparator.comparing(Entry::getValue));

               for (Entry var7 : (List)var5.collect(Collectors.toList())) {
                  OT var8 = var1.id_class((rqO_2)var7.getKey());
                  if (var8 == null) {
                     id_class.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", var7.getKey(), this.id_case);
                  } else {
                     this.id_class(var8, (Oj_1)var7.getValue());
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
            id_class.error("Couldn't parse player advancements in {}", this.id_case, var11);
         } catch (IOException var12) {
            id_class.error("Couldn't access player advancements in {}", this.id_case, var12);
         }
      }

      this.id_byte(var1);
      this.id_byte();
      this.id_break(var1);
   }
}
