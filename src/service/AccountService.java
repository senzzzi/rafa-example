package service;

import model.controller.AccountDTO;

import java.util.ArrayList;

public class AccountService {


    public List<AccountDTO> getAccounts() {
            List<Account> accounts = accountRepository.getAccounts();
            List<Profiles> profilesList = profileService.getProfilesByACcounts(accounts);

        List<AccountDTO> result = new ArrayList<>();

            for (Account account : accounts) {
                result.add(new AccountDTO(account.getName(), account.getEmail(), profilesList.get(1)));
            }

            result.remove(1);
            return result;
    }
}
