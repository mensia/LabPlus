
package com.example.labo.Service;

import com.example.labo.Entity.User;
import com.example.labo.Repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    @Service
    @Slf4j
public class ServiceUser {

        @Autowired
        UserRepo userRepo;

        public User ajouterClient(User client) {
            return userRepo.save(client);
        }
//
//        @Override
//        public void ajouterCuisinier(Cuisinier cuisinier) {
//            cuisinierRepository.save(cuisinier);
//
//        }
//
//        @Override
//        public void ajouterPlatAffecterClientEtCuisinier(Plat plat, Integer idClient, Integer idCuisinier) {
//            Client client = clientRepository.findById(idClient).get();
//            Cuisinier cuisinier = cuisinierRepository.findById(idCuisinier).get();
//
//            plat.setClient(client);
//
//            if (plat.getCuisinierSet() == null) {
//                Set<Cuisinier> cuisiniers = new HashSet<>();
//                cuisiniers.add(cuisinier);
//
//                plat.setCuisinierSet(cuisiniers);
//            } else
//                plat.getCuisinierSet().add(cuisinier);
//
//            platRepository.save(plat);
//        }
//
//        @Override
//        public List<Plat> AfficherListPlatParClient(String nom, String prenom) {
//            Client client = clientRepository.getClientByNomAndPrenom(nom, prenom);
//
//            return new ArrayList<>(client.getPlatSet());
//
//        }
//
//        @Override
//        public float MontantAPayerParClient(Integer idCLient) {
//            Client client = clientRepository.findById(idCLient).get();
//            float sum = 0;
//
//            for (Plat p : client.getPlatSet()) {
//                sum += p.getPrix();
//            }
//
//            return sum;
//        }
//
//        @Override
//        public void ModifierImc(Integer idClient) {
//            Client client = clientRepository.findById(idClient).get();
//            float sum = 0;
//
//            for (Plat p : client.getPlatSet()) {
//                sum += p.getCalories();
//            }
//
//            Imc imc;
//            if (sum > 2000)
//                imc = Imc.FORT;
//            else if (sum == 2000)
//                imc = Imc.IDEAL;
//            else
//                imc = Imc.FAIBLE;
//
//            client.setImc(imc);
//
//            clientRepository.save(client);
//        }
//
//        @Scheduled(cron = "*/15 * * * * *")
//        @Override
//        public void AfficherListCuisinier() {
//            List<Cuisinier> cuisiniers = cuisinierRepository.findAll();
//            List<Cuisinier> cuisiniersAfficher = new ArrayList<>();
//
//            cuisiniers.forEach(cuisinier -> {
//                int counter = 0;
//
//                for (Plat p : cuisinier.getPlatSet()) {
//                    if (p.getCategorie() == Categorie.PRINCIPAL) {
//                        counter++;
//                    }
//                }
//
//                if (counter >= 2)
//                    log.info("Cuisinier avec " + counter + " Plat Principal: " + cuisinier.getNom());
////                cuisiniersAfficher.add(cuisinier);
//
//            });
//
//
//        }
//    }
}





