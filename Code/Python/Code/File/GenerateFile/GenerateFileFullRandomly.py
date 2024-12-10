import random

class WriterFileFullRandomly:


    def __init__(self, count, random_burt_time, random_arival_time, link_file):
        self.count = count
        self.link_file = link_file
        self.random_burt_time = random_burt_time
        self.random_arival_time = random_arival_time

    def create_file(self):
        try:
            with open(self.link_file, 'w') as bw:
                bw.write(f"{self.count}\n")
                for _ in range(self.count):
                    n = random.randint(0, self.random_arival_time - 1)
                    bw.write(f"{n}")
                    n = random.randint(0, self.random_burt_time - 1)
                    bw.write(f" {n}\n")
        except Exception as ex:
            print("Error in : {Writer File Full Randomly}")

